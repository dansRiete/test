package jdbi;

import h2InMemory.H2InMemory;
import jdbi.model.Contact;
import jdbi.model.Phone;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class JdbiJoinDemo {

    private static final String SELECT_ALL = "select contact.id c_id, name c_name, "
            + "phone.id p_id, type p_type, phone.phone p_phone "
            + "from contact left join phone on contact.id = phone.contact_id "
            + "order by c_name, p_type ";

    private static final String SELECT_ONE = SELECT_ALL + "where phones.id = :id";

    private static void populateDatabase(Connection connection) throws SQLException {
        try (Statement stmt = connection.createStatement()){
            stmt.execute("CREATE TABLE CONTACT(id int primary key, name varchar(255))");
            stmt.execute("INSERT INTO CONTACT(id, name) VALUES(1, 'Alex')");
            stmt.execute("CREATE TABLE PHONE(id int primary key, contact_id int, type varchar(255), phone varchar(255))");
            stmt.execute("INSERT INTO PHONE(id, contact_id, type, phone) VALUES(1, 1, 'HOME', '+380372571564')");
            stmt.execute("INSERT INTO PHONE(id, contact_id, type, phone) VALUES(2, 1, 'MOBILE', '+380509482085')");
        }
    }

    public static void main(String[] args) throws Exception {
        try (Connection connection = H2InMemory.getDBConnection()) {
            Jdbi jdbi = Jdbi.create(connection);
            populateDatabase(connection);
            try (Handle handle = jdbi.open()) {
                List<Contact> contacts = joinUsingHashMap(handle);
                System.out.println(contacts);
            }
        }
    }

    /**
     * The fastest way at the expense of verbosity
     */
    private static List<Contact> joinUsingHashMap(Handle handle) {

        return new ArrayList<>(
                handle.createQuery(SELECT_ALL).reduceResultSet(
                    new LinkedHashMap<Long, Contact>(), (acc, resultSet, ctx) -> {
                        long contactId = resultSet.getLong("c_id");
                        Contact contact;
                        if (acc.containsKey(contactId)) {
                            contact = acc.get(contactId);
                        } else {
                            contact = new Contact();
                            acc.put(contactId, contact);
                            contact.setId(contactId);
                            contact.setName(resultSet.getString("c_name"));
                        }

                        long phoneId = resultSet.getLong("p_id");
                        if (!resultSet.wasNull()) {
                            Phone phone = new Phone();
                            phone.setId(phoneId);
                            phone.setType(resultSet.getString("p_type"));
                            phone.setPhone(resultSet.getString("p_phone"));
                            contact.addPhone(phone);
                        }
                        return acc;
                    }
                ).values()
        );
    }
}
