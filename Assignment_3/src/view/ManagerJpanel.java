package view;

import bean.Archiect;
import bean.Designer;
import bean.Employee;
import bean.Programmer;
import control.TableListener;
import main.Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * @ClassName ManagerJpanel
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 17:24
 * @Version 1.0
 */
public class ManagerJpanel extends JPanel {

    private JButton jb_del, jb_find, jb_update, jb_insert, jb_out;
    public JTextField tex_id;
    private JLabel lab_check, lab_id;
    public static int row = 6;
    public static String[] t_head = {"ID", "Name", "Gender", "Salary", "Department", "Type"};
    public static ArrayList<Employee> arrayList = new ArrayList<Employee>();
    public static DefaultTableModel t_m = new DefaultTableModel(t_head, 0);

    public static final JTable jt = new JTable(t_m) {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    private JScrollPane js;

    public ManagerJpanel() {
        Employee e1 = new Employee("1", "Jack", "Male", "12000", "Front-end");
        Employee e2 = new Programmer("2", "Nathan", "Male", "15000", "Back-end");
        Employee e3 = new Designer("3", "Nancy", "Female", "10000", "Software Test");
        Employee e4 = new Archiect("4", "John", "Male", "18000", "AI Development");
        Employee e5 = new Programmer("5", "Linda", "Female", "11000", "Back-end");
        Employee e6 = new Programmer("6", "Tom", "Male", "14000", "Big data");
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        arrayList.add(e5);
        arrayList.add(e6);
        for (int i = 0; i < arrayList.size(); i++) {
            String id = arrayList.get(i).getId();
            String name = arrayList.get(i).getName();
            String sex = arrayList.get(i).getSex();
            String salary = arrayList.get(i).getSalary();
            String department = arrayList.get(i).getDepartment();
            String type = arrayList.get(i).readType();
            Object[] data = {id, name, sex, salary, department, type};
            t_m.addRow(data);
        }

        this.repaint();
        this.setLayout(null);

        jb_del = new JButton(StaticData.DEL);
        jb_find = new JButton(StaticData.FIND);
        jb_update = new JButton(StaticData.UPDATE);
        jb_insert = new JButton(StaticData.INSETT);
        jb_out = new JButton(StaticData.OUT);

        tex_id = new JTextField();
        lab_check = new JLabel(StaticData.CHECK);
        lab_id = new JLabel(StaticData.S_ID + ":");
        jt.setDragEnabled(false);
        js = new JScrollPane();
        jt.setBackground(Color.LIGHT_GRAY);
        jt.setRowHeight(30);
        jt.setColumnSelectionAllowed(false);
        jt.setCellSelectionEnabled(false);
        jt.setRowSelectionAllowed(true);
        js.setViewportView(jt);
        js.setBounds(220, 30, 700, 450);

        jb_del.setBounds(20, 50, 100, 30);
        jb_del.setName("del");
        jb_find.setBounds(20, 100, 100, 30);
        jb_find.setName("find");
        jb_update.setBounds(20, 150, 100, 30);
        jb_update.setName("update");
        jb_insert.setBounds(20, 200, 100, 30);
        jb_insert.setName("insert");
        jb_out.setBounds(20, 250, 100, 30);
        jb_out.setName("out");

        TableListener t = new TableListener();
        jb_del.addMouseListener(t);
        jb_find.addMouseListener(t);
        jb_insert.addMouseListener(t);
        jb_update.addMouseListener(t);
        jb_out.addMouseListener(t);

        this.add(jb_del);
        this.add(jb_find);
        this.add(jb_update);
        this.add(jb_insert);
        this.add(jb_out);
        this.add(js);
        this.setSize(1000, 600);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.black);
        g2d.drawLine(150, 0, 150, 600);
    }

}
