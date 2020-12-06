package control;

import view.*;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @ClassName TableListener
 * @Description TODO
 * @Author Xiangyu Liu @Email A00279565@student.ait.ie
 * @Date 2020/11/27 17:29
 * @Version 1.0
 */
public class TableListener implements MouseListener {

    public static JDialog jd_u, jd_i, jd_o, err, jd_f;

    @Override
    public void mouseClicked(MouseEvent e) {

        JButton j = (JButton) e.getSource();
        int index = ManagerJpanel.jt.getSelectedRow();
        int sel_num = ManagerJpanel.jt.getSelectedRowCount();
        if (j.getName().equals("del")) {
            if (sel_num == 0) {

                err = new JDialog();
                err.setLayout(null);
                JLabel jl_err = new JLabel("Please select students first!");
                jl_err.setBounds(100, 20, 200, 30);
                err.add(jl_err);
                err.setSize(350, 130);
                err.setLocationRelativeTo(null);
                err.setVisible(true);

                Thread tr_err = new Thread() {
                    public void run() {
                        try {
                            this.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        err.dispose();
                    }
                };
                tr_err.start();
            } else {
                int[] r = ManagerJpanel.jt.getSelectedRows();
                for (int i = 0; i < r.length; i++) {
                    ManagerJpanel.t_m.removeRow(r[i] - i);
                    ManagerJpanel.row--;
                }
                err = new JDialog();
                err.setLayout(null);
                JLabel jl_err = new JLabel("Successfully Deleted!");
                jl_err.setBounds(110, 20, 200, 30);
                err.add(jl_err);
                err.setSize(350, 130);
                err.setLocationRelativeTo(null);
                err.setVisible(true);

                Thread tr_err = new Thread() {
                    public void run() {
                        try {
                            this.sleep(1300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        err.dispose();
                    }
                };
                tr_err.start();
            }
        } else if (j.getName().equals("update")) {
            if (sel_num > 1) {
                err = new JDialog();
                err.setLayout(null);
                JLabel jl_err = new JLabel("Only a single employee can be modified!");
                jl_err.setBounds(60, 20, 200, 30);
                err.add(jl_err);
                err.setSize(350, 130);
                err.setLocationRelativeTo(null);
                err.setVisible(true);

                Thread tr_err = new Thread() {
                    public void run() {
                        try {
                            this.sleep(1800);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        err.dispose();
                    }

                    ;
                };
                tr_err.start();

            } else if (sel_num == 0) {
                err = new JDialog();
                err.setLayout(null);
                JLabel jl_err = new JLabel("Please select employees first!");
                jl_err.setBounds(100, 20, 200, 30);
                err.add(jl_err);
                err.setSize(350, 130);
                err.setLocationRelativeTo(null);
                err.setVisible(true);

                Thread tr_err = new Thread() {
                    public void run() {
                        try {
                            this.sleep(1500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        err.dispose();
                    }

                    ;
                };
                tr_err.start();
            } else {
                jd_u = new UpdateDialog();
            }
        } else if (j.getName().equals("insert")) {
            if (ManagerJpanel.row == 20) {
                err = new JDialog();
                err.setLayout(null);
                JLabel jl_err = new JLabel("The number of employees has reached the maximum!");
                jl_err.setBounds(70, 20, 200, 30);
                err.add(jl_err);
                err.setSize(350, 130);
                err.setLocationRelativeTo(null);
                err.setVisible(true);

                Thread tr_err = new Thread() {
                    public void run() {
                        try {
                            this.sleep(1300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        err.dispose();
                    }

                    ;
                };
                tr_err.start();
            } else {
                jd_i = new InsertDialog();
            }
        }else if (j.getName().equals("find")) {
            jd_f = new FindDialog();
        } else {
            jd_o = new OutDialog();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
