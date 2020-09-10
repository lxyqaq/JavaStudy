package exercise1;

/**
 * @author lxyqaq
 * @date 2020/9/10 - 23:09
 */
public class PersonTest {
    /*
     * 1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
     * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
     *
     * 2.练习2：
     * 2.1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。
     * 2.2. 修改上题中类和构造器，增加name属性,使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
     */
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setAge(12);

        System.out.println("年龄为：" + p1.getAge());

        Person p2 = new Person("Tom", 21);
        System.out.println("name = " + p2.getName() + ",age = " + p2.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
        age = 18;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a < 0 || a > 130) {
            throw new RuntimeException("传入的数据非法！");
        } else {
            age = a;
        }
    }

}