package threads;

import model.DemoObject;

public class SecondThread extends Thread {
    private DemoObject input;

    public SecondThread(DemoObject input) {
        this.input = input;
    }

    public void run() {
        while (input.getCounter() < 100) {
            input.setCounter(input.getCounter() + 1);
            System.out.println("Second thread counter: " + input.getCounter());
        }
    }
}
