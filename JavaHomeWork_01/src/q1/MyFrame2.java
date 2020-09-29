package q1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Team  Application  ");
    private JLabel l1 = new JLabel("Name ");
    private JTextField t1 = new JTextField(" ", 8);
    private JLabel l2 = new JLabel("Games ");
    private JTextField t2 = new JTextField("0", 8);
    private JLabel l3 = new JLabel("Points ");
    private JTextField t3 = new JTextField("0", 8);
    private JButton b1 = new JButton("Win");
    private JButton b2 = new JButton("Draw");
    private JButton b3 = new JButton("Loss");
    private JButton b4 = new JButton("Reset");
    private JButton b5 = new JButton("Print");
    private JButton b6 = new JButton("Spare");

    private JPanel p1 = new JPanel();

    private Team t = new Team("Manu", 0, 0);

    public MyFrame2(String s) {
        super(s);
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(6, 2));
        l0.setFont(f);
        l1.setFont(f);
        content.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        t1.setText("Manu");
        refresh();
        setSize(210, 260);
        setVisible(true);
    }

    public void refresh() {
        t2.setText("" + t.readPlayed());
        t3.setText("" + t.readPoints());
    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        if (target == b1) {
            t.win();
            refresh();
        }
        if (target == b2) {
            t.draw();
            refresh();
        }
        if (target == b3) {
            t.loss();
            refresh();
        }
        if (target == b4) {
            //t.reset();
            refresh();
        }
        if (target == b5) {
            t.print_details();
        }
    }

}