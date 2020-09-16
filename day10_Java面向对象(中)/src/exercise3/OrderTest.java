package exercise3;

import java.util.Objects;

/**
 * @ClassName OrderTest
 * @Description equals方法重写的练习
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 22:43
 * @Version 1.0
 */
public class OrderTest {
    /*
     * 编写Order类，有int型的orderId，String型的orderName，
     * 相应的getter()和setter()方法，两个参数的构造器，
     * 重写父类的equals()方法：public boolean equals(Object obj)，
     * 并判断测试类中创建的两个对象是否相等。
     */
    public static void main(String[] args) {
        Order order1 = new Order(1001, "qqq");
        Order order2 = new Order(1001, new String("www"));
        //返回false
        System.out.println(order1.equals(order2));

        Order order3 = new Order(1001, "www");
        //返回true
        System.out.println(order2.equals(order3));
    }
}

class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId &&
                Objects.equals(orderName, order.orderName);
    }

}