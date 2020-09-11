package exercise3;

/**
 * @author lxyqaq
 * @date 2020/9/11 - 20:52
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

    //取钱
    public void withdraw(double amount) {
        if (balance < amount){
            System.out.println("余额不足，取款失败！");
            return;
        }
        balance -= amount;
        System.out.println("成功取出："+amount);
    }

    //存钱
    public void deposit(double amount) {
        balance += amount;
        System.out.println("成功存入："+amount);
    }
}
