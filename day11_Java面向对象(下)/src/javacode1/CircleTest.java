package javacode1;

/**
 * @ClassName CircleTest
 * @Description 小练习
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/17 20:45
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        Circle circle2 = new Circle();

        Circle circle3 = new Circle(3);

        System.out.println("circle1的id是：" + circle1.getId());
        System.out.println("circle2的id是：" + circle2.getId());
        System.out.println("circle3的id是：" + circle3.getId());

        System.out.println("创建圆的个数为："+ Circle.getTotal());
    }
}

class Circle {
    //半径
    private double radius;
    //定义编号
    private int id;

    //记录圆的个数
    private static int total;

    private static int init = 1001;


    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public double findArea() {
        return 3 * radius * radius;
    }
}