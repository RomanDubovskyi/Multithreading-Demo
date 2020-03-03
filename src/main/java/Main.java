import model.Counter;
import threads.FirstThread;
import threads.SecondThread;

public class Main {
    public static void main(String[] args) {
        Counter object = new Counter();
        Thread first = new Thread(new FirstThread(object));
        SecondThread second = new SecondThread(object);
        second.start();
        first.start();
    }
}
