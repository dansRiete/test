package hashmap;

import java.util.HashMap;
import java.util.Map;

public class IdDemo {
    public static void main(String[] args) {
        Map<Id, String> map = new HashMap<>();
        final Id first = new Id("First");
        final Id second = new Id("Second");
        map.put(first, "First element");
        map.put(second, "First element");
        System.out.println(map.get(first));
    }
}
