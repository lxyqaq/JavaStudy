package impl;

import impl.model.Categories;

import java.io.Serializable;
import java.rmi.*;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * @ClassName CategoriesDaoImpl
 * @Description Interface of categories database operation
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/2 08:44
 * @Version 1.0
 */
public interface CategoriesDao extends Remote {

    public int add(Categories categories) throws RemoteException, Exception;

    public ResultSet list(Categories categories) throws RemoteException, Exception;

    public int delete(String id) throws RemoteException, Exception;

    public int update(Categories categories) throws RemoteException, Exception;

}
