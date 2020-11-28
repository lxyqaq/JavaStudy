package view;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName TopJFrame
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 17:16
 * @Version 1.0
 */
public class TopJFrame extends JFrame {

    public static CardLayout c;
    public static JPanel jp;

    public TopJFrame(String name) {
        super(name);
        c = new CardLayout();
        jp = new JPanel(c);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.setLocation(250, 100);
        jp.add(new LoginJPanel());
        jp.add(new ManagerJpanel());
        this.add(jp);
        this.setResizable(false);
        this.setVisible(true);
    }

}
