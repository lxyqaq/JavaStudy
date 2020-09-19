package exercise3;

/**
 * @ClassName Teacher
 * @Description 教练员-抽象类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:40
 * @Version 1.0
 */
public abstract class Teacher extends Person{

    public Teacher() {

    }

    public Teacher(String name, int age, String sex) {
        super(name, age, sex);
    }

    public abstract void teach();

    @Override
    public String toString() {
        return super.toString();
    }
}
