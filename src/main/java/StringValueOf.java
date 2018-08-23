import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.Objects;

public class StringValueOf {
    public static void main(String[] args) {
        /*String testString = "Report_name()";
//        System.out.println(testString.substring(testString.indexOf("(")));
        Integer number = Integer.valueOf(
                testString.substring(
                        testString.indexOf("(") + 1,
                        testString.indexOf(")")
                )
        );*/
//        System.out.println(testString.replace(String.valueOf(number), Integer.toString(++number)));
        System.out.println(StringUtils.isBlank(null));
    }
}
