package bean;

/**
 * @ClassName Archiect
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 16:56
 * @Version 1.0
 */
public class Archiect extends Employee{

    public Archiect(String id, String name, String sex, String salary, String department) {
        super(id, name, sex, salary, department);
    }

    public String readType() {
        return "Design architecture";
    }

}
