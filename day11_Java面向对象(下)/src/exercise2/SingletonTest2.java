package exercise2;

/**
 * @ClassName SingletonTest2
 * @Description 单例设计模式——懒汉式
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/17 23:58
 * @Version 1.0
 */
public class SingletonTest2 {
    public static void main(String[] args) {

    }
}
class Order{
    //1.私有类化的构造器
    private Order(){

    }

    //2.声明当前类对象，没有初始化
    //3.此对象也必须声明为static的
    private static Order orderOnly = null;

    //4.声明public、static的返回当前类对象的方法
    public static Order getOrderOnly(){
        if (orderOnly == null){
            orderOnly = new Order();
        }
        return orderOnly;
    }
}