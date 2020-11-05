package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName DbUtil
 * @Description Connect to and close the database
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/1 15:55
 * @Version 1.0
 */
public class DbUtil {

    private String dbUrl = "jdbc:mysql://localhost:3306/my_guitar_shop";
    private String dbUserName = "root";
    private String dbPassword = "19980128";
    private String jdbcName = "com.mysql.cj.jdbc.Driver";

    /**
     * @return con
     * @throws Exception
     * @description Get database connection
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 16:14
     */
    public Connection getCon() throws Exception {
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return con;
    }

    /**
     * @param con
     * @throws Exception
     * @description Database shutdown
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 16:13
     */
    public void closeCon(Connection con) throws Exception {
        if (con != null) {
            con.close();
        }
    }

    public static void main(String[] args) {
        DbUtil dbUtil = new DbUtil();
        try {
            dbUtil.getCon();
            System.out.println("The database connection is successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Database connection failed!");
        }
    }

}
