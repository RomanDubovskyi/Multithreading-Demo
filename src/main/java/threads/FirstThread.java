package threads;

import model.DemoObject;

public class FirstThread implements Runnable {
    private DemoObject input;

    public FirstThread(DemoObject input) {
        this.input = input;
    }

    public void run() {
        while (input.getCounter() < 100) {
            input.setCounter(input.getCounter() + 1);
            System.out.println("First thread counter: " + input.getCounter());
        }
    }
}
