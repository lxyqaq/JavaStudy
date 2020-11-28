package control;

import view.InsertDialog;
import view.ManagerJpanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName InsertListener
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/28 16:45
 * @Version 1.0
 */
public class InsertListener implements ActionListener {

    private JDialog err, masg;

    public void actionPerformed(ActionEvent e) {

        String id = InsertDialog.t_id.getText();
        String name = InsertDialog.t_name.getText();
        String sex = InsertDialog.cb_sex.getSelectedItem().toString();
        String age = InsertDialog.t_age.getText();
        String ac = InsertDialog.cb_ac.getSelectedItem().toString();
        String sp = InsertDialog.t_address.getText();
        if (id.equals("") || name.equals("") || sex.equals("") || age.equals("") || ac.equals("") || sp.equals("")) {
            InsertDialog.err.setText("None of the information can be empty!");
        } else {
            InsertDialog.err.setText("");
            Object[] data = {id, name, sex, age, ac, sp};
            ManagerJpanel.t_m.addRow(data);
            masg = new JDialog();
            masg.setAlwaysOnTop(true);
            masg.setLayout(null);
            JLabel jl = new JLabel("Added Successfully!");
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
