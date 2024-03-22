package TestThread;

class count {
    int value = 10;
}

public class Access implements Runnable{
    String name;
    count c;

    public Access(String name, count c) {
        this.name = name;
        this.c = c;
    }

    //Có thể đặt từ khóa synchronized vào đây để xem kết quả sau khi đồng bộ
    public synchronized void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " " + "index " + i + " before: " + c.value);
            c.value--;
            System.out.println(name + " " + "index " + i + " after: " + c.value);
        }
    }
}
