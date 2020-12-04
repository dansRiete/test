public class OverloadingDemo {

    public static void foo(Object object){
        System.out.println("Object");
    }

    public static void foo(String string){
        System.out.println("String");
    }

    public static void main(String[] args) {
        Object object = new String("");
        foo(object);
        String a = "#dsfasdf";
        System.out.println(a.split("#")[1]);
    }
}
