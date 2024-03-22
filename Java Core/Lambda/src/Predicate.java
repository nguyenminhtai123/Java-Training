public class Predicate {
    public static void main(String[] args) {
        java.util.function.Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("Is 5 even? " + isEven.test(5)); // Output: Is 5 even? false
        System.out.println("Is 10 even? " + isEven.test(10)); // Output: Is 10 even? true
    }
}
