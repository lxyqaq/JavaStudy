package control;

import bean.Archiect;
import bean.Designer;
import bean.Employee;
import bean.Programmer;
import view.InsertDialog;
import view.ManagerJpanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

/**
 * @ClassName InsertListener
 * @Description TODO
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
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
            if (sp.equals("Employee")) {
                ManagerJpanel.arrayList.add(new Employee(id, name, sex, age, ac));
                addData();
                diplay();
            } else if (sp.equals("Programmer")) {
                ManagerJpanel.arrayList.add(new Programmer(id, name, sex, age, ac));
                addData();
                diplay();
            } else if (sp.equals("Designer")) {
                ManagerJpanel.arrayList.add(new Designer(id, name, sex, age, ac));
                addData();
                diplay();
            } else if (sp.equals("Archiect")) {
                ManagerJpanel.arrayList.add(new Archiect(id, name, sex, age, ac));
                addData();
                diplay();
            } else {
                InsertDialog.err.setText("Please enter the correct type of work");
            }

        }
    }

    public void addData() {
        String id1 = ManagerJpanel.arrayList.get(ManagerJpanel.arrayList.size() - 1).getId();
        String name1 = ManagerJpanel.arrayList.get(ManagerJpanel.arrayList.size() - 1).getName();
        String sex1 = ManagerJpanel.arrayList.get(ManagerJpanel.arrayList.size() - 1).getSex();
        String salary1 = ManagerJpanel.arrayList.get(ManagerJpanel.arrayList.size() - 1).getSalary();
        String department1 = ManagerJpanel.arrayList.get(ManagerJpanel.arrayList.size() - 1).getDepartment();
        String type1 = ManagerJpanel.arrayList.get(ManagerJpanel.arrayList.size() - 1).readType();
        Object[] data = {id1, name1, sex1, salary1, department1, type1};
        ManagerJpanel.t_m.addRow(data);
    }

    public void diplay() {
        masg = new JDialog();
        masg.setAlwaysOnTop(true);
        masg.setLayout(null);
        JLabel jl = new JLabel("Added Successfully!");
        jl.setBounds(110, 20, 150, 30);
        masg.add(jl);
        masg.setSize(350, 130);
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
