package bean;

/**
 * @ClassName Programmer
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 16:52
 * @Version 1.0
 */
public class Programmer extends Employee {

    public Programmer(String id, String name, String sex, String salary, String department) {
        super(id, name, sex, salary, department);
    }

    public String readType() {
        return "Programmer";
    }

}