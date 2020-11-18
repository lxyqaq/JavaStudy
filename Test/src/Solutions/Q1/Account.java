package Solutions.Q1;

public class Account {
    private String name;
    private int balance;

    public Account(String nm, int bal) {
        this.name = nm;
        this.balance = bal;
    }

    public boolean withdraw(int amt) {
        if (amt > this.balance) {
            return false;
        } else {
            this.balance -= amt;
            return true;
        }
    }

    public int read_balance() {

        return balance;
    }

    public void deposit(int amt) {
        balance += amt;

    }

}
