package javacode2;

/**
 * @ClassName Person
 * @Description Person类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/15 20:26
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;
    private int id = 10001;

    public Person() {
        System.out.println("我是空参的构造器");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是带参数的构造器");
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("人要吃饭");
    }

    public void sleep() {
        System.out.println("人要睡觉");
    }
}
