package client;

import impl.dao.CategoriesDaoImpl;

import impl.model.Categories;
import util.DbUtil;
import util.StringUtil;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @ClassName CategoriesManageFrm
 * @Description Category management page
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/1 18:05
 * @Version 1.0
 */
public class CategoriesManageFrm extends JInternalFrame {
    private JScrollPane scrollPane1;
    private JTable categoryTable;
    private JTextField s_categoryNameTxt;
    private JTextField idTxt;
    private JTextField categoryNameTxt;
    private JTextArea categoryDescTxt;

    private DbUtil dbUtil = new DbUtil();
    private CategoriesDaoImpl categoriesDao = new CategoriesDaoImpl();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CategoriesManageFrm frame = new CategoriesManageFrm();
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
    public CategoriesManageFrm() throws RemoteException {
        setClosable(true);
        setIconifiable(true);
        setBounds(100, 100, 590, 625);

        JScrollPane scrollPane = new JScrollPane();
        categoryTable = new JTable();
        categoryTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                categoryTableMousePressed(e);
            }
        });
        categoryTable.setFont(new Font("Tahoma", Font.PLAIN, 12));

        //======== this ========
        setVisible(true);
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- table1 ----
            categoryTable.setModel(new DefaultTableModel(
                    new Object[][]{
                    },
                    new String[]{
                            "id", "category name", "category description"
                    }
            ) {
                boolean[] columnEditable = new boolean[]{
                        false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            scrollPane.setViewportView(categoryTable);
        }

        JLabel lblNewLabel = new JLabel("Category Name:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblNewLabel.setIcon(new ImageIcon(CategoriesManageFrm.class.getResource("/client/imgs/dog-tag.png")));

        s_categoryNameTxt = new JTextField();
        s_categoryNameTxt.setColumns(10);

        JButton btnNewButton = new JButton("Search");
        btnNewButton.setIcon(new ImageIcon(CategoriesManageFrm.class.getResource("/client/imgs/search.png")));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                categorySearchActionPerformed(e);
            }
        });

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Form operation", TitledBorder.LEADING, TitledBorder.TOP, null, null));

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(78)
                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                        .addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                                        .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(lblNewLabel)
                                                .addGap(41)
                                                .addComponent(s_categoryNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnNewButton)))
                                .addGap(66))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(44)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel)
                                        .addComponent(s_categoryNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton))
                                .addGap(18)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addContainerGap())
        );

        JLabel lblNewLabel_1 = new JLabel("id");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));

        idTxt = new JTextField();
        idTxt.setEditable(false);
        idTxt.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("category name");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));

        categoryNameTxt = new JTextField();
        categoryNameTxt.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("description");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));

        categoryDescTxt = new JTextArea();

        JButton btnNewButton_1 = new JButton("modify");
        btnNewButton_1.setIcon(new ImageIcon(CategoriesManageFrm.class.getResource("/client/imgs/order.png")));
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                categoryUpdateEvent(e);
            }
        });

        JButton btnNewButton_2 = new JButton("delete");
        btnNewButton_2.setIcon(new ImageIcon(CategoriesManageFrm.class.getResource("/client/imgs/delete.png")));
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                categoryDeleteEvent(e);
            }
        });
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(lblNewLabel_3)
                                                .addGap(17)
                                                .addComponent(categoryDescTxt))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(lblNewLabel_1)
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(lblNewLabel_2)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(categoryNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(16, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                                .addGap(56)
                                .addComponent(btnNewButton_1)
                                .addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(btnNewButton_2)
                                .addGap(56))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(16)
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_1)
                                        .addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNewLabel_2)
                                        .addComponent(categoryNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(26)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblNewLabel_3)
                                        .addComponent(categoryDescTxt, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnNewButton_2)
                                        .addComponent(btnNewButton_1))
                                .addGap(17))
        );
        panel.setLayout(gl_panel);

        scrollPane.setViewportView(categoryTable);
        getContentPane().setLayout(groupLayout);

        this.fillTable(new Categories());
    }

    /**
     * @param evt
     * @throws Exception
     * @description Implementation of category deletion function
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:19
     */
    private void categoryDeleteEvent(ActionEvent evt) {
        String id = idTxt.getText();
        if (StringUtil.isEmpty(id)) {
            JOptionPane.showMessageDialog(null, "Please select the record to delete！");
            return;
        }
        int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?！");
        if (n == 0) {
            Connection con = null;
            try {
                con = dbUtil.getCon();
                int deleteNum = categoriesDao.delete(con, id);
                if (deleteNum == 1) {
                    JOptionPane.showMessageDialog(null, "successfully deleted!");
                    this.resetValue();
                    this.fillTable(new Categories());
                } else {
                    JOptionPane.showMessageDialog(null, "failed to delete!");
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
    }

    /**
     * @param evt
     * @throws Exception
     * @description Realization of category modification function
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:20
     */
    private void categoryUpdateEvent(ActionEvent evt) {
        String id = idTxt.getText();
        String categoryName = categoryNameTxt.getText();
        String categoryDesc = categoryDescTxt.getText();
        if (StringUtil.isEmpty(id)) {
            JOptionPane.showMessageDialog(null, "Please select the record to be modified!");
            return;
        }
        if (StringUtil.isEmpty(categoryName)) {
            JOptionPane.showMessageDialog(null, "The category name cannot be empty!");
            return;
        }
        Categories categories = new Categories(Integer.parseInt(id), categoryName, categoryDesc);
        Connection con = null;
        try {
            con = dbUtil.getCon();
            int modifyNum = categoriesDao.update(con, categories);
            if (modifyNum == 1) {
                JOptionPane.showMessageDialog(null, "Successfully modified!");
                this.resetValue();
                this.fillTable(new Categories());
            } else {
                JOptionPane.showMessageDialog(null, "fail to edit!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "fail to edit!");
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
     * @description Implementation of mouse click event
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:20
     */
    private void categoryTableMousePressed(MouseEvent e) {
        int row = categoryTable.getSelectedRow();
        idTxt.setText((String) categoryTable.getValueAt(row, 0));
        categoryNameTxt.setText((String) categoryTable.getValueAt(row, 1));
        categoryDescTxt.setText((String) categoryTable.getValueAt(row, 2));
    }

    /**
     * @param evt
     * @description Realization of category search function
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:21
     */
    private void categorySearchActionPerformed(ActionEvent evt) {
        String s_categoryName = this.s_categoryNameTxt.getText();
        Categories categories = new Categories();
        categories.setCategoryName(s_categoryName);
        this.fillTable(categories);
    }

    /**
     * @param categories
     * @throws Exception
     * @description Realization of adding table function
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:21
     */
    private void fillTable(Categories categories) {
        DefaultTableModel dtm = (DefaultTableModel) categoryTable.getModel();
        dtm.setRowCount(0);
        Connection con = null;
        try {
            con = dbUtil.getCon();
            ResultSet rs = categoriesDao.list(con, categories);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("category_id"));
                v.add(rs.getString("category_name"));
                v.add(rs.getString("category_desc"));
                dtm.addRow(v);
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
     * @description Implementation of resetting all values on the page
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/11/5 15:22
     */
    private void resetValue() {
        this.idTxt.setText("");
        this.categoryNameTxt.setText("");
        this.categoryDescTxt.setText("");
    }
}
