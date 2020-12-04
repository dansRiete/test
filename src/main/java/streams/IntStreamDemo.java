package streams;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {
        System.out.println(IntStream.range(0, 15).boxed().collect(Collectors.toList()));
        IntStream.range(0, 15).forEach(System.out::println);
        System.out.println(IntStream.range(0, 5).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }

}
