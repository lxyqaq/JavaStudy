package exercise5;

/**
 * @ClassName GeometricObjectTest
 * @Description GeometricObject测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 23:45
 * @Version 1.0
 */
public class GeometricObjectTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(7);

        System.out.println("c1和c2的颜色是否相等：");
        System.out.println(circle1.getColor().equals(circle2.getColor()));
        System.out.println(circle1.toString() + "*****" + circle2.toString());

        Circle circle3 = new Circle("white", 1.0, 8);
        Circle circle4 = new Circle("rea", 1.0, 7);
        System.out.println("c1和c2的颜色是否相等：");
        System.out.println(circle3.getColor().equals(circle4.getColor()));
    }
}
