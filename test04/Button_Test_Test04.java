package test04;
import lib.JButton_VinhNT;
import javax.swing.SpringLayout;
import javax.swing.JPanel;

public class Button_Test_Test04 extends JButton_VinhNT{
    private JPanel main;
    private SpringLayout layout; 
    public  Button_Test_Test04(JPanel main01,SpringLayout layout01){
        super();
        setText("Run Test04");
        main = main01;
        layout = layout01;
    }

    public void on_Click(){
        System.out.println("");
        System.out.println("da kich button");
        return;
    }
}
