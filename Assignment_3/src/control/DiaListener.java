package control;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

/**
 * @ClassName DiaListener
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/11/27 17:26
 * @Version 1.0
 */
public class DiaListener implements WindowFocusListener {
    public void windowGainedFocus(WindowEvent e) {

    }

    public void windowLostFocus(WindowEvent e) {
        e.getComponent().disable();
    }
}
