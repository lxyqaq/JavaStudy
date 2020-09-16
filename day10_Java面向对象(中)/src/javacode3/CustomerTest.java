package javacode3;

import java.util.Date;

/**
 * @ClassName CustomerTest
 * @Description toString()方法的使用
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 23:23
 * @Version 1.0
 */
public class CustomerTest {
    /*
     * Object类中toString()的使用：
     *
     * 1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
     *
     * 2. Object类中toString()的定义：
     *   public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
         }
     *
     * 3. 像String、Date、File、包装类等都重写了Object类中的toString()方法。
     *    使得在调用对象的toString()时，返回"实体内容"信息
     *
     * 4. 自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"
     */
    public static void main(String[] args) {
        Customer customer1 = new Customer("tom", 101);
        //重写了对象的toString方法后输出的是>> Customer{name='tom', id=101}
        System.out.println(customer1.toString());//javacode3.Customer@56cbfb61
        System.out.println(customer1);//javacode3.Customer@56cbfb61

        String str = new String("qwer");
        System.out.println(str.toString());//qwer

        Date date = new Date(1234);//1234
        System.out.println(date.toString());//Thu Jan 01 01:00:01 IST 1970

    }
}

class Customer {
    private String name;
    private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}