package ex5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame15 extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Account  Application  ");
    private JLabel l2 = new JLabel("Balance ");
    private JTextField t2 = new JTextField("0", 8);

    private JButton b1 = new JButton("Deposit e.g. 2.34");
    private JTextField t3 = new JTextField("0.00", 8);
    private JButton b2 = new JButton("Withdraw ");
    private JTextField t4 = new JTextField("0.00", 8);
    private JLabel l3 = new JLabel("Message ");
    private JTextField t5 = new JTextField(" ", 8);
    private JPanel p1 = new JPanel();
    private JButton b3 = new JButton("IncrementCent");
    private Money m = new Money(5, 78);

    public MyFrame15(String s) {
        super(s);
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(6, 2));
        l0.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        content.add(l0);
        p1.add(l2);
        p1.add(t2);

        p1.add(b1);
        p1.add(t3);
        p1.add(b2);
        p1.add(t4);
        p1.add(l3);
        p1.add(t5);
        p1.add(b3);
        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t2.setText("" + m.readValue());
        setSize(320, 230);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        t5.setText("");
        if (target == b1) {
            String amt = t3.getText();
            int indexOf = amt.indexOf(".");
            String part1 = amt.substring(0, indexOf);
            String part2 = amt.substring(indexOf + 1);
            int e1 = Integer.parseInt(part1);
            int c1 = Integer.parseInt(part2);
            m.add(e1, c1);
            t2.setText("" + m.readValue());
        }
        if (target == b2) {
            String amt = t4.getText();
            int indexOf = amt.indexOf(".");
            String part1 = amt.substring(0, indexOf);
            String part2 = amt.substring(indexOf + 1);
            int e1 = Integer.parseInt(part1);
            int c1 = Integer.parseInt(part2);
            boolean res = m.sub(e1, c1);
            t2.setText("" + m.readValue());

            if (res == false) t5.setText("Insuff Funds");
        }
        if (target == b3) {
            m.incrementCent();
            t2.setText("" + m.readValue());

        }

    }

}