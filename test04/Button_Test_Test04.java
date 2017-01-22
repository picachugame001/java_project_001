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

        Object[] arrayValue = new Object[10];
        if(arrayValue[0] == null){
            System.out.print("dung roi");
        }

        Edit01_T4 a1 = new Edit01_T4();
        View01_T4 a2 = new View01_T4();
        Edit02_T4 a3 = new Edit02_T4(a1);
        Column01_T4 a4 = new Column01_T4(a2,a3);
        Data01_T4 a5 = new Data01_T4();
        ColumnModel01_T4 a6 = new ColumnModel01_T4(a5);
        Table_Test04 a7 = new Table_Test04(Table02_Test04.class,Data01_T4.class,ColumnModel01_T4.class);
        main.add(a7);
        
        //
        layout.putConstraint(
            SpringLayout.NORTH
        ,   a7
        ,   10
        ,   SpringLayout.SOUTH 
        ,   this
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   a7
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );
        main.revalidate();
    }

}
