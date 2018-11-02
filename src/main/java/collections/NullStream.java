package collections;

import java.util.List;

public class NullStream {
    public static void main(String[] args) {
        List<String> stringList = null;
        stringList.stream();
    }
}
