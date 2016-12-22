package test03;
import lib.Sub_JFrame_VinhNT;
import lib.Sub_JButton_VinhNT;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import lib.table.*;

public class JFrame_Test03 extends Sub_JFrame_VinhNT{
    private Show_Image_Test03 image;
    private ButtonGroup03 group;
    private Radio03 radio;
    private Radio03 radio02;
    private Radio03 radio03;
    private Output01_Test03 out01;
    private Run_Test03 run01;
    private JTable_VinhNT table01;
    public JFrame_Test03(Sub_JButton_VinhNT button_start01){
        super(button_start01);
    }
    protected int get_Min_Height(){
        return 700;
    }
    protected int get_Min_Width(){
        return 600;
    }
    public void build_Layout(){
        image = new  Show_Image_Test03();
        group = new  ButtonGroup03();
        radio = new  Radio03(group,1);
        radio02 = new  Radio03(group,2);
        radio03 = new  Radio03(group,3);
        out01 = new Output01_Test03();
        run01 = new Run_Test03(group,out01);
        group.add(radio);
        group.add(radio02);
        group.add(radio03);

        group.set_Value(radio);

        table01 = new JTable_VinhNT(JTable_VinhNT02.class);
        
        

        JPanel main =  get_Main_Panel();
        SpringLayout layout =  get_Main_Layout();
        //
        main.add(image);
        main.add(radio);
        main.add(radio02);
        main.add(radio03);
        main.add(out01);
        main.add(run01);
        main.add(table01);

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

        layout.putConstraint(
            SpringLayout.NORTH
        ,   radio
        ,   10
        ,   SpringLayout.SOUTH 
        ,   image
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   radio
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );
        layout.putConstraint(
            SpringLayout.NORTH
        ,   radio02
        ,   10
        ,   SpringLayout.SOUTH 
        ,   radio
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   radio02
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );
        layout.putConstraint(
            SpringLayout.NORTH
        ,   radio03
        ,   10
        ,   SpringLayout.SOUTH 
        ,   radio02
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   radio03
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );
        
        layout.putConstraint(
            SpringLayout.NORTH
        ,   out01
        ,   10
        ,   SpringLayout.SOUTH 
        ,   radio03
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   out01
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );
        layout.putConstraint(
            SpringLayout.NORTH
        ,   run01
        ,   10
        ,   SpringLayout.SOUTH 
        ,   out01
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   run01
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );
        layout.putConstraint(
            SpringLayout.NORTH
        ,   table01
        ,   10
        ,   SpringLayout.SOUTH 
        ,   run01
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   table01
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );

    }
}
