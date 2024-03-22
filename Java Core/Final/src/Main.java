public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
         cat = new Cat(12);
        cat.setWeight(15);
//        assertEquals(10, cat.getWeight());
        System.out.println(cat.toString());


    }

    private static void assertEquals(int i, int weight) {
        if (i == weight) {
            System.out.println("TRUE");
        } else {
            System.out.println("NO");
        }
    }
}