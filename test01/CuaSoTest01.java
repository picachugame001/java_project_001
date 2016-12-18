package test01;
//
import javax.swing.*;
import lib.JFrame_VinhNT;
import test02.Button_Test02_Run;
import test03.JButton_Test03;
import test03.JFrame_Test03;
//
public class CuaSoTest01 extends JFrame_VinhNT{
    private SpringLayout layout01;
    private JLabel testLB;
    private JPanel center;
    //
    private Button_Test02_Run test02_button;
    private JButton_Test03 test03_button;
    //
    public String getTitle02(){
        return "Cửa sổ test 01";
    }
    //@override
    public void build_Layout(){
        center = get_Main_Panel();
        layout01 = get_Main_Layout();
        test02_button = new Button_Test02_Run();
        test03_button = new JButton_Test03(JFrame_Test03.class);
        //
        center.add(test02_button);
        center.add(test03_button);
        //
        buildLayout();
    }
    private void buildLayout(){
        //testTextFiel.setSize(200,JFrame_VinhNT.khoang_Cach_Common0);
        layout01.putConstraint
        ( SpringLayout.NORTH, test02_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.NORTH, center);
        layout01.putConstraint
        ( SpringLayout.WEST, test02_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.WEST, center);
        //
        layout01.putConstraint
        ( SpringLayout.NORTH, test03_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.SOUTH, test02_button);
        layout01.putConstraint
        ( SpringLayout.WEST, test03_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.WEST, center);
    }
}
