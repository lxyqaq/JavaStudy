package client;

import impl.dao.CategoriesDaoImpl;
import impl.dao.ProductDaoImpl;
import impl.model.Categories;
import impl.model.Product;
import util.DbUtil;
import util.StringUtil;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * @ClassName ProductAddFrm
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/3 20:58
 * @Version 1.0
 */
public class ProductAddFrm extends JInternalFrame {
    private JTextField productNameTxt;
    private JTextField productCodeTxt;
    private JTextField productPriceTxt;
    private JTextArea productDescTxt;
    private JComboBox productTypeJcb;
    private JButton btnNewButton;

    private DbUtil dbUtil = new DbUtil();
    private CategoriesDaoImpl categoriesDaoImpl = new CategoriesDaoImpl();
    private ProductDaoImpl productDaoImpl = new ProductDaoImpl();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ProductAddFrm frame = new ProductAddFrm();
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
    public ProductAddFrm() throws RemoteException {
        setTitle("Product Added");
        setClosable(true);
        setIconifiable(true);
        setBounds(100, 100, 480, 490);

        JLabel lblNewLabel = new JLabel("Product Name:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));

        productNameTxt = new JTextField();
        productNameTxt.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Product Code:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));

        productCodeTxt = new JTextField();
        productCodeTxt.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Product Price:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));

        productPriceTxt = new JTextField();
        productPriceTxt.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Product Type:");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel lblNewLabel_4 = new JLabel("Product Description:");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));

        productDescTxt = new JTextArea();

        btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    productAddActionPerformed(e);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetValueActionPerformed(e);
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));

        productTypeJcb = new JComboBox();
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(45)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                                                .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                                                        .addComponent(btnNewButton)
                                                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnNewButton_1))
                                                .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                                                        .addComponent(lblNewLabel_4)
                                                        .addPreferredGap(ComponentPlacement.UNRELATED)
                                                        .addComponent(productDescTxt, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(lblNewLabel)
                                                        .addComponent(lblNewLabel_1)
                                                        .addComponent(lblNewLabel_2)
                                                        .addComponent(lblNewLabel_3))
                                                .addGap(18)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(productPriceTxt)
                                                        .addComponent(productCodeTxt)
                                                        .addComponent(productNameTxt)
                                                        .addComponent(productTypeJcb, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(43)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel)
                                        .addComponent(productNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_1)
                                        .addComponent(productCodeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_2)
                                        .addComponent(productPriceTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_3)
                                        .addComponent(productTypeJcb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_4)
                                        .addComponent(productDescTxt, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnNewButton)
                                        .addComponent(btnNewButton_1))
                                .addGap(33))
        );
        getContentPane().setLayout(groupLayout);

        fillProductType();
    }

    private void resetValueActionPerformed(ActionEvent e) {
        this.resetValue();
    }

    private void productAddActionPerformed(ActionEvent evt) throws Exception {
        String productName = this.productNameTxt.getText();
        String productCode = this.productCodeTxt.getText();
        String productDesc = this.productDescTxt.getText();
        String productPrice = this.productPriceTxt.getText();
        if (StringUtil.isEmpty(productName)) {
            JOptionPane.showMessageDialog(null, "名字不能为空！");
            return;
        }
        if (StringUtil.isEmpty(productCode)) {
            JOptionPane.showMessageDialog(null, "code不能为空！");
            return;
        }
        if (StringUtil.isEmpty(productDesc)) {
            JOptionPane.showMessageDialog(null, "desc不能为空！");
            return;
        }
        if (StringUtil.isEmpty(productPrice)) {
            JOptionPane.showMessageDialog(null, "price不能为空！");
            return;
        }
        Categories categories = (Categories) productTypeJcb.getSelectedItem();
        int categoryId = categories.getCategoryId();

        Product product = new Product(categoryId, productCode, productName, productDesc, Float.parseFloat(productPrice));

        Connection con = null;
        try {
            con = dbUtil.getCon();
            int addNum = productDaoImpl.add(con,product);
            if (addNum == 1){
                JOptionPane.showMessageDialog(null,"添加成功");
                resetValue();
            } else {
                JOptionPane.showMessageDialog(null,"添加失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"添加失败！");
        } finally {
            dbUtil.closeCon(con);
        }
    }

    private void resetValue() {
        this.productNameTxt.setText("");
        this.productCodeTxt.setText("");
        this.productDescTxt.setText("");
        this.productPriceTxt.setText("");
    }

    private void fillProductType() {
        Connection con = null;
        Categories categories = null;
        try {
            con = dbUtil.getCon();
            ResultSet rs = categoriesDaoImpl.list(con, new Categories());
            while (rs.next()) {
                categories = new Categories();
                categories.setCategoryId(rs.getInt("category_id"));
                categories.setCategoryName(rs.getString("category_name"));
                this.productTypeJcb.addItem(categories);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
