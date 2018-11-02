package hashmap;

import java.util.Objects;

public class Id {
    final String id;

    public Id(String id) {
        this.id = id;
    }

    @Override public boolean equals(Object o) {
        System.out.println("Id equals()");
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Id id1 = (Id) o;
        return Objects.equals(id, id1.id);
    }

    @Override public int hashCode() {
        System.out.println("Id hashCode()");
        return 1;
    }
}
