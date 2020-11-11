package impl.dao;

import impl.ProductDao;
import impl.model.Product;
import util.DbUtil;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @ClassName ProductDaoImpl
 * @Description The database operation method in the product table in the data
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/3 20:27
 * @Version 1.0
 */
public class ProductDaoImpl extends UnicastRemoteObject implements ProductDao, Serializable {

    public ProductDaoImpl() throws RemoteException {
        super();
    }

    /**
     * @param con
     * @param product
     * @return Update the value of a field in a table in the database
     * @throws Exception
     * @throws RemoteException
     * @description Add the value of the field in the product table in the database
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:59
     */
    public int add(Product product) throws RemoteException, Exception {
        DbUtil dbUtil = new DbUtil();
        Connection con = dbUtil.getCon();
        String sql = "insert into products values(null,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, product.getCategoryId());
        pstmt.setString(2, product.getProductCode());
        pstmt.setString(3, product.getProductName());
        pstmt.setString(4, product.getProductDesc());
        pstmt.setFloat(5, product.getProductPrice());
        return pstmt.executeUpdate();
    }

}
