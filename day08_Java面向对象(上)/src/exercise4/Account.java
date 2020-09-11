package exercise4;

/**
 * @author lxyqaq
 * @date 2020/9/11 - 22:33
 */
public class Account {
    //余额
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("存款成功：" + amount + "余额为：" + balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("您的余额不足！");
        } else {
            balance -= amount;
            System.out.println("取款成功：" + amount + "余额为：" + balance);
        }
    }
}
