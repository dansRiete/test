package generics;

public class B extends A {
    public String getMessage() {
        return "Hello from B:" + super.toString();
    }
}
