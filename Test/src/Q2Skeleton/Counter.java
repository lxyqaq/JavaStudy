package Q2Skeleton;

public class Counter {
    protected int value;

    public Counter(int v) {
        value = v;
    }

    public boolean decrement() {
        if (value > 0) {
            this.value--;
            return true;
        } else return false;
    }

    public int readValue() {
        return value;
    }

    public void print_details() {
        System.out.println("Counter Details:");
        System.out.println("Value: " + value);
    }
}