package exercise;

/**
 * @author lxyqaq
 * @date 2020/9/8 - 16:44
 */
public class Person {
    public String name;
    public int age;
    /**
     * sex:1 为男性
     * sex:0 为女性
     */
    public int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age：" + age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }
}
