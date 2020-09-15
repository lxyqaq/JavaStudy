package javacode3;

/**
 * @ClassName Man
 * @Description Man类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/15 23:53
 * @Version 1.0
 */
public class Man extends Person {
    @Override
    public void eat() {
        System.out.println("吃牛肉");
    }

    @Override
    public void walk() {
        System.out.println("男人走路");
    }

    public void earnMoney() {
        System.out.println("男人负责挣钱养家");
    }
}
