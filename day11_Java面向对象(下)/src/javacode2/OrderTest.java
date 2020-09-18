package javacode2;

/**
 * @ClassName OrderTest
 * @Description 属性赋值的问题
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/18 18:34
 * @Version 1.0
 */
public class OrderTest {
    /*
     * 对属性可以赋值的位置：
     * ①默认初始化
     * ②显式初始化/⑤在代码块中赋值
     * ③构造器中初始化
     * ④有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
     *
     *
     * 执行的先后顺序：① - ② / ⑤ - ③ - ④
     */
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order {


    int orderId = 3;

    {
        orderId = 4;
    }

    public Order(){
        orderId = 5;
    }

}