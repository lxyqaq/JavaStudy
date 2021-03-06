package client;

import impl.dao.UserDaoImpl;
import impl.CategoriesDao;
import impl.UserDao;
import impl.model.User;
import util.DbUtil;
import util.StringUtil;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

/**
 * @ClassName LogOnFrm
 * @Description Management system login main page
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/1 16:43
 * @Version 1.0
 */
public class LogOnFrm extends JFrame implements Serializable {
    String url = "rmi:///";
    UserDao userDao;
    CategoriesDao categoriesDao;

    private JPanel contentPane;
    private JTextField userNameTxt;
    private JPasswordField passWordTxt;

    private DbUtil dbUtil = new DbUtil();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogOnFrm frame = new LogOnFrm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public LogOnFrm() throws RemoteException, Exception {
        setResizable(false);
        setTitle("Administrator login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 370);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("Guitar Shop Management System");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));

        JLabel lblNewLabel_1 = new JLabel("Username");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_1.setIcon(new ImageIcon(LogOnFrm.class.getResource("/client/imgs/user.png")));

        JLabel lblNewLabel_2 = new JLabel("Password");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel_2.setIcon(new ImageIcon(LogOnFrm.class.getResource("/client/imgs/padlock.png")));

        userNameTxt = new JTextField();
        userNameTxt.setColumns(10);

        JButton btnNewButton = new JButton("Sign in");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setIcon(new ImageIcon(LogOnFrm.class.getResource("/client/imgs/check.png")));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    loginActionPerformed(e);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton_1.setIcon(new ImageIcon(LogOnFrm.class.getResource("/client/imgs/reset.png")));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetValueActionPerformed(e);
            }
        });

        passWordTxt = new JPasswordField();
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(44)
                                                .addComponent(lblNewLabel))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(79)
                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblNewLabel_1)
                                                                        .addComponent(lblNewLabel_2))
                                                                .addGap(81)
                                                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                                                        .addComponent(passWordTxt)
                                                                        .addComponent(userNameTxt)))
                                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                                .addComponent(btnNewButton)
                                                                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnNewButton_1)))))
                                .addContainerGap(58, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(33)
                                .addComponent(lblNewLabel)
                                .addGap(44)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_1)
                                        .addComponent(userNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(49)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_2)
                                        .addComponent(passWordTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnNewButton)
                                        .addComponent(btnNewButton_1))
                                .addGap(45))
        );
        contentPane.setLayout(gl_contentPane);
        this.setLocationRelativeTo(null);
    }

    /**
     * @param evt
     * @throws Exception
     * @description Implementation of login method
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 14:48
     */
    protected void loginActionPerformed(ActionEvent evt) throws Exception {
        userDao = (UserDao) Naming.lookup(url + "toaster");
        String userName = this.userNameTxt.getText();
        String passWord = new String(this.passWordTxt.getPassword());
        if (StringUtil.isEmpty(userName)) {
            JOptionPane.showMessageDialog(null, "Username can not be empty!");
            return;
        }
        if (StringUtil.isEmpty(passWord)) {
            JOptionPane.showMessageDialog(null, "Password can not be empty!");
            return;
        }
        User user = new User(userName, passWord);
        Connection con = null;
        try {
            con = dbUtil.getCon();
            User currentUser = userDao.login(user);
            if (currentUser != null) {
                dispose();
                new MainFrm().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Username or password is incorrect!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeCon(con);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param evt
     * @description Realization of the method of resetting the page value
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 14:49
     */
    private void resetValueActionPerformed(ActionEvent evt) {
        this.userNameTxt.setText("");
        this.passWordTxt.setText("");
    }

}
