package control;

import main.Main;
import view.LoginJPanel;
import view.StaticData;
import view.TopJFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName LoginListener
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 17:20
 * @Version 1.0
 */
public class LoginListener implements ActionListener {
    private JDialog err;

    public void actionPerformed(ActionEvent e) {
        String user = LoginJPanel.tex_user.getText();
        String pwd = LoginJPanel.tex_pwd.getText();
        if (user.trim().equals("")) {
            LoginJPanel.lab_u_err.setText(StaticData.USER_ERR);
        } else {
            LoginJPanel.lab_u_err.setText("");
        }
        if (pwd.trim().equals("")) {
            LoginJPanel.lab_p_err.setText(StaticData.PWD_ERR);
        } else {
            LoginJPanel.lab_p_err.setText("");
        }
        if (!user.equals("") && !pwd.equals("") &&
                !user.equals("admin") && !pwd.equals("123456")) {
            LoginJPanel.login_err.setText(StaticData.LOGIN_ERR);
        } else if (user.equals("admin") && pwd.equals("123456")) {
            LoginJPanel.login_err.setText("");
            err = new JDialog();
            err.setLayout(null);
            JLabel jl_err = new JLabel("login successful!");
            jl_err.setBounds(100, 20, 200, 30);
            err.add(jl_err);
            err.setSize(300, 130);
            err.setLocationRelativeTo(null);
            err.setVisible(true);

            Thread tr_err = new Thread() {
                public void run() {
                    try {
                        this.sleep(1300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    err.dispose();
                    TopJFrame.c.next(TopJFrame.jp);
                    Main.top.repaint();
                }

                ;
            };
            tr_err.start();
        } else {
            err = new JDialog();
            err.setLayout(null);
            JLabel jl_err = new JLabel("Incorrect username or password!");
            jl_err.setBounds(100, 20, 250, 30);
            err.add(jl_err);
            err.setSize(400, 130);
            err.setLocationRelativeTo(null);
            err.setVisible(true);
        }
    }
}
