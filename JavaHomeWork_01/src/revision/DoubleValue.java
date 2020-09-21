package revision;

/**
 * @ClassName DoubleValue
 * @Description doublevalue
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/21 12:34
 * @Version 1.0
 */
public class DoubleValue {
    private int value1;
    private int value2;

    public DoubleValue(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void stepValue1() {
        value1++;
    }

    public void stepValue2() {
        value2++;
    }

    public int readValue1() {
        return value1;
    }

    public int readValue2() {
        return value2;
    }

    public int addValues() {
        return value1 + value2;
    }

    public void setValue1(int v) {
        this.value1 = v;
    }

}
