package q2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame22 extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Match  Application  ");
    private JLabel l1 = new JLabel("Manu ");
    private JTextField t1 = new JTextField(" ", 8);
    private JLabel l2 = new JLabel("City ");
    private JTextField t2 = new JTextField("0", 8);
    private JButton b1 = new JButton("United Score");
    private JButton b2 = new JButton("City Score");
    private JButton b5 = new JButton("Print");
    private JButton b6 = new JButton("Exit");

    private JPanel p1 = new JPanel();

    private Match m = new Match("Manu", "City");

    public MyFrame22(String s) {
        super(s);
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(4, 2));
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
        p1.add(b5);
        p1.add(b6);
        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        l1.setText(m.readTeam1Name());
        l2.setText(m.readTeam2Name());
        refresh();
        setSize(260, 260);
        setVisible(true);
    }

    public void refresh() {
        t1.setText("" + m.readTeam1Score());
        t2.setText("" + m.readTeam2Score());
    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        if (target == b1) {
            m.team1_score();
            refresh();
        }
        if (target == b2) {
            m.team2_score();
            refresh();
        }

        if (target == b5) {
            m.print_score();
        }
        if (target == b6) {
            System.exit(0);
        }

    }

}