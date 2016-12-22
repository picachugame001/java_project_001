package test03;
//
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import lib.JFrame_VinhNT;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.Color;

//
public class Show_Image_Test03 extends JComponent{
    public  Show_Image_Test03(){
        super();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
    }
    public Dimension getPreferredSize() {
        return new Dimension(100,100);
    }


}
