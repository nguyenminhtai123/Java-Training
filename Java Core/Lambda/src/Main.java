import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List.of(2, 3, 5, 7).stream() // Lấy ra stream từ List
                .map(num -> num * 2) // Mỗi phần tử sẽ được nhân đôi
                .filter(num -> num < 10) // Chỉ giữ lại các phần tử nhỏ hơn 10
                .forEach(num -> System.out.println(num)); // In ra các phần tử còn lại


    }
}