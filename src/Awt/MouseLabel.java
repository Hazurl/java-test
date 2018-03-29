package Awt;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

/*
 *  MouseLabel
 */
public class MouseLabel extends JLabel implements MouseMotionListener {
	public void mouseMoved (MouseEvent mouse) {
        this.setText("(" + mouse.getX() + ", " + mouse.getY() + ")");
    }

    public void mouseDragged(MouseEvent mouse) {

    }
}
