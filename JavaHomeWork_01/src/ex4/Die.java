package ex4;

public class Die {
    int Value;

    public Die(int v) {
        this.Value = v;
    }

    /**
     * @description which randomly changes the die’s value
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/9/21 00:51
     */
    public void roll() {
        double res = Math.random();
        Value = 1 + (int) (res * 1000) % 6;
    }

    public int getValue() {
        return Value;
    }
}


