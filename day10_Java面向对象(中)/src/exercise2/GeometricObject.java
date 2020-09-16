package exercise2;

/**
 * @ClassName GeometricObject
 * @Description GeometricObject类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 18:00
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return double类型的值
     * @description 求面积的方法
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/16 18:04
     */
    public double findArea() {
        return 0.0;
    }
}
