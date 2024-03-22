public class Checked {
    public static void main(String[] args) {
        printArray();
    }

    private static void printArray() throws ArrayIndexOutOfBoundsException {
        int[] array = new int[1];
        System.out.println(array[1]);
    }
}
