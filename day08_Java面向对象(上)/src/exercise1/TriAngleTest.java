package exercise1;

import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/10 - 23:23
 */
public class TriAngleTest {
    /*
     * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访问私有变量。
     * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入底边：");
        double value1 = scanner.nextDouble();
        System.out.println("请输入高：");
        double value2 = scanner.nextDouble();

        TriAngle t = new TriAngle(value1,value2);
        System.out.println("面积为："+t.getArea());

    /*
     *   TriAngle t = new TriAngle();

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入三角形的底边：");
        double value1 = scanner.nextDouble();
        t.setBase(value1);

        System.out.print("请输入三角形的高：");
        double value2 = scanner.nextDouble();
        t.setHeight(value2);

        System.out.println("三角形的面积为：" + t.getArea());
    *
    * */

    }
}

class TriAngle {
    //底边长
    private double base;
    //高
    private double height;

    public TriAngle() {

    }

    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getArea() {
        return (getBase() * getHeight()) / 2;
    }
}