package project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import project.view.FindDialog;
import project.view.ManagerJpanel;
import project.view.QueryJDialog;

public class FindListener implements ActionListener {
    private JDialog err, masg;

    public void actionPerformed(ActionEvent e) {
        int index = ManagerJpanel.jt.getSelectedRow();
        String id = FindDialog.t_id.getText();//从id的输入框中得到文本信息

        if (id.equals("")) {
            FindDialog.err.setText("学号不能为空！");
        } else {

            int count = ManagerJpanel.jt.getRowCount();//得到目前的学生信息的个数

            for (int i = 0; i < count; i++) {

                try {    //异常处理
                    ManagerJpanel.jt.getValueAt(i, 0);
                    ManagerJpanel.jt.getValueAt(i, 0).toString();
                } catch (NullPointerException e2) {

                    FindDialog.err.setText("无查询结果！");
                    break;
                } catch (Exception e1) {
                    continue;
                }

                //如果匹配到相应的学号，则将该学生各项信息赋值给相应变量，供后续输出使用
                if (ManagerJpanel.jt.getValueAt(i, 0).toString().equals(id.toString().trim())) {
                    String s_id = ManagerJpanel.jt.getValueAt(i, 0).toString();
                    String s_name = ManagerJpanel.jt.getValueAt(i, 1).toString();
                    String s_sex = ManagerJpanel.jt.getValueAt(i, 2).toString();
                    String s_age = ManagerJpanel.jt.getValueAt(i, 3).toString();
                    String s_ac = ManagerJpanel.jt.getValueAt(i, 4).toString();
                    String s_sp = ManagerJpanel.jt.getValueAt(i, 5).toString();

                    String[][] list = new String[1][6];
                    list[0] = new String[]{s_id, s_name, s_sex, s_age, s_ac, s_sp};
                    QueryJDialog dialog = new QueryJDialog(list);

                    dialog.setAlwaysOnTop(true);
                    dialog.setLayout(null);
                    dialog.setSize(1000, 320);
                    dialog.setLocationRelativeTo(null);//设置窗口居中。
                    dialog.setVisible(true);


                    break;
                }

            }


        }
    }
}
