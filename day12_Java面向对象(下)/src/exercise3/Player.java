package exercise3;

/**
 * @ClassName Player
 * @Description 运动员-抽象类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:38
 * @Version 1.0
 */
public abstract class Player extends Person {

    public Player() {

    }

    public Player(String name, int age, String sex) {
        super(name, age, sex);
    }

    //学习(抽象方法)
    public abstract void study();

    @Override
    public String toString() {
        return super.toString();
    }

}
