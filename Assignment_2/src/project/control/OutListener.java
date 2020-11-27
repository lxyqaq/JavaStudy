package project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import project.main.Main;
import project.view.TopJFrame;

public class OutListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        String j = e.getActionCommand();
        if (j.equals("确定")) {
            TableListener.jd_o.dispose();
            TopJFrame.c.first(TopJFrame.jp);
            Main.top.repaint();
        } else {
            TableListener.jd_o.dispose();
        }
    }

}
