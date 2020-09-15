package exercise4;

/**
 * @ClassName Account
 * @Description Account类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/15 21:05
 * @Version 1.0
 */
public class Account {
    //账号
    private int id;
    //余额
    private double balance;
    //年利率
    private double annuallnterestRate;

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    /**
     * @param amount
     * @description 取款的方法
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/15 21:09
     */
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("余额不足");
        }
    }

    /**
     * @param amount
     * @description 存款的方法
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/15 21:09
     */
    public void deposit(double amount) {
        balance += amount;
    }
}
