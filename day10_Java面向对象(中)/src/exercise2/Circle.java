package exercise2;

/**
 * @ClassName Circle
 * @Description Circle类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 18:17
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
