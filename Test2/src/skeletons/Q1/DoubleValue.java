package skeletons.Q1;

class DoubleValue {
    private int value1;
    private int value2;

    public DoubleValue(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int readValue1(){
        return value1;
    }

    public int readValue2(){
        return value2;
    }


    public void stepValue1() {
        value1 += 1;
    }

    public void stepValue2() {
        value2 += 1;
    }

    public int addValues() {
        return value1 + value2;
    }

    public void setValue1(int v) {
        this.value1 = v;
    }
}
