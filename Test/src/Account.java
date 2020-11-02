import java.rmi.*;

public interface Account extends Remote {

    public String read_bal() throws RemoteException;

    public String read_name() throws RemoteException;

    public int read_transactions() throws RemoteException;

    public void deposit(int a) throws RemoteException;

    public boolean withdraw(int a) throws RemoteException;

    public void resetTransactions() throws RemoteException;
}
