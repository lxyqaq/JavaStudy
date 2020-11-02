package server;

import impl.dao.UserDaoImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @ClassName Server
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/2 10:30
 * @Version 1.0
 */
public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(1099);
        System.out.println("java RMI registry created.");
        UserDaoImpl c = new UserDaoImpl();
        Naming.rebind("toaster", c);
    }
}
