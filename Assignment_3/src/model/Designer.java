package model;

/**
 * @ClassName Designer
 * @Description TODO
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/27 16:54
 * @Version 1.0
 */
public class Designer extends Employee {

    public Designer(String id, String name, String sex, String salary, String department) {
        super(id, name, sex, salary, department);
    }

    public String readType() {
        return "Design algorithm";
    }

}
