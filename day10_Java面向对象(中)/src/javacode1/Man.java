package javacode1;

/**
 * @ClassName Man
 * @Description Man类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 12:02
 * @Version 1.0
 */
public class Man extends Person {
    boolean isSmoking;

    int id = 1002;

    public void earnMoney() {
        System.out.println("男人负责挣钱养家");
    }

    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk() {
        System.out.println("男人霸气的走路");
    }


}
