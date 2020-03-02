import model.DemoObject;
import threads.FirstThread;
import threads.SecondThread;

public class Main {
    public static void main(String[] args) {
        DemoObject object = new DemoObject("First test");
        System.out.println("Let the race begin!");
        FirstThread first = new FirstThread(object);
        SecondThread second = new SecondThread(object);
        second.start();
        first.run();
        System.out.println(object);
    }
}
