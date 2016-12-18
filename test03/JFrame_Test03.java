package test03;
import lib.Sub_JFrame_VinhNT;
import lib.Sub_JButton_VinhNT;
import javax.swing.SpringLayout;
import javax.swing.JPanel;

public class JFrame_Test03 extends Sub_JFrame_VinhNT{
    private Show_Image_Test03 image;
    public JFrame_Test03(Sub_JButton_VinhNT button_start01){
        super(button_start01);
    }
    protected int get_Min_Height(){
        return 500;
    }
    protected int get_Min_Width(){
        return 500;
    }
    public void build_Layout(){
        image = new  Show_Image_Test03();
        JPanel main =  get_Main_Panel();
        SpringLayout layout =  get_Main_Layout();
        //
        main.add(image);
        //
        layout.putConstraint(
            SpringLayout.NORTH
        ,   image
        ,   10
        ,   SpringLayout.NORTH
        ,   main
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   image
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );

        
    }
}
