package javacode2;

/**
 * @ClassName Student
 * @Description Student类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/15 20:30
 * @Version 1.0
 */
public class Student extends Person {
    private String major;
    private int id = 10002;

    public Student() {
        super();
    }

    public Student(String major) {
        super();
    }

    public Student(String name, int age, String major) {
        //调用父类中的构造器
        //this.setName(name);
        //this.setAge(age);
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生要吃的有营养");
    }

    public void test() {
        //this.eat();
        super.eat();
        super.getId();
    }

    public void show() {
        System.out.println("name = " + super.getName() + ", age = " + super.getAge());
        System.out.println("id = " + this.id);
        System.out.println("id = " + super.getId());
    }
}
