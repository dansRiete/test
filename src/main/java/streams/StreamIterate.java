package streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamIterate {

    public static void main(String[] args) {
        List<String> stringList = List.of("first", "second", "third");
        Stream.iterate(0, i -> i + 1)
            .peek(System.out::println).findAny();
    }

}
