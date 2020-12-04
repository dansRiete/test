package streams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class AveragingWithStreams {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Double d = IntStream.range(0, 1000000000).boxed().map(integer -> integer / 3D).mapToDouble(Double::doubleValue).average().orElseThrow();
        System.out.println("Time: " + (System.currentTimeMillis() - start));
        System.out.println(d);
    }

}
