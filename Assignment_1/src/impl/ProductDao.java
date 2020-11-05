package impl;

import impl.model.Product;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Connection;

/**
 * @ClassName ProductDao
 * @Description Interface of product database operation
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/3 20:21
 * @Version 1.0
 */
public interface ProductDao extends Remote {

    public int add(Connection con, Product product) throws RemoteException, Exception;

}
