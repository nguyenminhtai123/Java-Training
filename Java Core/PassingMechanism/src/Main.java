public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        // Instance of class is created
//        CallByValue object = new CallByValue();
//
//        System.out.println("Value of a: " + a
//                + " & b: " + b);
//
//        // Passing variables in the class function
//        object.example(a, b);
//
//        // Displaying values after
//        // calling the function
//        System.out.println("Value of a: "
//                + a + " & b: " + b);

        // Instance of class is created
        // and value is assigned using constructor
        CallByReference object
                = new CallByReference(10, 20);

        System.out.println("Value of a: " + object.a
                + " & b: " + object.b);

        // Changing values in class function
        object.ChangeValue(object);

        // Displaying values
        // after calling the function
        System.out.println("Value of a: " + object.a
                + " & b: " + object.b);
    }
}