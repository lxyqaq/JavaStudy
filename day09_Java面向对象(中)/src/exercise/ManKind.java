package exercise;

/**
 * @ClassName ManKind
 * @Description 父类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/14 11:56
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;

    public void manOrWoman() {
        if (sex == 0) {
            System.out.println("woman");
        } else if (sex == 1) {
            System.out.println("man");
        } else {
            System.out.println("输入错误！");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public ManKind() {
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }
}
