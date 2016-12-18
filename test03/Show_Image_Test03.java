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

//
public class Show_Image_Test03 extends JComponent{
    public  Show_Image_Test03(){
        super();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Cơn mưa tình yêu",100,100);
        BufferedImage img = null;
        System.out.print(JFrame_VinhNT.path);
        try {
            img = ImageIO.read(new File(JFrame_VinhNT.path.concat("/../Picachu_Class/output/h002.png")));
        } catch (IOException e) {
            System.err.println("IOException: "+ e.getMessage());
        }
        g.drawImage(img,50,50,null);
        
       
    }
    public Dimension getPreferredSize() {
        return new Dimension(300,300);
    }


}
