public class Consumer {
    public static void main(String[] args) {
        java.util.function.Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

        printUpperCase.accept("hello"); // Output: HELLO
        printUpperCase.accept("world"); // Output: WORLD
    }
}
