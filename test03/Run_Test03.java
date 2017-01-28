package test03;
import lib.JButton_VinhNT;
import java.awt.event.ActionEvent;

public class Run_Test03 extends JButton_VinhNT{
    private  ButtonGroup03 get01;
    private  Output01_Test03 out01;
    public  Run_Test03(ButtonGroup03 a,Output01_Test03 b){
        get01 = a;
        out01 = b;
    }
    public void actionPerformed(ActionEvent e){
         int val_get;
         val_get = get01.get_Int();
         String val_string = String.valueOf(val_get);
         out01.setText(val_string);
    }
}