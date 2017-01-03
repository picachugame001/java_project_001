package test04;
import lib.Sub_JFrame_VinhNT;
import lib.Sub_JButton_VinhNT;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;

public class JFrame_Test04
extends Sub_JFrame_VinhNT
{
    private Table_Test04 table_test04;
    public JFrame_Test04(Sub_JButton_VinhNT a2){
        super(a2);
        test_Table001();
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
        JPanel main = get_Main_Panel();
        SpringLayout layout = get_Main_Layout(); 
        
        table_test04 = new Table_Test04(Table02_Test04.class);
        
        main.add(table_test04);
        
        layout.putConstraint(
            SpringLayout.NORTH
        ,   table_test04
        ,   10
        ,   SpringLayout.NORTH 
        ,   main
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   table_test04
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );
        
        
        
    }
    public void test_Table001(){
        System.out.print("\nvao table test\n");
        TableModel a = table_test04.get_Table().getModel();
        if(a instanceof JPanel){
            System.out.println("khong co model");
        }
        else{
            System.out.println("co model");
        }
    }
}
