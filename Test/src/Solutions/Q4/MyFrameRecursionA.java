package Solutions;

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

class MyFrameRecursionA extends JFrame implements ActionListener {
    private JLabel l0 = new JLabel("  Recur  Application  ");
    private JLabel l1 = new JLabel("Number: ");
    private JTextField t1 = new JTextField("1234567", 8);
    private JTextField t2 = new JTextField("", 8);
    private JTextField t3 = new JTextField("", 8);

    private JButton b1 = new JButton("addEven");
    private JButton b2 = new JButton("NoTwos");
    private JPanel p1 = new JPanel();

    // addEven(12348) = 14
    //
    public int addEven(int value) {
        int last = value % 10;
        int rest = value / 10;
        if (value < 10) {
            if (value % 2 == 0) return value;
            else return 0;
        } else {
            if (last % 2 == 0) return last + addEven(rest);
            else return 0 + addEven(rest);
        }
    }

    // noTwos(11345)=true
    // noTwos(12345)=false
    public boolean noTwos(int value) {
        int last = value % 10;
        int rest = value / 10;
        if (value < 10) {
            if (value == 2) return false;
            else return true;
        } else {
            if (last == 2) return false;
            else return noTwos(rest);
        }
    }

    public MyFrameRecursionA(String s) {
        super(s);
        Container content = getContentPane();
        content.setLayout(new FlowLayout());
        Font f = new Font("TimesRoman", Font.BOLD, 20);
        p1.setLayout(new GridLayout(3, 2));
        l0.setFont(f);
        content.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        p1.add(t2);
        p1.add(b2);
        p1.add(t3);

        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(240, 200);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

        Object target = e.getSource();
        if (target == b1) {
            int value = Integer.parseInt(t1.getText());
            int res = this.addEven(value);
            t2.setText("" + res);
        }
        if (target == b2) {
            int value = Integer.parseInt(t1.getText());
            boolean res = this.noTwos(value);
            t3.setText("" + res);
        }
    }

}