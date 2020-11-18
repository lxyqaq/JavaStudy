package Solutions;

import Q2Skeleton.Counter;

public class MyCounter extends Counter {
    private int upperLimit;

    public MyCounter(int v, int ul) {
        super(v);
        upperLimit = ul;
    }

    public boolean increment() {
        if (value == upperLimit)
            return false;
        else {
            value++;
            return true;
        }
    }

    public int readLimit() {
        return upperLimit;
    }
}
