package TestThread;

public class TestThread {
    public static void main(String[] args) {
        count c = new count();
        // Tạo 2 thread truy cập vào cùng tài nguyên trong 1 đối tượng
        Thread t1 = new Thread(new Access("Thread 1", c));
        Thread t2 = new Thread(new Access("Thread 2", c));
        t1.start();
        t2.start();
    }
}
