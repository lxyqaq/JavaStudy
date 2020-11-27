package project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import project.view.ManagerJpanel;
import project.view.InsertDialog;

public class InsertListener implements ActionListener {
    private JDialog err, masg;

    public void actionPerformed(ActionEvent e) {

        String id = InsertDialog.t_id.getText();
        String name = InsertDialog.t_name.getText();
        String sex = InsertDialog.cb_sex.getSelectedItem().toString();
        String age = InsertDialog.t_age.getText();
        String ac = InsertDialog.cb_ac.getSelectedItem().toString();
        String sp = InsertDialog.t_address.getText();
//		System.out.println(id+","+name+","+sex+","+age+","+ac);
        if (id.equals("") || name.equals("") || sex.equals("") || age.equals("") || ac.equals("") || sp.equals("")) {
            InsertDialog.err.setText("各项信息都不能为空！");
        } else {
            InsertDialog.err.setText("");
            ManagerJpanel.t_m.setValueAt(id, ManagerJpanel.row, 0);
            ManagerJpanel.t_m.setValueAt(name, ManagerJpanel.row, 1);
            ManagerJpanel.t_m.setValueAt(sex, ManagerJpanel.row, 2);
            ManagerJpanel.t_m.setValueAt(age, ManagerJpanel.row, 3);
            ManagerJpanel.t_m.setValueAt(ac, ManagerJpanel.row, 4);
            ManagerJpanel.t_m.setValueAt(sp, ManagerJpanel.row, 5);
            masg = new JDialog();
            masg.setAlwaysOnTop(true);
            masg.setLayout(null);
            JLabel jl = new JLabel("新增成功！");
            jl.setBounds(110, 20, 150, 30);
            masg.add(jl);
            masg.setSize(300, 130);
            masg.setLocationRelativeTo(null);
            masg.setVisible(true);
            masg.repaint();
            Thread tr = new Thread() {
                public void run() {
                    try {
                        this.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    masg.dispose();
                    TableListener.jd_i.dispose();
                    ManagerJpanel.row++;
                }

                ;
            };
            tr.start();
        }
    }

}
