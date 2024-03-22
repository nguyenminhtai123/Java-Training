package SynchronousCallback;

public class A implements OnGeekEventListener{
    @Override
    public void onGeekEvent() {
        System.out.println("Performing callback after synchronous Task");
    }
}
