package project.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import project.control.OutListener;

public class OutDialog extends JDialog {

    public OutDialog() {
        this.setLayout(null);
        this.setSize(380, 180);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        OutListener o = new OutListener();
        JLabel msg = new JLabel("确定退出登录？");
        msg.setBounds(130, 20, 100, 30);
        JButton ok = new JButton("确定");
        ok.setBounds(50, 80, 100, 30);
        ok.addActionListener(o);
        JButton cancle = new JButton("取消");
        cancle.setBounds(200, 80, 100, 30);
        cancle.addActionListener(o);
        add(msg);
        add(ok);
        add(cancle);
    }
}
