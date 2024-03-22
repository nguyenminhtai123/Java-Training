
public class Function {
    public static void main(String[] args) {
        java.util.function.Function<Integer, Integer> square = num -> num * num;

        System.out.println("Square of 5: " + square.apply(5)); // Output: Square of 5: 25
        System.out.println("Square of -3: " + square.apply(-3)); // Output: Square of -3: 9
    }
}
