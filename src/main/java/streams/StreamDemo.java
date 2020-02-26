package streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo {

    public static Stream<String> add(Stream<String> stream, String str){
        return stream.map(str1 -> str1 + "!$!");
    }

    public static Stream<String> delete(Stream<String> stream, String str){
        return stream.map(str1 -> str1.replace(str, ""));
    }


    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three");
        stream = add(stream, "!");
        stream = delete(stream, "$");
        stream.forEach(System.out::println);
    }
}
