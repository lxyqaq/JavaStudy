package exercise2;

/**
 * @ClassName GeometricTest
 * @Description Geometric测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 18:21
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("red", 1.0, 5);
        Circle c2 = new Circle("red", 1.0, 2);
        System.out.println(test.equalsArea(c1, c2));
        System.out.println("c1和c2的面积为：");
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

        System.out.println("************************************");

        MyRectangle r1 = new MyRectangle("blue", 2.0, 3, 4);
        MyRectangle r2 = new MyRectangle("blue", 2.0, 4, 3);
        System.out.println(test.equalsArea(r1, r2));
        System.out.println("r1和r2的面积为：");
        test.displayGeometricObject(r1);
        test.displayGeometricObject(r2);

    }

    /**
     * @param o1,o2
     * @return true:相等 false:不相等
     * @description 测试两个对象的面积是否相等
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/16 18:22
     */
    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
        return o1.findArea() == o2.findArea();
    }

    /**
     * @param o
     * @description 打印出对象的面积
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/16 18:24
     */
    public void displayGeometricObject(GeometricObject o) {
        System.out.println("面积为：" + o.findArea());
    }

}
