package view;

import control.DiaListener;

import javax.swing.*;

/**
 * @ClassName HelpDialog
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 17:25
 * @Version 1.0
 */
public class HelpDialog extends JDialog {

    private JLabel lab1, lab2;

    public HelpDialog() {
        this.setTitle("Help");
        this.setLayout(null);
        lab1 = new JLabel("Username:admin  Password:123456");
        lab1.setBounds(35, 40, 240, 30);
        this.add(lab1);
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.addWindowFocusListener(new DiaListener());
        this.setVisible(true);
    }

}
