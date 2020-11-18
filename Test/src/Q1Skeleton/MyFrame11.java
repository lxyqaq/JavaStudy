package Q1Skeleton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Solutions.Q1.Account;

class MyFrame11 extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Account  Application  ");
    private JLabel l1 = new JLabel("Name ");
    private JTextField t1 = new JTextField(" ", 8);
    private JLabel l2 = new JLabel("Balance ");
    private JTextField t2 = new JTextField("0", 8);
    private JButton b1 = new JButton("Deposit");//private JTextField t3=new JTextField("0",8);
    private String[] list1 = {"10", "20", "50", "100"};
    private JComboBox t3 = new JComboBox(list1);


    private JButton b2 = new JButton("Withdraw");//private JTextField t4=new JTextField("0",8);
    private JComboBox t4 = new JComboBox(list1);
    private JLabel l3 = new JLabel("Message ");
    private JTextField t5 = new JTextField(" ", 8);
    private JPanel p1 = new JPanel();

    private Account a = new Account("J.Smith", 100);

    public MyFrame11(String s) {
        super(s);
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(5, 2));
        l0.setFont(f);
        l1.setFont(f);
        content.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(b1);
        p1.add(t3);
        p1.add(b2);
        p1.add(t4);
        p1.add(l3);
        p1.add(t5);
        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);

        t1.setText("J.Smith");
        t2.setText("" + a.read_balance());
        setSize(210, 230);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        t5.setText("");
        if (target == b1) {
            int amt = Integer.parseInt((String) t3.getSelectedItem());
            a.deposit(amt);
            t2.setText("" + a.read_balance());
        }
        if (target == b2) {
            int amt = Integer.parseInt((String) t4.getSelectedItem());
            boolean res = a.withdraw(amt);
            t2.setText("" + a.read_balance());
            if (res == false) t5.setText("Insuff Funds");
        }

    }

}