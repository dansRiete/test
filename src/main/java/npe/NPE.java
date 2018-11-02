package npe;

import java.util.Objects;

public class NPE {
    public static void main(String[] args) {
        String data = null;
        Objects.requireNonNull(data, "Data must not be null");
    }
}
