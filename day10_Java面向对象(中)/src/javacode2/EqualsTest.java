package javacode2;

import java.util.Date;

/**
 * @ClassName EqualsTest
 * @Description equals方法的测试
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 21:40
 * @Version 1.0
 */
public class EqualsTest {
    /*
     *
     * 面试题： == 和 equals() 区别
     *
     * 一、回顾 == 的使用：
     * == ：运算符
     * 1. 可以使用在基本数据类型变量和引用数据类型变量中
     * 2. 如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同）
     *    如果比较的是引用数据类型变量：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体
     * 补充： == 符号使用时，必须保证符号左右两边的变量类型一致。
     *
     * 二、equals()方法的使用：
     * 1. 是一个方法，而非运算符
     * 2. 只能适用于引用数据类型
     * 3. Object类中equals()的定义：
     *    public boolean equals(Object obj) {
                return (this == obj);
          }
     *    说明：Object类中定义的equals()和==的作用是相同的：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体
     *
     * 4. 像String、Date、File、包装类等都重写了Object类中的equals()方法。重写以后，比较的不是
     *    两个引用的地址是否相同，而是比较两个对象的"实体内容"是否相同。
     *
     * 5. 通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否相同。那么，我们
     *    就需要对Object类中的equals()进行重写.
     *    重写的原则：比较两个对象的实体内容是否相同.
     */
    public static void main(String[] args) {
        //基本数据类型
        int i = 10;
        int j = 10;
        double k = 10.0;
        //true
        System.out.println(i == j);
        //true
        System.out.println(i == k);

        System.out.println("*******************");

        boolean b = true;
        //System.out.println(i == b);

        char c = 10;
        System.out.println(i == c);

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);

        System.out.println("*******************");

        //引用数据类型
        Customer customer1 = new Customer("Tom", 22);
        Customer customer2 = new Customer("Tom", 22);
        //比较的是地址值是否相同
        System.out.println(customer1 == customer2);//false
        System.out.println("注意这里重写了equals方法的！");
        System.out.println(customer1.equals(customer2));//false

        System.out.println("********************");

        String str1 = new String("qwer");
        String str2 = new String("qwer");
        System.out.println(str1 == str2);//false
        //重写了String中的equals方法，才返回的是true
        System.out.println(str1.equals(str2));//true

        System.out.println("*********************");

        Date date1 = new Date(1212);
        Date date2 = new Date(1212);
        //地址值
        System.out.println(date1 == date2);//false
        System.out.println(date1.equals(date2));//true


    }
}
