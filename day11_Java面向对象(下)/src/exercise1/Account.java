package exercise1;

/**
 * @ClassName Account
 * @Description 账户类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/17 21:01
 * @Version 1.0
 */
public class Account {
    //账号
    private int id;
    //密码
    private int passWord;
    //存款余额
    private double balance;
    //利率
    private static double interestRate;
    //最小余额
    private static double smallestBalance;
    //账户编号
    private static int init = 10000;

    public Account() {
        id = init++;
    }

    public Account(int passWord, double balance) {
        this();
        this.passWord = passWord;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getSmallestBalance() {
        return smallestBalance;
    }

    public static void setSmallestBalance(double smallestBalance) {
        Account.smallestBalance = smallestBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", passWord=" + passWord +
                ", balance=" + balance +
                '}';
    }
}
