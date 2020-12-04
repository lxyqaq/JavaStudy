/**
 * @ClassName Student
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/12/1 12:36
 * @Version 1.0
 */
public class Student extends Person{

    public Student() {

    }

    public Student(int age, String name) {
        super(age, name);
    }

    public void type() {
        System.out.println("student");
    }

    public static void main(String[] args) {
        Person person = new Student();
        Person person1 = new Person();
        person.type();
        person1.type();
    }
}
