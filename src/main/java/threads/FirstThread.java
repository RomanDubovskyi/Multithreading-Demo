package threads;

import model.Counter;

public class FirstThread implements Runnable {
    private static final int LIMIT = 100;
    private Counter input;

    public FirstThread(Counter input) {
        this.input = input;
    }

    public void run() {
        while (input.getCounter() < LIMIT) {
            System.out.println("First thread counter: " + input.count());
        }
    }
}
