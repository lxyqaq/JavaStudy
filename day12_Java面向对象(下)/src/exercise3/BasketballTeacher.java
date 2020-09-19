package exercise3;

/**
 * @ClassName BasketballTeacher
 * @Description 篮球教练类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:54
 * @Version 1.0
 */
public class BasketballTeacher extends Coach implements SpeakEnglish {

    public BasketballTeacher() {

    }

    public BasketballTeacher(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("篮球教练学习篮球的英语");
    }

    @Override
    public String toString() {
        return "BasketballTeacher{" + super.toString() + "}";
    }
}
