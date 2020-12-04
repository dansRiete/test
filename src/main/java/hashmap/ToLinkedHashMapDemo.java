package hashmap;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToLinkedHashMapDemo {

    public static void main(String[] args) {
        List<String> list = List.of("sadfasdf", "gfhjfjghj", "ewrtwert", "gfhjfjghj");
        Map<String, Integer> map1 = list.stream().collect(Collectors.toMap(Function.identity(), list::indexOf,
            new BinaryOperator<Integer>() {
                @Override
                public Integer apply(final Integer integer, final Integer integer2) {
                    return integer;
                }
            },
            LinkedHashMap::new));
        Map<String, Integer> map2 = list.stream().collect(Collectors.toMap(Function.identity(), list::indexOf));
        System.out.println(map1);
        System.out.println(map2);
    }

}
