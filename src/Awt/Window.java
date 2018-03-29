package Awt;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

/*
 *  Window
 */
public class Window extends JFrame {
    Window(String title, int width, int height) {
        this.setSize(width, height);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Canvas panel = new Canvas();
        this.add(panel, BorderLayout.CENTER);

        MouseLabel label = new MouseLabel();
        label.setBackground(new Color(0, 255, 255));
        label.setText("(0, 0)");
        this.add(label, BorderLayout.SOUTH);

        this.addMouseMotionListener(label);
        this.addMouseListener(panel);
        this.setVisible(true);
    }
}
