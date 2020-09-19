package exercise3;

/**
 * @ClassName BadmintonPlayer
 * @Description 羽毛球运动员类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:49
 * @Version 1.0
 */
public class BadmintonPlayer extends Player implements SpeakEnglish {

    public BadmintonPlayer() {

    }

    public BadmintonPlayer(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void study() {
        System.out.println("羽毛球运动员学习跳杀");
    }

    @Override
    public void speakEnglish() {
        System.out.println("羽毛球运动员学习和羽毛球相关的英语");
    }

    @Override
    public void eat() {
        System.out.println("羽毛球运动员要多吃高蛋白");
    }

    @Override
    public void sleep() {
        System.out.println("羽毛球运动员要睡足");
    }

    @Override
    public String toString() {
        return "BadmintonPlayer{" + super.toString() + "}";
    }
}
