package project.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import project.main.Main;
import project.view.FindDialog;
import project.view.InsertDialog;
import project.view.ManagerJpanel;
import project.view.OutDialog;
import project.view.UpdateDialog;

public class TableListener implements MouseListener {

    public static JDialog jd_u, jd_i, jd_o, err, jd_f;

    public void mouseClicked(MouseEvent e) {
        JButton j = (JButton) e.getSource();
        int index = ManagerJpanel.jt.getSelectedRow(); //选择的行
        int sel_num = ManagerJpanel.jt.getSelectedRowCount();
        if (j.getName().equals("del")) {

            if (sel_num == 0) {

                err = new JDialog();
                err.setLayout(null);
                JLabel jl_err = new JLabel("请先选择学生！");
                jl_err.setBounds(100, 20, 200, 30);
                err.add(jl_err);
                err.setSize(300, 130);
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
                int[] r = ManagerJpanel.jt.getSelectedRows();
                for (int i = 0; i < r.length; i++) {
                    //System.out.println("第"+r[i]+"行已删除");
                    ManagerJpanel.t_m.removeRow(r[i] - i);
                    ManagerJpanel.row--;
                }
                err = new JDialog();
                err.setLayout(null);
                JLabel jl_err = new JLabel("删除成功！");
                jl_err.setBounds(110, 20, 200, 30);
                err.add(jl_err);
                err.setSize(300, 130);
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
            }
        } else if (j.getName().equals("update")) {
            if (sel_num > 1) {
                err = new JDialog();
                err.setLayout(null);
                JLabel jl_err = new JLabel("只能对单个学生进行修改！");
                jl_err.setBounds(60, 20, 200, 30);
                err.add(jl_err);
                err.setSize(300, 130);
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
                JLabel jl_err = new JLabel("请先选择学生！");
                jl_err.setBounds(100, 20, 200, 30);
                err.add(jl_err);
                err.setSize(300, 130);
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
            if (ManagerJpanel.row == Main.s_list.length) {
                err = new JDialog();
                err.setLayout(null);
                JLabel jl_err = new JLabel("学生数量已达最大数！");
                jl_err.setBounds(70, 20, 200, 30);
                err.add(jl_err);
                err.setSize(300, 130);
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
        } else if (j.getName().equals("find")) {
            jd_f = new FindDialog();
        } else {
            jd_o = new OutDialog();
        }
    }

    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
