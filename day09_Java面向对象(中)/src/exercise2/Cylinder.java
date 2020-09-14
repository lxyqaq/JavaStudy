package exercise2;

/**
 * @ClassName Cylinder
 * @Description 圆柱类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/14 19:01
 * @Version 1.0
 */
public class Cylinder extends Circle {
    //圆柱的高
    public double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return findArea() * length;
    }
}
