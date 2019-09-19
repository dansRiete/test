package jdbi.model;

import com.google.common.base.MoreObjects;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    Long id;
    String name;
    List<Phone> phones = new ArrayList<>();

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("phones", phones)
                .toString();
    }
}
