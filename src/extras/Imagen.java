/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author BRAYAN
 */
public class Imagen extends javax.swing.JPanel{
    
    public Imagen(int width, int height){
        this.setSize(width, height);
    }
    
    @Override
    public void paint(Graphics g){
        Dimension dim = this.getSize();
        ImageIcon img = new ImageIcon(getClass().getResource("../img/fondo.jpg"));
        g.drawImage(img.getImage(), 0, 0, (int)(dim.getWidth()), (int)(dim.getHeight()), null);
        this.setOpaque(false);
        super.paintComponent(g);
    }
}
