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
        Graphics2D g2 = (Graphics2D) g;
        g.drawString("Cơn mưa tình yêu",5,20);
        BufferedImage img = null;
        try {
            System.out.print(JFrame_VinhNT.path);
            img = ImageIO.read(new File(JFrame_VinhNT.path.concat("/../Picachu_Class/output/h003.png")));
        } catch (IOException e) {
            System.err.println("IOException: "+ e.getMessage());
        }
        g.drawImage(img,50,50,null);
        g.drawLine(0,0,30,30);
        float dash1[] = {10.0f};
        BasicStroke dashed = new BasicStroke(1.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10.0f,dash1,0.0f);
        g2.setStroke(dashed);
        GradientPaint redtowhite = new GradientPaint(0,0,Color.RED,300,0,Color.white);
        g2.setPaint(redtowhite);
        g2.draw(new Rectangle2D.Double(0,0,400,400));
        g2.fill(new Rectangle2D.Double(0,0,400,400));
       
    }
    public Dimension getPreferredSize() {
        return new Dimension(480,480);
    }


}
