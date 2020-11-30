package view;

import control.TableListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import view.ManagerJpanel;

/**
 * @ClassName QueryJDialog
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/28 15:41
 * @Version 1.0
 */
public class QueryJDialog extends JDialog {

    private JButton jb_del, jb_find, jb_update, jb_insert, jb_out;
    public JTextField tex_id;
    private JLabel lab_check, lab_id;
    public Object[] str;
    private JScrollPane js;

    public QueryJDialog(Object[] str) {

        DefaultTableModel t_m = new DefaultTableModel(ManagerJpanel.t_head, 0);
        JTable jt = new JTable(t_m) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        t_m.addRow(str);
        this.repaint();
        this.setLayout(null);
        jb_del = new JButton(StaticData.DEL);
        jb_find = new JButton(StaticData.FIND);
        jb_update = new JButton(StaticData.UPDATE);
        jb_insert = new JButton(StaticData.INSETT);
        jb_out = new JButton(StaticData.OUT);
        tex_id = new JTextField();
        lab_check = new JLabel(StaticData.CHECK);
        lab_id = new JLabel(StaticData.S_ID + ":");
        jt.setDragEnabled(false);
        js = new JScrollPane();
        jt.setBackground(Color.LIGHT_GRAY);
        jt.setRowHeight(30);
        jt.setColumnSelectionAllowed(false);
        jt.setCellSelectionEnabled(false);
        jt.setRowSelectionAllowed(true);
        js.setViewportView(jt);
        js.setBounds(220, 30, 700, 450);
        jb_del.setBounds(20, 50, 100, 30);
        jb_del.setName("del");
        jb_update.setBounds(20, 150, 100, 30);
        jb_update.setName("update");
        TableListener t = new TableListener();
        jb_del.addMouseListener(t);
        jb_update.addMouseListener(t);
        this.add(jb_del);
        this.add(jb_update);
        this.add(js);
        this.setSize(200, 500);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
        g2d.drawLine(150, 0, 150, 600);
    }

}
