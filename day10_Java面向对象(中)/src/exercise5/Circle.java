package exercise5;

import java.util.Objects;

/**
 * @ClassName Circle
 * @Description 圆类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 23:37
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        this.color = "white";
        //this.weight = 1.0;
        //this.radius = 1.0;
    }

    public Circle(double radius) {
        this.color = "white";
        this.weight = 1.0;
        this.radius = radius;
    }

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

    /**
     * @return 返回面积的值
     * @description 计算圆面积的方法
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/16 23:43
     */
    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
