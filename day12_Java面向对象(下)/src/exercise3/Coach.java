package exercise3;

/**
 * @ClassName Coach
 * @Description 教练类-抽象类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:55
 * @Version 1.0
 */
public abstract class Coach extends Person {

    public Coach() {

    }

    public Coach(String name, int age, String sex) {
        super(name, age, sex);
    }

    //教-抽象方法
    public abstract void teach();

}
