package test01;
//
import javax.swing.*;
import lib.JFrame_VinhNT;
import test02.Button_Test02_Run;
import test03.JButton_Test03;
import test03.JFrame_Test03;
import test04.Button_Run_Test04;
import test04.JFrame_Test04;
import test05.Test05_JFrame;
import test05.ButtonRunTest05;
//
public class CuaSoTest01 extends JFrame_VinhNT{
    private SpringLayout layout01;
    private JLabel testLB;
    private JPanel center;
    //
    private Button_Test02_Run test02_button;
    private JButton_Test03 test03_button;
    private Button_Run_Test04 test04_button;
    //
    private ButtonRunTest05 test05_button;
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
        test04_button = new Button_Run_Test04(JFrame_Test04.class);
        test05_button = new ButtonRunTest05(Test05_JFrame.class);
        //
        center.add(test02_button);
        center.add(test03_button);
        center.add(test04_button);
        center.add(test05_button);
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
        //
        layout01.putConstraint
        ( SpringLayout.NORTH, test04_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.SOUTH, test03_button);
        layout01.putConstraint
        ( SpringLayout.WEST, test04_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.WEST, center);
        //
        layout01.putConstraint
        ( SpringLayout.NORTH, test05_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.SOUTH, test04_button);
        layout01.putConstraint
        ( SpringLayout.WEST, test05_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.WEST, center);
    }
}
