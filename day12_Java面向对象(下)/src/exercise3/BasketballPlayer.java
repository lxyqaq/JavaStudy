package exercise3;

/**
 * @ClassName BasketballPlayer
 * @Description 篮球运动员类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:44
 * @Version 1.0
 */
public class BasketballPlayer extends Player implements SpeakEnglish {

    public BasketballPlayer() {

    }

    public BasketballPlayer(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习扣篮");
    }

    @Override
    public void speakEnglish() {
        System.out.println("篮球运动员学习和篮球相关的英语");
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" + super.toString() + "}";
    }

}
