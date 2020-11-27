package project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import project.data.StaticData;
import project.main.Main;
import project.view.LoginJPanel;
import project.view.TopJFrame;

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
            //切换页面
            LoginJPanel.login_err.setText("");
            err = new JDialog();
            err.setLayout(null);
            JLabel jl_err = new JLabel("登录成功！");
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
            System.out.println("成功登录！");
        } else {
            err = new JDialog();
            err.setLayout(null);
            JLabel jl_err = new JLabel("账号或密码错误");
            jl_err.setBounds(100, 20, 200, 30);
            err.add(jl_err);
            err.setSize(300, 130);
            err.setLocationRelativeTo(null);
            err.setVisible(true);
        }
    }


}
