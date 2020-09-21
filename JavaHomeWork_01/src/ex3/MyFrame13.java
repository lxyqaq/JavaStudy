package ex3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame13 extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Boat Application  ");
    private JLabel l1 = new JLabel("totalBoats ");
    private JTextField t1 = new JTextField(" ", 8);
    private JLabel l2 = new JLabel("boatsHired ");
    private JTextField t2 = new JTextField("0", 8);
    private JLabel l3 = new JLabel("Available ");
    private JTextField t3 = new JTextField("0", 8);
    private JButton b1 = new JButton("hireBoat");
    private JButton b2 = new JButton("returnBoat");
    private JLabel l4 = new JLabel("Message ");
    private JTextField t4 = new JTextField("0", 8);
    private JPanel p1 = new JPanel();

    private BoatClub b = new BoatClub(10);

    public MyFrame13(String s) {
        super(s);
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(5, 2));
        l0.setFont(f);
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        content.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(b1);
        p1.add(b2);
        p1.add(l4);
        p1.add(t4);

        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);

        t1.setText("Manu");
        refresh();
        setSize(230, 220);
        setVisible(true);
    }

    public void refresh() {
        t1.setText("" + b.readTotal());
        t2.setText("" + b.readHired());
        t3.setText("" + b.readAvailable());
        t4.setText("");
    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        if (target == b1) {
            boolean res = b.hireBoat();
            refresh();
            if (res == false) t4.setText("Not Allowed");
        }
        if (target == b2) {
            boolean res = b.returnBoat();
            refresh();
            if (res == false) t4.setText("Not Allowed");
        }

    }

}