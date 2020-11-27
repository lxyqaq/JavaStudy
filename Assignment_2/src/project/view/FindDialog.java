package project.view;

import javax.swing.JDialog;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import project.control.FindListener;
import project.control.TableListener;
import project.data.StaticData;

/*JDialog窗体是Swing组件中的对话框
JDialog窗体的功能是从一个窗体中弹出另一个窗体*/

public class FindDialog extends JDialog {

    //JLabel 对象可以显示文本
    private JLabel id, name, sex, age, academy, address;
    public static JLabel err;
    public static JTextField t_id, t_name, t_sex, t_age, t_academy, t_address;
    private JButton ok, cancle;//定义两个按钮
    public static JComboBox cb_sex, cb_ac;//定义下拉菜单控件

    public FindDialog() {
        this.setAlwaysOnTop(true);//置顶
        this.setTitle("查找学生信息");//给顶部框加入字
        this.setLayout(null);//用户界面上的屏幕组件的格式布局
        this.setSize(580, 320);//定义这个查找弹窗的大小
        this.setLocationRelativeTo(null);//设置窗口相对于指定组件的位置，null代表的是居中
        int index = ManagerJpanel.jt.getSelectedRow();


        //从StaticData.java中获取汉字内容并在此定义为标签，方便后续使用
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


        ok = new JButton("查找");
        cancle = new JButton("取消");


        cb_sex.addItem("男");
        cb_sex.addItem("女");

        //把汉字的位置固定好

        /* setBounds(x,y,width,height)
         *  x:组件在容器X轴上的起点
         * y:组件在容器Y轴上的起点
         * width:组件的长度
         * height:组件的高度
         */
        id.setBounds(30, 50, 30, 30);
        t_id.setBounds(80, 50, 100, 30);
        name.setBounds(200, 50, 30, 30);
        t_name.setBounds(250, 50, 100, 30);
        sex.setBounds(370, 50, 30, 30);
        cb_sex.setBounds(420, 50, 100, 30);

        //定义汉字后的提示框的位置
        age.setBounds(30, 100, 30, 30);
        t_age.setBounds(80, 100, 100, 30);
        academy.setBounds(200, 100, 30, 30);
        cb_ac.setBounds(250, 100, 100, 30);
        address.setBounds(370, 100, 30, 30);
        t_address.setBounds(420, 100, 100, 30);


        //在组合框或列表框中添加一个新数据项，并且可以指定数据项索引。
        cb_ac.addItem("计算机学院");
        cb_ac.addItem("经济管理学院");
        cb_ac.addItem("艺术学院");
        cb_ac.addItem("外国语学院");
        cb_ac.addItem("海洋学院");
        cb_ac.addItem("电信学院");
        cb_ac.addItem("机械学院");

        err.setBounds(30, 150, 120, 30);
        err.setForeground(Color.RED);//设置前景色（在查询不到学生的时候，会出现红色提示）

        //在这里定义查找、取消的两个按钮位置
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
        //add(cancle);
        setVisible(true);
    }
}
