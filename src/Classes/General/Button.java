package Classes.General;

import java.awt.*;
import javax.swing.JComponent;
import javax.swing.plaf.ButtonUI;

public class Button extends ButtonUI {

    public void paint(Graphics g, JComponent c, String d) {

        if (d.equalsIgnoreCase("Entry")) {
            c.setForeground(Color.black);
        } else {
            c.setForeground(Color.white);
        }
    }
}
