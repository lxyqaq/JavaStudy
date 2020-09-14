package exercise2;

/**
 * @ClassName CylinderTest
 * @Description 圆柱测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/14 19:10
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(5);
        System.out.println(cylinder.getRadius());

        cylinder.setLength(10);
        System.out.println(cylinder.getLength());

        double area = cylinder.findArea();

        double volume = cylinder.findVolume();

        System.out.println(volume);
    }
}
