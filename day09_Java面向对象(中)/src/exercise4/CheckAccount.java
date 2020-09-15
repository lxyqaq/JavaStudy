package exercise4;

/**
 * @ClassName CheckAccount
 * @Description CheckAccount类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/15 21:16
 * @Version 1.0
 */
public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
            System.out.println("您的账户余额为：" + getBalance());
            System.out.println("您的可透支额为：" + overdraft + "\n");
        } else if (amount > getBalance()) {
            if (amount - getBalance() <= overdraft) {
                overdraft -= amount - getBalance();
                super.withdraw(getBalance());
                System.out.println("您的账户余额为：" + getBalance());
                System.out.println("您的可透支额为：" + overdraft + "\n");
            } else {
                System.out.println("超过可透支的限额！" + "\n");
                System.out.println("您的账户余额为：" + getBalance());
                System.out.println("您的可透支额为：" + overdraft);
            }
        }
    }
}
