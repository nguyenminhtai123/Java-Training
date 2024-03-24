interface EnumInterface {
    int calculate(int first, int second);
}
enum EnumClassOperator implements EnumInterface { // An Enum implements an interface
    ADD {
        @Override
        public int calculate(int first, int second) {
            return first + second;
        }
    },
    SUBTRACT {
        @Override
        public int calculate(int first, int second) {
            return first - second;
        }
    };
}
class Operation {
    private int first, second;
    private EnumClassOperator operator;
    public Operation(int first, int second, EnumClassOperator operator) {
        this.first = first;
        this.second = second;
        this.operator = operator;
    }
    public int calculate() {
        return operator.calculate(first, second);
    }
}
// Main Class
public class EnumTest {
    public static void main (String [] args) {
        Operation add = new Operation(20, 10, EnumClassOperator.ADD);
        Operation subtract = new Operation(20, 10, EnumClassOperator.SUBTRACT);
        System.out.println("Addition: " + add.calculate());
        System.out.println("Subtraction: " + subtract.calculate());
    }
}