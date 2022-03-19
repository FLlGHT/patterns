package patterns.templatemethod;

import javax.swing.*;
import java.awt.*;

/**
 * @author FLIGHT
 * @creationDate 19.03.2022
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("take flight", 100, 100);
    }
}
