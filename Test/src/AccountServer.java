import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.util.Scanner;


class AccountServer {
    public static void main(String[] args) throws Exception {

        LocateRegistry.createRegistry(1099);
        System.out.println("java RMI registry created.");
        AccountImpl c = new AccountImpl("J.Smith", 200);
        Naming.rebind("toaster", c);

    }
}
