package control;

import main.Main;
import view.TopJFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName OutListener
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/28 17:07
 * @Version 1.0
 */
public class OutListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        String j = e.getActionCommand();
        if (j.equals("Yes")) {
            TableListener.jd_o.dispose();
            TopJFrame.c.first(TopJFrame.jp);
            Main.top.repaint();
        } else {
            TableListener.jd_o.dispose();
        }
    }

}

