package server;

import impl.dao.CategoriesDaoImpl;
import impl.dao.ProductDaoImpl;
import impl.dao.UserDaoImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @ClassName Server
 * @Description Project RMI Server Class
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/2 10:30
 * @Version 1.0
 */
public class Server {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        System.out.println("java RMI registry created.");
        UserDaoImpl c = new UserDaoImpl();
        ProductDaoImpl d = new ProductDaoImpl();
        CategoriesDaoImpl e = new CategoriesDaoImpl();
        Naming.rebind("toaster", c);
        Naming.rebind("toaster1", d);
        Naming.rebind("toaster2", e);
    }
}
