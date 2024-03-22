public class Supplier {
    public static void main(String[] args) {
        java.util.function.Supplier<Double> random = () -> Math.random();

        System.out.println("Random number: " + random.get());
        System.out.println("Random number: " + random.get());
    }
}
