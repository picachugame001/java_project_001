package test04;
import lib.Sub_JFrame_VinhNT;
import lib.Sub_JButton_VinhNT;
import javax.swing.SpringLayout;
import javax.swing.JPanel;

public class JFrame_Test04
extends Sub_JFrame_VinhNT
{
    
    private Button_Test_Test04 button_run;
    
    public JFrame_Test04(Sub_JButton_VinhNT a2){
        super(a2);
        
        
    }
    public String getTitle02(){
        return "Test04";
    }
    protected int get_Min_Height(){
        return 300;
    }
    protected int get_Min_Width(){
        return 400;
    }
    public void build_Layout(){
        JPanel main =  get_Main_Panel();
        SpringLayout layout =  get_Main_Layout();
        //
        button_run = new  Button_Test_Test04(main,layout);
        //
        main.add(button_run);
        //
        layout.putConstraint(
            SpringLayout.NORTH
        ,   button_run
        ,   10
        ,   SpringLayout.NORTH 
        ,   main
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   button_run
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );
    }
}
