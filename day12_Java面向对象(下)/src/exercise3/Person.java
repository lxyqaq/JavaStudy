package exercise3;

/**
 * @ClassName Person
 * @Description Person类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:33
 * @Version 1.0
 */

/*
 *  篮球运动员和教练
    乒乓球运动员和教练
    现在篮球运动员和教练要出国访问,需要学习英语
    请根据你所学的知识,分析出来哪些是类,哪些是抽象类,哪些是接口
 */
public class Person {
    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private String sex;

    public Person() {

    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void eat() {
        System.out.println("人要吃东西");
    }

    public void sleep() {
        System.out.println("人要睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

}
