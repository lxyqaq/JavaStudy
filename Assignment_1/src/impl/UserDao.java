package impl;

import impl.model.User;

import java.rmi.*;
import java.sql.Connection;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/2 08:43
 * @Version 1.0
 */
public interface UserDao extends Remote {

    public User login(Connection con, User user)throws RemoteException, Exception;


}
