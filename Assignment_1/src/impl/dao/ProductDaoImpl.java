package impl.dao;

import impl.ProductDao;
import impl.model.Product;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @ClassName ProductDaoImpl
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/3 20:27
 * @Version 1.0
 */
public class ProductDaoImpl extends UnicastRemoteObject implements ProductDao {

    public ProductDaoImpl() throws RemoteException {
        super();
    }


    @Override
    public int add(Connection con, Product product) throws RemoteException, Exception {
        String sql = "insert into products values(null,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, product.getCategoryId());
        pstmt.setString(2, product.getProductCode());
        pstmt.setString(3, product.getProductName());
        pstmt.setString(4, product.getProductDesc());
        pstmt.setFloat(5,product.getProductPrice());
        return pstmt.executeUpdate();
    }

}
