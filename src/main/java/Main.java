import model.DemoObject;
import threads.FirstThread;
import threads.SecondThread;

public class Main {
    public static void main(String[] args) {
        DemoObject object = new DemoObject("First test");
        System.out.println("Let the race begin!");
        Thread first = new Thread(new FirstThread(object));
        SecondThread second = new SecondThread(object);
        second.start();
        first.start();
        System.out.println(object);
    }
}
