package exercise;

import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/8 - 17:41
 */

/*
 * 3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
 * 3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再计算该矩形的面积，
 * 并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 *
 * 3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的*型矩形，
 * 并计算该矩形的面积， 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.print("请输入矩形的长度：");
        r1.length = scan.nextDouble();
        System.out.print("请输入矩形的宽度：");
        r1.width = scan.nextDouble();

        System.out.println("矩形的面积为：" + r1.method());

        double area1 = r1.method1(r1.length, r1.width);
        System.out.println("面积为：" + area1);
    }
}

class Rectangle {
    public double length;
    public double width;

    public double method() {
        return length * width;
    }

    public double method1(double m, double n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;

    }
}