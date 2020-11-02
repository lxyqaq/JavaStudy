package impl.dao;

import impl.UserDao;
import impl.model.User;

import java.rmi.server.*;
import java.rmi.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/1 16:02
 * @Version 1.0
 */
public class UserDaoImpl extends UnicastRemoteObject implements UserDao {

    public UserDaoImpl() throws RemoteException{
        super();
    }
   /**
    * @description
    * @param
    * @param
    * @return
    * @author lxyqaq @email A00279565@student.ait.ie
    * @date 2020/11/1 16:10
    * @throws Exception
    */
    public User login(Connection con, User user)throws RemoteException,Exception {
        User resultUser = null;
        String sql = "select * from users where userName = ? and passWord = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, user.getUserName());
        pstmt.setString(2, user.getPassWord());
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            resultUser=new User();
            resultUser.setId(rs.getInt("id"));
            resultUser.setUserName(rs.getString("userName"));
            resultUser.setPassWord(rs.getString("passWord"));
        }
        return resultUser;
    }
}
