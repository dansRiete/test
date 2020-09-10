package streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {
        System.out.println(IntStream.range(0, 15).boxed().collect(Collectors.toList()));
        IntStream.range(0, 15).forEach(System.out::println);
    }

}
