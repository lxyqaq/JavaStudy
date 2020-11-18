package codingexample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2Footballer extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Footballer Application  ");
    private JLabel l1 = new JLabel("Name ");
    private JTextField t1 = new JTextField("0", 12);
    private JLabel l2 = new JLabel("Age ");
    private JTextField t2 = new JTextField("0", 8);
    private JLabel l3 = new JLabel("Salary ");
    private JTextField t3 = new JTextField("0", 8);
    private JLabel l4 = new JLabel("Age ");
    private JTextField t4 = new JTextField("0", 8);

    private JLabel l5 = new JLabel("Ground ");
    private JTextField t5 = new JTextField("0", 8);
    private JLabel l6 = new JLabel("Number ");
    private JTextField t6 = new JTextField("0", 8);
    private JLabel l7 = new JLabel("Sport ");
    private JTextField t7 = new JTextField("0", 8);
    private JLabel l8 = new JLabel("Position ");
    private JTextField t8 = new JTextField("0", 8);


    private JButton b1 = new JButton("Next");
    private JButton b2 = new JButton("Prev");
    private JButton b3 = new JButton("Insert");
    private JButton b4 = new JButton("Clear");
    private JButton b5 = new JButton("Exit");
    private JPanel p1 = new JPanel();

    private Footballer[] list = new Footballer[20];
    private int count = 8;
    private int current = 0;

    public MyFrame2Footballer() {
        super("Stepper");

        InitializeList();

        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(11, 2));
        l0.setFont(f);
        l1.setFont(f);
        content.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        p1.add(l6);
        p1.add(t6);
        p1.add(l7);
        p1.add(t7);
        p1.add(l8);
        p1.add(t8);


        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        content.add(p1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        refresh();
        setSize(310, 500);
        setVisible(true);
    }


    private void InitializeList() {
        list[0] = new Soccer("Wayne Rooney", 33, "Derby", "Pride Park", 5000000, 9);
        list[1] = new Rugby("Robbie Henshaw", 27, "Leinster", "RDS", 500000, 12);
        list[2] = new Rugby("Mike Sherry", 31, "Munster", "Thomand Pk", 100000, 2);
        list[3] = new Soccer("Juan Mata", 34, "Man U", "Old Trafford", 3000000, 8);

        list[4] = new Soccer("ARonaldo", 32, "Inter", "San Serio", 2000000, 7);
        list[5] = new Rugby("John Cooney", 28, "Ulster", "Ravenhill", 300000, 9);
        list[6] = new Soccer("Mesut Ozil", 30, "Arsenal", "Emirates", 5000000, 8);

        list[7] = new Soccer("Messi", 32, "Barcelona", "Camp Nou", 4000000, 10);
        count = 8;
    }

    private void refresh() {
        t1.setText("" + list[current].readName());
        t2.setText("" + list[current].readAge());
        t3.setText("" + list[current].readSalary());
        t4.setText(list[current].readTeam());
        t5.setText(list[current].readHomeGround());
        t6.setText("" + list[current].readNumber());
        t7.setText(list[current].readSport());
        t8.setText(list[current].readPosition());
    }


    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        if (target == b1) {//next
            if (current < (count - 1)) {
                current++;
                refresh();
            }
        }

        if (target == b2) {                      //prev
            if (current > 0) {
                current--;
                refresh();
            }
        }

        if (target == b3) {//insert
            if (count < 20) {
                String nm = t1.getText();
                int ag = Integer.parseInt(t2.getText());
                int sa = Integer.parseInt(t3.getText());
                String tm = t4.getText();
                String hg = t5.getText();
                int no = Integer.parseInt(t6.getText());
                if (t7.getText() == "Soccer")
                    list[count] = new Soccer(nm, ag, tm, hg, sa, no);
                else list[count] = new Rugby(nm, ag, tm, hg, sa, no);
                current = count;
                count++;
            }
        }

        if (target == b4) {//clear
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
        }

        if (target == b5) {//exit
            System.exit(0);
        }
    }
}

