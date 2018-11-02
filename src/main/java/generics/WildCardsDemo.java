package generics;

import java.util.HashMap;
import java.util.Map;

public class WildCardsDemo {
    public static void main(String[] args) {
        Map<String, ?> map1 = new HashMap<String, String>();
//        Map<String, Object> map2 = new HashMap<String, String>();// FAIL TO COMPILE
    }
}
