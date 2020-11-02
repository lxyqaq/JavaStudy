package impl;

import impl.model.Categories;

import java.rmi.*;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * @ClassName CategoriesDaoImpl
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/2 08:44
 * @Version 1.0
 */
public interface CategoriesDao extends Remote {

    public int add(Connection con, Categories categories) throws RemoteException, Exception;

    public ResultSet list(Connection con, Categories categories) throws RemoteException, Exception;

    public int delete(Connection con, String id) throws RemoteException, Exception;

    public int update(Connection con, Categories categories) throws RemoteException,Exception;

}
