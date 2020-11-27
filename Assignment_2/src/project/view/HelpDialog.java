//帮助-对话框的设计

package project.view;

import javax.swing.JDialog;
import javax.swing.JLabel;

import project.control.DiaListener;

public class HelpDialog extends JDialog {

    private JLabel lab1, lab2;

    //实例化一个HelpJDialog类对象，指定对话框的父窗体，窗体标题和类型
    public HelpDialog() {
        this.setTitle("帮助");
        this.setLayout(null);

        lab1 = new JLabel("登录账号：admin   密码：123456");


        //setBounds(x,y,width,height); x:组件在容器X轴上的起点 y:组件在容器Y轴上的起点 width:组件的长度 height:组件的高度
        lab1.setBounds(35, 40, 210, 30);


        //在这个窗体中添加标签
        this.add(lab1);


        //设置该窗口的大小
        this.setSize(300, 150);

        //将这个窗口将置于屏幕的中央
        this.setLocationRelativeTo(null);

        //注册一个窗体焦点的监听器
        this.addWindowFocusListener(new DiaListener());

        //显示按钮
        this.setVisible(true);


    }
}
