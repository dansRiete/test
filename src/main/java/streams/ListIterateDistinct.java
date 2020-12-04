package streams;

import java.util.List;
import java.util.Objects;

import org.eclipse.collections.api.block.HashingStrategy;
import org.eclipse.collections.api.block.function.Function;
import org.eclipse.collections.impl.block.factory.HashingStrategies;
import org.eclipse.collections.impl.utility.ListIterate;

public class ListIterateDistinct {

    private static List<Model> list = List.of(
        new Model(AnEnum.FIRST, "78", 5),
        new Model(AnEnum.SECOND, "7", 8),
        new Model(AnEnum.FIRST, "78", 9)
    );

    public static void main(String[] args) {
        System.out.println(
            ListIterate.distinct(list, HashingStrategies.fromFunction(
                (Function<Model, List<Object>>) model -> List.of(model.getA(), model.getB())
            ))
        );
    }

    private enum AnEnum {
        FIRST, SECOND, THIRD
    }

    private static class Model {
        AnEnum a;
        String b;
        Integer c;

        public Model(final AnEnum a, final String b, final Integer c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public AnEnum getA() {
            return a;
        }

        public void setA(final AnEnum a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(final String b) {
            this.b = b;
        }

        public Integer getC() {
            return c;
        }

        public void setC(final Integer c) {
            this.c = c;
        }

        @Override
        public String toString() {
            return "Model{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
        }
    }

}
