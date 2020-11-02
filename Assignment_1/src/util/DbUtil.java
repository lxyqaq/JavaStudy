package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName DbUtil
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/1 15:55
 * @Version 1.0
 */
public class DbUtil {
    private String dbUrl = "jdbc:mysql://localhost:3306/my_guitar_shop"; // 数据库连接地址
    private String dbUserName = "root"; // 用户名
    private String dbPassword = "19980128"; // 密码
    private String jdbcName = "com.mysql.cj.jdbc.Driver"; // 驱动名称

    /**
     * 获取数据库连接
     *
     * @return
     * @throws Exception
     */
    public Connection getCon() throws Exception {
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return con;
    }

    /**
     * 关闭数据库连接
     *
     * @param con
     * @throws Exception
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
            System.out.println("数据库连接成功！");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
