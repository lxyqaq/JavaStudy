package exercise1;

/**
 * @ClassName CommonEmployee
 * @Description 普通员工类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/18 22:30
 * @Version 1.0
 */
public class CommonEmployee extends Employee {
    @Override
    public void work() {
        System.out.println("员工在一线生产车间");
    }
}
