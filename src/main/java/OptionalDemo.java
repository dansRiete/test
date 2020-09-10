import java.util.*;

public class OptionalDemo {

    static Optional<Integer> findById(int a) {
        return Optional.of(a);
    }

    public static void main(String[] args) {
        /*Set<Integer> ids = Set.of(41,3);
        System.out.println(
            Optional.of(1)
                .filter(ids::contains)
                .flatMap(OptionalDemo::findById)
                .orElseThrow()
        );*/
    }

}
