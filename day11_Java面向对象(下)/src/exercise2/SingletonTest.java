package exercise2;

/**
 * @ClassName SingletonTest
 * @Description 单例设计模式——饿汉式
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/17 23:38
 * @Version 1.0
 */
public class SingletonTest {
    /*
     * 单例设计模式：
     * 1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
     *
     * 2. 如何实现？
     * 	 饿汉式  vs 懒汉式
     *
     * 3. 区分饿汉式 和 懒汉式
     *   饿汉式：
     *   	坏处：对象加载时间过长。
     *   	好处：饿汉式是线程安全的
     *
     *   懒汉式：好处：延迟对象的创建。
     * 		  目前的写法坏处：线程不安全。--->到多线程内容时，再修改
     *
     *
     */
    public static void main(String[] args) {
        Bank bank1 = Bank.getBankOnly();
        Bank bank2 = Bank.getBankOnly();
        //比较他们的地址值说明就是同一个对象而已
        // == 用于引用数据类型判断的是地址值的相同而已
        //返回的是true
        System.out.println(bank1 == bank2);
    }

}

class Bank {

    //1.私有类化的构造器
    private Bank() {

    }

    //2.内部创建类的对象,此对象应该也为静态的。
    private static Bank bankOnly = new Bank();

    //3.提供公共的静态方法，并返回类的对象。
    public static Bank getBankOnly() {
        return bankOnly;
    }

}