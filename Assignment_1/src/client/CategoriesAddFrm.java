package client;

import impl.CategoriesDao;
import impl.UserDao;
import impl.dao.CategoriesDaoImpl;
import impl.model.Categories;
import util.DbUtil;
import util.StringUtil;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.sql.Connection;

/**
 * @ClassName CategoriesAddFrm
 * @Description Function page added by category
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/1 17:55
 * @Version 1.0
 */
public class CategoriesAddFrm extends JInternalFrame {
    String url = "rmi:///";
    CategoriesDao categoriesDao;
    private JTextField categoryNameTxt;
    private JTextArea categoryDescTxt;

    private DbUtil dbUtil = new DbUtil();
    private CategoriesDaoImpl categoriesDaoImpl = new CategoriesDaoImpl();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CategoriesAddFrm frame = new CategoriesAddFrm();
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
    public CategoriesAddFrm() throws RemoteException {
        setClosable(true);
        setIconifiable(true);
        setBounds(100, 100, 450, 300);

        JLabel lblNewLabel = new JLabel("Category Name:");
        lblNewLabel.setIcon(new ImageIcon(CategoriesAddFrm.class.getResource("/client/imgs/dog-tag.png")));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));

        categoryNameTxt = new JTextField();
        categoryNameTxt.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Category Description:");
        lblNewLabel_1.setIcon(new ImageIcon(CategoriesAddFrm.class.getResource("/client/imgs/description.png")));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));

        categoryDescTxt = new JTextArea();

        JButton btnNewButton = new JButton("Add");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setIcon(new ImageIcon(CategoriesAddFrm.class.getResource("/client/imgs/check.png")));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    categoryAddActionPerformed(e);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton_1.setIcon(new ImageIcon(CategoriesAddFrm.class.getResource("/client/imgs/reset.png")));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetValueActionPerformed(e);
            }
        });
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(56)
                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(btnNewButton)
                                                .addPreferredGap(ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                                .addComponent(btnNewButton_1))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(lblNewLabel_1)
                                                        .addComponent(lblNewLabel))
                                                .addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(categoryNameTxt)
                                                        .addComponent(categoryDescTxt))))
                                .addGap(65))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(42)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel)
                                        .addComponent(categoryNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(34)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_1)
                                        .addComponent(categoryDescTxt, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnNewButton_1)
                                        .addComponent(btnNewButton))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);

    }

    /**
     * @param evt
     * @throws Exception
     * @description Implementation of the added function
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:14
     */
    private void categoryAddActionPerformed(ActionEvent evt) throws Exception {
        categoriesDao = (CategoriesDao) Naming.lookup(url + "toaster2");
        String categoryName = this.categoryNameTxt.getText();
        String categoryDesc = this.categoryDescTxt.getText();
        if (StringUtil.isEmpty(categoryName)) {
            JOptionPane.showMessageDialog(null, "The category name cannot be empty!");
            return;
        }
        Categories categories = new Categories(categoryName, categoryDesc);
        Connection con = null;
        try {
            con = dbUtil.getCon();
            int n = categoriesDao.add(categories);
            if (n == 1) {
                JOptionPane.showMessageDialog(null, "The category is added successfully!");
                resetValue();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add category!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to add category!");
        } finally {
            try {
                dbUtil.closeCon(con);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param e
     * @description Implementation of the function of resetting the value on the page
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:14
     */
    private void resetValueActionPerformed(ActionEvent e) {
        this.resetValue();
    }

    /**
     * @description Implementation of the function of resetting the value on the page
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:15
     */
    private void resetValue() {
        this.categoryNameTxt.setText("");
        this.categoryDescTxt.setText("");
    }

}
