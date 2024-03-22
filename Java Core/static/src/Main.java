public class Main {
    public static void main(String[] args) {
        whenNumberOfCarObjectsInitialized_thenStaticCounterIncreases();
    }

    public static void whenNumberOfCarObjectsInitialized_thenStaticCounterIncreases() {
//        new Car("Jaguar", "V8");
//        new Car("Bugatti", "W16");
//        Car.setNumberOfCars(3);
        System.out.println("The number of cars: " + Car.getNumberOfCars());
        new Car("Jaguar", "V8");
        System.out.println("The number of cars: " + Car.getNumberOfCars());
        new Car("Bugatti", "W16");
        System.out.println("The number of cars: " + Car.getNumberOfCars());


        assertEquals(3, Car.numberOfCars);
    }

    private static void assertEquals(int i, int numberOfCars) {
        if (i == numberOfCars) {
            System.out.println("TRUE");
        } else  {
            System.out.println("NO");
        }
    }
}
