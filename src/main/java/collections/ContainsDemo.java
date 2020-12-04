package collections;

import java.util.List;

public class ContainsDemo {

    public static void main(String[] args) {
        List<Long> longs = List.of(1L, 2L);
        System.out.println(longs.contains((long)1));
    }

}
