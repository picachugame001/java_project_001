package test04;
import lib.Sub_JFrame_VinhNT;
import lib.Sub_JButton_VinhNT;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import lib.JNumberField_UInt_VinhNT;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;

public class JFrame_Test04
extends Sub_JFrame_VinhNT
{
    

    private JTable table01;
    public JFrame_Test04(Sub_JButton_VinhNT a2){
        super(a2);
        //test_Table001();
        DefaultTableModel model01 = (DefaultTableModel)table01.getModel();
        
        
        JNumberField_UInt_VinhNT field01= new JNumberField_UInt_VinhNT();
        TableColumn column01 = new TableColumn();
        column01.setCellEditor(new DefaultCellEditor(field01));
        DefaultTableCellRenderer name02 = new DefaultTableCellRenderer();
        name02.setText("abc01");
        column01.setHeaderRenderer(name02);
        
        //System.out.printf(hearname.getClass().getSimpleName());
        //hearname.setText("abc99");
        model01.addColumn("vai luyen");
        DefaultTableColumnModel columnmodel = (DefaultTableColumnModel)table01.getColumnModel();
        TableColumn column92 = columnmodel.getColumn(0);
        
        column92.setCellEditor(new DefaultCellEditor(field01));
        model01.addRow(new Object[]{"21"});
        model01.addRow(new Object[]{"21"});
        model01.addRow(new Object[]{"21"});
        model01.addRow(new Object[]{"21"});
        model01.addRow(new Object[]{"21"});
        //TableCellEditor edit02 = table01.getCellEditor(0,0);
        /*if(edit02 instanceof JTextField){
            System.out.printf("dung");
        }
        else{
            System.out.printf("sai");
        }*/
        //System.out.printf(edit02.getClass().getName());
        
        
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
        

        table01 = new JTable();
        table01.setPreferredScrollableViewportSize(new Dimension(400, 200));
        table01.setFillsViewportHeight(true);
        JScrollPane a001 = new JScrollPane(table01);
        
        main.add(a001);
        
        
        
        layout.putConstraint(
            SpringLayout.NORTH
        ,   a001
        ,   10
        ,   SpringLayout.NORTH 
        ,   main
        );
        layout.putConstraint(
            SpringLayout.WEST
        ,   a001
        ,   10
        ,   SpringLayout.WEST
        ,   main
        );
        
        
        
    }
    /*public void test_Table001(){
        System.out.print("\nvao table test\n");
        TableModel a = table_test04.get_Table().getModel();
        if(a instanceof JPanel){
            System.out.println("khong co model");
        }
        else{
            System.out.println("co model");
        }
    }*/
}
