package q3;

class Die {
    private int value;

    public Die(int v) {
        value = v;
    }

    public void roll() {
        double res = Math.random();
        value = 1 + (int) (res * 1000) % 6;
    }

    public int getValue() {
        return value;
    }
}

