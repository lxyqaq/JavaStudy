package project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import project.view.ManagerJpanel;
import project.view.UpdateDialog;

public class UpdateListener implements ActionListener {
    private JDialog err, masg;

    public void actionPerformed(ActionEvent e) {
        int index = ManagerJpanel.jt.getSelectedRow();
        String id = UpdateDialog.t_id.getText();
        String name = UpdateDialog.t_name.getText();
        String sex = UpdateDialog.cb_sex.getSelectedItem().toString();
        String age = UpdateDialog.t_age.getText();
        String ac = UpdateDialog.cb_ac.getSelectedItem().toString();
        String sp = UpdateDialog.t_address.getText();
        //System.out.println(id+","+name+","+sex+","+age+","+ac);
        if (id.equals("") || name.equals("") || sex.equals("") || age.equals("") || ac.equals("") || sp.equals("")) {
            UpdateDialog.err.setText("各项信息都不能为空！");
        } else {
            UpdateDialog.err.setText("");
            ManagerJpanel.t_m.setValueAt(id, index, 0);
            ManagerJpanel.t_m.setValueAt(name, index, 1);
            ManagerJpanel.t_m.setValueAt(sex, index, 2);
            ManagerJpanel.t_m.setValueAt(age, index, 3);
            ManagerJpanel.t_m.setValueAt(ac, index, 4);
            ManagerJpanel.t_m.setValueAt(sp, index, 5);
            masg = new JDialog();
            masg.setLayout(null);
            masg.setAlwaysOnTop(true);
            masg.setSize(300, 130);
            masg.setLocationRelativeTo(null);
            JLabel jl = new JLabel("修改成功！");
            jl.setBounds(110, 20, 150, 30);
            masg.setVisible(true);
            masg.add(jl);
            masg.repaint();
            Thread tr = new Thread() {
                public void run() {
                    try {
                        this.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    masg.dispose();
                    TableListener.jd_u.dispose();
                };
            };
            tr.start();
        }
    }
}
