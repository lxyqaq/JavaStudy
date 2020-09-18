package exercise1;

/**
 * @ClassName EmployeeTest
 * @Description 测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/18 22:31
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee manager1 = new Manager("Nathan", 22, 4000, 5000);
        manager1.work();
        System.out.println(manager1.getSalary());

        Manager manager2 = new Manager("Jack", 18, 6000, 10000);
        manager2.work();
        System.out.println(manager2.getBonus());

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
