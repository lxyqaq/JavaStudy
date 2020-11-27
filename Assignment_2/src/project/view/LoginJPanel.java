package project.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import project.control.LoginListener;
import project.data.StaticData;

public class LoginJPanel extends JPanel {
    private JLabel lab_user, lab_pwd;
    public static JLabel lab_u_err, lab_p_err, login_err;
    public static JTextField tex_user, tex_pwd;
    private JButton but_login, but_help;

    public LoginJPanel() {

        this.setLayout(null);
        this.setSize(1000, 600);

        lab_user = new JLabel(StaticData.M_ID + ":");
        lab_pwd = new JLabel(StaticData.M_PWD + ":");
        lab_u_err = new JLabel();
        lab_p_err = new JLabel();
        tex_user = new JTextField(10);
        tex_pwd = new JPasswordField(10);
        but_login = new JButton(StaticData.LOGIN_TEXT);
        but_help = new JButton(StaticData.HELP_TEXT);
        login_err = new JLabel();

        lab_user.setBounds(400, 150, 100, 30);
        lab_pwd.setBounds(390, 200, 100, 30);
        tex_user.setBounds(470, 150, 100, 30);
        lab_u_err.setBounds(580, 150, 120, 30);
        lab_u_err.setForeground(Color.RED);
        tex_pwd.setBounds(470, 200, 100, 30);
        lab_p_err.setBounds(580, 200, 100, 30);
        lab_u_err.setForeground(Color.RED);
        but_login.setBounds(370, 250, 80, 30);
        but_help.setBounds(490, 250, 80, 30);
        login_err.setBounds(370, 300, 200, 30);
        login_err.setForeground(Color.RED);
        but_login.addActionListener(new LoginListener());
        but_help.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new HelpDialog();
            }
        });

        this.add(lab_user);
        this.add(lab_pwd);
        this.add(lab_u_err);
        this.add(lab_p_err);
        this.add(tex_user);
        this.add(tex_pwd);
        this.add(but_login);
        this.add(but_help);
        this.add(login_err);
    }
}
