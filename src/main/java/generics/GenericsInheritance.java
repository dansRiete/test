package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<>();
        List<?> listUnknowns = new ArrayList<>();
        System.out.println(listStrings.getClass().getCanonicalName());
        System.out.println(listUnknowns.getClass().getCanonicalName());
        System.out.println(listStrings.getClass());
        System.out.println(listUnknowns.getClass());
    }
}
