package Q3Skeleton;

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

class MyFrameTaxi extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Taxt  Application  ");
    private JLabel l1 = new JLabel("Number ");
    private JTextField t1 = new JTextField(" ", 8);
    private JLabel l2 = new JLabel("Driver ");
    private JTextField t2 = new JTextField("0", 8);
    private JLabel l3 = new JLabel("Capacity ");
    private JTextField t3 = new JTextField(" ", 8);
    private JLabel l4 = new JLabel("Passengers ");
    private JTextField t4 = new JTextField("0", 8);
    private JLabel l5 = new JLabel("Available ");
    private JTextField t5 = new JTextField("0", 8);
    private JLabel l6 = new JLabel("Message ");
    private JTextField t6 = new JTextField(" ", 8);


    private JButton b1 = new JButton("addPassengers");
    String[] list = {"1", "2", "3", "4", "5", "6", "7"};
    private JComboBox t7 = new JComboBox(list);
    private JButton b2 = new JButton("At_Destination");
    private JButton b3 = new JButton("Exit");

    private JPanel p1 = new JPanel();

    private Taxi t = new Taxi("999123", "John Shine", 7);

    public MyFrameTaxi(String s) {
        super(s);
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(11, 2));
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
        p1.add(l5);
        p1.add(t5);

        p1.add(b1);
        p1.add(t7);
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
        t1.setText("999123");
        t2.setText("John Smith");
        t3.setText("" + t.readCapacity());
        t4.setText("" + t.readPassengers());
        t5.setText("" + t.readAvailableSpaces());

    }

    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        t6.setText("");
        if (target == b1) {
            // try {
            int amt = Integer.parseInt((String) t7.getSelectedItem());
            try {
                t.addPassengers(amt);
            } catch (TaxiFull taxiFull) {
                taxiFull.printStackTrace();
            }
            refresh();
            //   }
            // catch(Exception e1)
            //      {t6.setText("Not Enough Space");}
        }
        if (target == b2) {
            t.reachDestination();
            refresh();
        }
        if (target == b3) {
            System.exit(0);
        }
    }

}