package Awt;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

/*
 *  Canvas
 */
public class Canvas extends JPanel implements MouseListener {

    public ArrayList<Forme> formes;

    Canvas() {
        this.setBackground(new Color(0, 0, 255));
        this.formes = new ArrayList<Forme>();
    }

    public void add_forme(Forme forme) {
        formes.add(forme);
        repaint();
    }

    public void mousePressed(MouseEvent e){
        add_forme(new Forme(SwingUtilities.isLeftMouseButton(e), e.getX(), e.getY()));        
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Forme f : formes) {
            if(f.is_rect) {
                g.setColor(new Color(255, 255, 0));
                g.fillRect(f.x, f.y, 50, 50);
            } else {
                g.setColor(new Color(255, 0, 255));
                g.fillOval(f.x, f.y, 50, 50);
            }
        }
    }
}
