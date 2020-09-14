package exercise2;

/**
 * @ClassName Circle
 * @Description 圆类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/14 19:01
 * @Version 1.0
 */
public class Circle {
    //半径
    public double radius;

    public Circle() {
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return 圆的面积的值
     * @description 计算圆的面积的方法
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/14 19:05
     */
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
