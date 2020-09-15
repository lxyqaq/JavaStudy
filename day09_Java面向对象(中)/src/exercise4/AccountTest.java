package exercise4;

/**
 * @ClassName AccountTest
 * @Description 用户测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/15 21:14
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000,0.045);

        account1.withdraw(2500);
        account1.deposit(3000);
    }
}
