package skeletons.Q2;

class SingleValue {
    protected int value1;

    public SingleValue(int v) {
        value1 = v;
    }

    public void increment() {
        value1++;
    }

    public int readValue1() {
        return value1;
    }

    public void print_details() {
        System.out.println("Class Details:");
        System.out.println("Value1: " + value1);
    }
}