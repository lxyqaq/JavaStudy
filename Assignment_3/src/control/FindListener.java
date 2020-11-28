package control;

import view.FindDialog;
import view.ManagerJpanel;
import view.QueryJDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName FindListener
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/28 17:13
 * @Version 1.0
 */
public class FindListener implements ActionListener {

    private JDialog err, masg;

    public void actionPerformed(ActionEvent e) {

        int index = ManagerJpanel.jt.getSelectedRow();
        String id = FindDialog.t_id.getText();

        if (id.equals("")) {
            FindDialog.err.setText("ID cannot be empty!");
        } else {
            int count = ManagerJpanel.jt.getRowCount();

            for (int i = 0; i < count; i++) {
                try {
                    ManagerJpanel.jt.getValueAt(i, 0);
                    ManagerJpanel.jt.getValueAt(i, 0).toString();
                } catch (NullPointerException e2) {

                    FindDialog.err.setText("No query results!");
                    break;
                } catch (Exception e1) {
                    continue;
                }

                if (ManagerJpanel.jt.getValueAt(i, 0).toString().equals(id.toString().trim())) {
                    String s_id = ManagerJpanel.jt.getValueAt(i, 0).toString();
                    String s_name = ManagerJpanel.jt.getValueAt(i, 1).toString();
                    String s_sex = ManagerJpanel.jt.getValueAt(i, 2).toString();
                    String s_age = ManagerJpanel.jt.getValueAt(i, 3).toString();
                    String s_ac = ManagerJpanel.jt.getValueAt(i, 4).toString();
                    String s_sp = ManagerJpanel.jt.getValueAt(i, 5).toString();

                    /*String[][] list = new String[1][6];
                    list[0] = new String[]{s_id, s_name, s_sex, s_age, s_ac, s_sp};*/
                    Object[] list = {s_id,s_name,s_sex,s_age,s_ac,s_sp};
                    QueryJDialog dialog = new QueryJDialog(list);

                    dialog.setAlwaysOnTop(true);
                    dialog.setLayout(null);
                    dialog.setSize(1000, 320);
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);


                    break;
                }

            }


        }
    }

}
