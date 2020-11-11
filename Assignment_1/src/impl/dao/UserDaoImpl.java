package impl.dao;

import impl.UserDao;
import impl.model.User;
import util.DbUtil;

import java.io.Serializable;
import java.rmi.server.*;
import java.rmi.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @ClassName UserDao
 * @Description Database operation method in User table in data
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/1 16:02
 * @Version 1.0
 */
public class UserDaoImpl extends UnicastRemoteObject implements UserDao {

    public UserDaoImpl() throws RemoteException {
        super();
    }

    /**
     * @param con
     * @param user
     * @return user object
     * @throws RemoteException
     * @throws Exception
     * @description Find the attribute value of the field in the user table in the database
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/1 16:10
     */
    public User login(User user) throws RemoteException,Exception {
        DbUtil dbUtil = new DbUtil();
        Connection con = dbUtil.getCon();
        User resultUser = null;
        String sql = "select * from users where userName = ? and passWord = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, user.getUserName());
        pstmt.setString(2, user.getPassWord());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            resultUser = new User();
            resultUser.setId(rs.getInt("id"));
            resultUser.setUserName(rs.getString("userName"));
            resultUser.setPassWord(rs.getString("passWord"));
        }
        return resultUser;
    }

}
