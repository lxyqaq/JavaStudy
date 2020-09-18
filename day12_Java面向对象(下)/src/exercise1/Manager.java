package exercise1;

/**
 * @ClassName Manager
 * @Description 管理类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/18 22:28
 * @Version 1.0
 */
public class Manager extends Employee {
    //奖金
    private double bonus;

    public Manager(double bonus) {
        super();
        this.bonus = bonus;
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提升效率。");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
