package impl.dao;

import impl.CategoriesDao;
import impl.model.Categories;
import util.DbUtil;
import util.StringUtil;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @ClassName CategoriesDao
 * @Description Database operation method in category table in data
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/1 18:26
 * @Version 1.0
 */
public class CategoriesDaoImpl extends UnicastRemoteObject implements CategoriesDao, Serializable {

    public CategoriesDaoImpl() throws RemoteException {
        super();
    }

    /**
     * @param con
     * @param categories
     * @return Update the value of a field in a table in the database
     * @throws Exception
     * @throws RemoteException
     * @description Add new values to the fields of the table in the database
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:43
     */
    public int add(Categories categories) throws Exception, RemoteException {
        DbUtil dbUtil = new DbUtil();
        Connection con = dbUtil.getCon();
        String sql = "insert into categories values(null,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, categories.getCategoryName());
        pstmt.setString(2, categories.getCategoryDesc());
        return pstmt.executeUpdate();
    }

    /**
     * @param categories
     * @param con
     * @return Update the value of a field in a table in the database
     * @throws Exception
     * @throws RemoteException
     * @description Find the value of a field in a table in the database
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:50
     */
    public ResultSet list(Categories categories) throws Exception, RemoteException {
        DbUtil dbUtil = new DbUtil();
        Connection con = dbUtil.getCon();
        StringBuffer sb = new StringBuffer("select * from categories");
        if (StringUtil.isNotEmpty(categories.getCategoryName())) {
            sb.append(" and category_name like '%" + categories.getCategoryName() + "%'");
        }
        PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
        return pstmt.executeQuery();
    }

    /**
     * @param con
     * @param id
     * @return Update the value of a field in a table in the database
     * @throws Exception
     * @throws RemoteException
     * @description Delete the value of a field in a table in the database
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:52
     */
    public int delete(String id) throws Exception, RemoteException {
        DbUtil dbUtil = new DbUtil();
        Connection con = dbUtil.getCon();
        String sql = "delete from categories where category_id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, id);
        return pstmt.executeUpdate();
    }

    /**
     * @param con
     * @param categories
     * @return Update the value of a field in a table in the database
     * @throws Exception
     * @throws RemoteException
     * @description Update the value of a field in a table in the database
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:54
     */
    public int update(Categories categories) throws Exception, RemoteException {
        DbUtil dbUtil = new DbUtil();
        Connection con = dbUtil.getCon();
        String sql = "update categories set category_name=?,category_desc=? where category_id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, categories.getCategoryName());
        pstmt.setString(2, categories.getCategoryDesc());
        pstmt.setInt(3, categories.getCategoryId());
        return pstmt.executeUpdate();
    }

}
