package exercise;

import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/8 - 17:23
 */
public class CircleTest {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.print("请输入圆的面积：");
        c1.radius = scan1.nextDouble();

        System.out.println();

        System.out.println("圆的面积为：" + c1.findArea());
    }
}
