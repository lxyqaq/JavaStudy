package project.control;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

//内部类，用来处理于窗体焦点的监听器
public class DiaListener implements WindowFocusListener {

    public void windowGainedFocus(WindowEvent e) {

    }

    public void windowLostFocus(WindowEvent e) {
        e.getComponent().disable();
    }

}
