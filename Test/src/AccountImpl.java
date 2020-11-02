import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AccountImpl extends UnicastRemoteObject implements Account {

    private String name;
    private int transactions;
    private int balance;

    public AccountImpl(String n, int bal) throws RemoteException {
        name = n;
        transactions = 0;
        balance = bal;
    }

    public String read_bal() throws RemoteException {   //transactions++;
        return "" + balance;
    }

    public String read_name() throws RemoteException {
        return name;
    }

    public int read_transactions() throws RemoteException {
        return transactions;
    }

    public void resetTransactions() throws RemoteException {
        transactions = 0;
    }

    public void deposit(int a) throws RemoteException {
        transactions++;
        balance += a;
    }

    public boolean withdraw(int a) throws RemoteException {
        transactions++;
        if (a > balance) return false;
        else {
            balance -= a;
            return true;
        }
    }
}
