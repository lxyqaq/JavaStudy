package exercise3;

/**
 * @ClassName BadmintonTeacher
 * @Description 羽毛球教练类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:58
 * @Version 1.0
 */
public class BadmintonTeacher extends Coach implements SpeakEnglish {

    public BadmintonTeacher() {

    }

    public BadmintonTeacher(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void teach() {
        System.out.println("羽毛球教练教羽毛球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("羽毛球教练学习羽毛球相关的英语");
    }

    @Override
    public String toString() {
        return "BadmintonTeacher{" + super.toString() + "}";
    }
}
