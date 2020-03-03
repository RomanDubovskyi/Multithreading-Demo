package threads;

import model.Counter;

public class SecondThread extends Thread {
    private static final int LIMIT = 100;
    private Counter input;

    public SecondThread(Counter input) {
        this.input = input;
    }

    public void run() {
        while (input.getCounter() < LIMIT) {
            System.out.println("Second thread counter: " + input.count());
        }
    }
}
