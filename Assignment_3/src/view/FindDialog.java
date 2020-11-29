package view;

import control.FindListener;
import control.TableListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName FindDialog
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/28 17:08
 * @Version 1.0
 */
public class FindDialog extends JDialog {

    private JLabel id, name, sex, age, academy, address;
    public static JLabel err;
    public static JTextField t_id, t_name, t_sex, t_age, t_academy, t_address;
    private JButton ok, cancle;
    public static JComboBox cb_sex, cb_ac;

    public FindDialog() {
        this.setAlwaysOnTop(true);
        this.setTitle("Find employee information");
        this.setLayout(null);
        this.setSize(680, 320);
        this.setLocationRelativeTo(null);
        int index = ManagerJpanel.jt.getSelectedRow();

        id = new JLabel(StaticData.S_ID + ":");
        name = new JLabel(StaticData.S_NAME + ":");
        sex = new JLabel(StaticData.S_SEX + ":");
        age = new JLabel(StaticData.S_CLASS + ":");
        academy = new JLabel(StaticData.S_ACADEMY + ":");
        address = new JLabel(StaticData.S_address + ":");


        err = new JLabel();
        t_age = new JTextField();
        t_id = new JTextField();
        t_name = new JTextField();
        t_address = new JTextField();
        cb_sex = new JComboBox();
        cb_ac = new JComboBox();

        ok = new JButton("Search");
        cancle = new JButton("Cancel");

        cb_sex.addItem("Male");
        cb_sex.addItem("Female");

        id.setBounds(30, 50, 50, 30);
        t_id.setBounds(80, 50, 100, 30);
        name.setBounds(200, 50, 50, 30);
        t_name.setBounds(250, 50, 100, 30);
        sex.setBounds(370, 50, 50, 30);
        cb_sex.setBounds(420, 50, 100, 30);

        age.setBounds(30, 100, 50, 30);
        t_age.setBounds(80, 100, 100, 30);
        academy.setBounds(200, 100, 100, 30);
        cb_ac.setBounds(300, 100, 100, 30);
        address.setBounds(420, 100, 100, 30);
        t_address.setBounds(520, 100, 100, 30);

        cb_ac.addItem("Front-end Development");
        cb_ac.addItem("Back-end Development");
        cb_ac.addItem("Software Test");
        cb_ac.addItem("Big Data Development");
        cb_ac.addItem("AI development");

        err.setBounds(30, 150, 120, 30);
        err.setForeground(Color.RED);

        ok.setBounds(250, 200, 100, 30);
        cancle.setBounds(350, 200, 100, 30);

        ok.addActionListener(new FindListener());

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
        setVisible(true);
    }

}
