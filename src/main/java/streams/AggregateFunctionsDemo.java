package streams;

import java.util.function.Function;
import java.util.stream.Stream;

public class AggregateFunctionsDemo {
    public static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3, null).max(Integer::compareTo).get());
        System.out.println(Stream.of(1, 2, 3, null).mapToInt(Integer::intValue).average().orElse(Double.NaN));
    }
}
