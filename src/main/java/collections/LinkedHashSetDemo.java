package collections;

import java.util.Set;

import com.google.common.collect.ImmutableCollection;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        System.out.println(Set.of(30000001, 30004001));
        System.out.println(Set.of(30004001, 30000001));
    }

}
