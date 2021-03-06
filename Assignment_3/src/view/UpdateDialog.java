package view;

import control.TableListener;
import control.UpdateListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName UpdateDialog
 * @Description TODO
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/28 16:18
 * @Version 1.0
 */
public class UpdateDialog extends JDialog {

    private JLabel id, name, sex, age, academy, address;
    public static JLabel err;
    public static JTextField t_id, t_name, t_sex, t_age, t_academy, t_address;
    private JButton ok, cancle;
    public static JComboBox cb_sex, cb_ac;

    public UpdateDialog() {
        this.setAlwaysOnTop(true);
        this.setTitle("Modify employee information");
        this.setLayout(null);
        this.setSize(680, 350);
        this.setLocationRelativeTo(null);
        int index = ManagerJpanel.jt.getSelectedRow();
        System.out.println(index);
        String s_id = ManagerJpanel.jt.getValueAt(index, 0).toString();
        String s_name = ManagerJpanel.jt.getValueAt(index, 1).toString();
        String s_sex = ManagerJpanel.jt.getValueAt(index, 2).toString();
        String s_age = ManagerJpanel.jt.getValueAt(index, 3).toString();
        String s_ac = ManagerJpanel.jt.getValueAt(index, 4).toString();
        String s_sp = ManagerJpanel.jt.getValueAt(index, 5).toString();

        id = new JLabel(StaticData.S_ID + ":");
        name = new JLabel(StaticData.S_NAME + ":");
        sex = new JLabel(StaticData.S_SEX + ":");
        age = new JLabel(StaticData.S_CLASS + ":");
        academy = new JLabel(StaticData.S_ACADEMY + ":");
        address = new JLabel(StaticData.S_address + ":");
        err = new JLabel();
        t_age = new JTextField(s_age);
        t_id = new JTextField(s_id);
        t_name = new JTextField(s_name);
        t_address = new JTextField(s_sp);
        cb_sex = new JComboBox();
        cb_ac = new JComboBox();
        ok = new JButton("Save");
        cancle = new JButton("Cancel");

        id.setBounds(30, 50, 50, 30);
        t_id.setBounds(80, 50, 100, 30);
        name.setBounds(200, 50, 50, 30);
        t_name.setBounds(250, 50, 100, 30);
        sex.setBounds(370, 50, 50, 30);
        cb_sex.setBounds(420, 50, 100, 30);
        if (s_sex.equals("Male")) {
            cb_sex.addItem("Male");
            cb_sex.addItem("Female");
        } else {
            cb_sex.addItem("Female");
            cb_sex.addItem("Male");
        }
        age.setBounds(30, 100, 50, 30);
        t_age.setBounds(80, 100, 100, 30);
        academy.setBounds(200, 100, 100, 30);
        cb_ac.setBounds(300, 100, 100, 30);
        address.setBounds(420, 100, 100, 30);
        t_address.setBounds(520, 100, 100, 30);

        if (s_ac.equals("Front-end")) {
            cb_ac.addItem("Front-end");
            cb_ac.addItem("Back-end");
            cb_ac.addItem("Software Test");
            cb_ac.addItem("Big Data");
            cb_ac.addItem("AI development");
        } else if (s_ac.equals("Back-end")) {
            cb_ac.addItem("Front-end");
            cb_ac.addItem("Back-end");
            cb_ac.addItem("Software Test");
            cb_ac.addItem("Big Data");
            cb_ac.addItem("AI development");
        } else if (s_ac.equals("Software Test")) {
            cb_ac.addItem("Front-end");
            cb_ac.addItem("Back-end");
            cb_ac.addItem("Software Test");
            cb_ac.addItem("Big Data");
            cb_ac.addItem("AI development");
        } else if (s_ac.equals("Big Data")) {
            cb_ac.addItem("Front-end");
            cb_ac.addItem("Back-end");
            cb_ac.addItem("Software Test");
            cb_ac.addItem("Big Data");
            cb_ac.addItem("AI development");
        } else if (s_ac.equals("AI development")) {
            cb_ac.addItem("Front-end");
            cb_ac.addItem("Back-end");
            cb_ac.addItem("Software Test");
            cb_ac.addItem("Big Data");
            cb_ac.addItem("AI development");
        } else {
            cb_ac.addItem("Front-end");
            cb_ac.addItem("Back-end");
            cb_ac.addItem("Software Test");
            cb_ac.addItem("Big Data");
            cb_ac.addItem("AI development");
        }
        err.setBounds(30, 150, 120, 30);
        err.setForeground(Color.RED);
        ok.setBounds(130, 200, 100, 30);
        cancle.setBounds(350, 200, 100, 30);

        ok.addActionListener(new UpdateListener());
        cancle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TableListener.jd_u.dispose();
            }
        });

        add(id);
        add(t_id);
        add(name);
        add(t_name);
        add(sex);
        add(cb_sex);
        add(age);
        add(t_age);
        add(academy);
        add(address);
        add(t_address);
        add(cb_ac);
        add(err);
        add(ok);
        add(cancle);
        setVisible(true);
    }

}
