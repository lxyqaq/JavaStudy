package exercise3;

/**
 * @ClassName Test
 * @Description 测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 19:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        BasketballPlayer basketballPlayer = new BasketballPlayer("姚明", 30, "男");
        BasketballTeacher basketballTeacher = new BasketballTeacher("杜峰", 31, "男");

        BadmintonPlayer badmintonPlayer = new BadmintonPlayer("李宗伟", 34, "男");
        BadmintonTeacher badmintonTeacher = new BadmintonTeacher("李永波", 40, "男");

        System.out.println(badmintonTeacher.toString());
        System.out.println(badmintonPlayer.toString());
        badmintonPlayer.speakEnglish();
        badmintonPlayer.study();
        badmintonPlayer.eat();
        badmintonPlayer.sleep();

        badmintonTeacher.speakEnglish();
        badmintonTeacher.teach();

        System.out.println(basketballTeacher.toString());
        System.out.println(basketballPlayer.toString());


    }
}
