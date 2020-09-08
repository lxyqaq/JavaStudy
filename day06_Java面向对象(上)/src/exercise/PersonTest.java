package exercise;

/**
 * @author lxyqaq
 * @date 2020/9/8 - 16:57
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.age = 18;
        p1.name = "Jack";
        p1.sex = 1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        //20
        System.out.println("Jack的新年龄为：" + newAge);

        //20
        System.out.println(p1.age);

        Person p2 = new Person();
        //0
        p2.showAge();
        p2.addAge(5);
        //5
        p2.showAge();

        //20
        p1.showAge();
    }
}
