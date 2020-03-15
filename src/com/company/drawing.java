package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class drawing extends Frame {
drawing(){
    settingUI();
    Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
    System.out.println(screenSize.getHeight());
    System.out.println(screenSize.getWidth());
    addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e) {
            dispose();
        }
    });
}

    private void settingUI(){
    setTitle("Scene");
    setLayout(null);
    setSize(1300,800);
    setVisible(true);
}

public void paint(Graphics g)
{
    int[] xpoints = {125, 145, 165, 125};
    int[] ypoints = {145, 125, 145, 145};
    int npoints = 4;
    setBackground(new Color(131,196,232));
    g.setColor(new Color(118,162,107));
    g.fillArc(100, 400, 900,800,0,180); //backgroundgrass
    g.setColor(new Color(178,187,119));
    g.fillArc(200, 400, 700,800,0,180);
    g.setColor(new Color(251,214,152));
    g.fillRect(450,230,200,200);
    g.fillPolygon(xpoints, ypoints, npoints);
}

    public static void main(String[] args) {
    new drawing();
    }
}
