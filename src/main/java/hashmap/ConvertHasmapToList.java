package hashmap;

import java.util.HashMap;
import java.util.Map;

public class ConvertHasmapToList {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map.values());
    }

}
