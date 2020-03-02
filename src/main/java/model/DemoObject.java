package model;

public class DemoObject {
    private String name;
    private int counter;

    public DemoObject(String name) {
        this.name = name;
        counter = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "DemoObject{" + "name='" + name + '\''
                + ", counter=" + counter + '}';
    }
}
