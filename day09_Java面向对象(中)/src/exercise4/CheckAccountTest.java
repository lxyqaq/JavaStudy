package exercise4;

/**
 * @ClassName CheckAccountTest
 * @Description CheckAccountTest测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/15 21:26
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount1 = new CheckAccount(1122,20000,0.045,5000);

        checkAccount1.withdraw(5000);
        checkAccount1.withdraw(18000);
        checkAccount1.withdraw(3000);
    }
}
