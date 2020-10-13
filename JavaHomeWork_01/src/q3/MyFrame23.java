package q3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame23 extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Dice  Application  ");
    private JLabel l1 = new JLabel("Value1  ");
    private JTextField t1 = new JTextField(" ", 8);
    private JLabel l2 = new JLabel("Value2 ");
    private JTextField t2 = new JTextField("0", 8);
    private JButton b1 = new JButton("Roll");//private JTextField t3=new JTextField("0",8);
    private JButton b2 = new JButton("Exit");//private JTextField t4=new JTextField("0",8);
    private JButton b3 = new JButton("sum");
    private JTextField t3 = new JTextField("0", 8);
    private JButton b4 = new JButton("EQual");
    private JTextField t4 = new JTextField("0", 8);

    private JPanel p1 = new JPanel();

    private PairDice p = new PairDice(0, 0);

    public MyFrame23(String s) {
        super(s);
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(5, 2));
        l0.setFont(f);
        l1.setFont(f);
        l2.setFont(f);
        content.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(t3);
        p1.add(b4);
        p1.add(t4);
        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        t1.setText("0");
        t2.setText("0");
        setSize(210, 230);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();

        if (target == b1) {
            t3.setText("");
            t4.setText("");
            p.rollDice();
            t1.setText("" + p.readValue1());
            t2.setText("" + p.readValue2());
        }
        if (target == b2) {
            System.exit(0);
        }
        if (target == b3) {
            t3.setText("" + p.sumDiceValues());
        }
        if (target == b4) {
            t4.setText("" + p.valuesEqual());
        }

    }

}