package view;

import control.OutListener;

import javax.swing.*;

/**
 * @ClassName OutDialog
 * @Description TODO
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/28 17:05
 * @Version 1.0
 */
public class OutDialog extends JDialog {

    public OutDialog() {

        this.setLayout(null);
        this.setSize(380, 180);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        OutListener o = new OutListener();
        JLabel msg = new JLabel("Are you sure to log out?");
        msg.setBounds(130, 20, 200, 30);
        JButton ok = new JButton("Yes");
        ok.setBounds(50, 80, 100, 30);
        ok.addActionListener(o);
        JButton cancle = new JButton("No");
        cancle.setBounds(200, 80, 100, 30);
        cancle.addActionListener(o);

        add(msg);
        add(ok);
        add(cancle);
    }

}
