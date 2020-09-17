package exercise1;

/**
 * @ClassName AccountTest
 * @Description 账户测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/17 21:01
 * @Version 1.0
 */
public class AccountTest {
    /*
     * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
     * 定义封装这些属性的方法。账号要自动生成。
        编写主类，使用银行账户类，输入、输出3个储户的上述信息。
        考虑：哪些属性可以设计成static属性。
     *
     *
     */
    public static void main(String[] args) {
        Account account1 = new Account(123456, 1000);
        Account account2 = new Account(132465, 20000);
        Account account3 = new Account(654321, 1500);
        Account.setInterestRate(0.014);
        Account.setSmallestBalance(500);

        System.out.println("三个账户的信息为：");

        System.out.println(account1.toString() + "," + Account.getInterestRate());
        System.out.println(account2.toString() + "," + Account.getInterestRate());
        System.out.println(account3.toString() + "," + Account.getInterestRate());
    }
}
