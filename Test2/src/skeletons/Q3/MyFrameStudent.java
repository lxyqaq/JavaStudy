package skeletons.Q3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrameStudent extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Student  Application  ");
    private JLabel l1 = new JLabel("Course ");
    private JTextField t1 = new JTextField(" ", 8);
    private JLabel l2 = new JLabel("Module ");
    private JTextField t2 = new JTextField("0", 8);
    private JLabel l3 = new JLabel("Year");
    private JTextField t3 = new JTextField(" ", 8);
    private JLabel l4 = new JLabel("Mark ");
    private JTextField t4 = new JTextField("0", 8);
    //	private JLabel l5 = new JLabel("Available ");
    private JTextField t5 = new JTextField("1", 8);
    private JLabel l6 = new JLabel("Message ");
    private JTextField t6 = new JTextField(" ", 8);


    private JButton b1 = new JButton("set Year");
    //String [] list = {"1","2","3","4","5","6","7"};
    //private JComboBox t7=new JComboBox(list);
    private JButton b2 = new JButton("Reset");
    private JButton b3 = new JButton("Exit");

    private JPanel p1 = new JPanel();

    private Student s = new Student("J.Smith", "Software", 3, 50);

    public MyFrameStudent(String s) {
        super(s);
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(10, 2));
        l0.setFont(f);
        content.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(b1);
        p1.add(t5);
        p1.add(b2);
        p1.add(b3);

        p1.add(l6);
        p1.add(t6);
        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        refresh();
        setSize(280, 300);
        setVisible(true);
    }


    public void refresh() {
        t1.setText(s.readName());
        t2.setText(s.readModule());
        t3.setText("" + s.readYear());
        t4.setText("" + s.readMark());

    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        t6.setText("");
        if (target == b1) {
            try {
                int amt = Integer.parseInt(t5.getText());
                s.setYear(amt);

                refresh();
            } catch (Exception e1) {
                t6.setText("Must be 1-4");
            }
        }
        if (target == b2) {
            s.resetMark();
            refresh();
        }
        if (target == b3) {
            System.exit(0);
        }
    }

}