package exercise1;

/**
 * @ClassName Employee
 * @Description 练习
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/18 22:14
 * @Version 1.0
 */

/*
 * 编写一个Employee类，声明为抽象类，
包含如下三个属性：name，id，salary。
提供必要的构造器和抽象方法：work()。
 *
 *
 */
public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {

    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
