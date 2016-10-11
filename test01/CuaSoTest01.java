package test01;
import javax.swing.*;
import lib.JFrame_VinhNT;
import lib.JButton_VinhNT;
import lib.JTextField_VinhNT;
import java.lang.Throwable;
import lib.CuaSo;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import test01.testarea01.Textfield01;
import test01.testarea01.Textfield0102;
import lib.JNumberField_UInt_VinhNT;
import lib.JNumberField_Int_VinhNT;


public class CuaSoTest01 extends JFrame_VinhNT{

	private SpringLayout layout01;
	private JLabel testLB;
	private JPanel center;
	
    private Button01 button01;
	private JTextField_VinhNT testTextFiel;
	private JNumberField_Int_VinhNT textint;
	//
	private Textfield01<Textfield0102> textarea01;
	//
	public String getTitle02(){
        return "Cửa sổ test 01";
    }
	//@override
	public JPanel get_Center(){
		center = super.get_Center();
		layout01 = (SpringLayout)center.getLayout();
		testLB = new JLabel("dòng test nè bà con:");
		testTextFiel = new JTextField_VinhNT();
		textarea01 = new Textfield01<Textfield0102>(Textfield0102.class);
		textint = new JNumberField_Int_VinhNT();
		//
		//textarea01.setText("sjdfhdsf s\nsldjfhsldf");
		
		
		
		button01 = new Button01(center);
		
		//
		//
        
		center.add(testLB);
		center.add(testTextFiel);
        center.add(button01);
		center.add(textarea01);
		center.add(textint);
        
		buildLayout();
		return center;
	}
	private void buildLayout(){
		//testTextFiel.setSize(200,lib.CuaSo.khoang_Cach_Common0);
		layout01.putConstraint
		( SpringLayout.NORTH, testLB
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.NORTH, center);
		
		layout01.putConstraint
		( SpringLayout.WEST, testLB
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.WEST, center);
		
		layout01.putConstraint
		( SpringLayout.NORTH, testTextFiel
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.NORTH, center);
		
		layout01.putConstraint
		( SpringLayout.WEST, testTextFiel
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.EAST, testLB);
        
        //
        layout01.putConstraint
		( SpringLayout.WEST, button01
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.EAST, testTextFiel);  
		
		layout01.putConstraint
		( SpringLayout.NORTH, button01
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.NORTH, center);
		
		layout01.putConstraint
		( SpringLayout.NORTH, textarea01
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.SOUTH, button01);
		
		layout01.putConstraint
		( SpringLayout.WEST, textarea01
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.WEST, center);
		
		layout01.putConstraint
		( SpringLayout.EAST, center
		, 50
		, SpringLayout.EAST, textarea01);
		
		layout01.putConstraint
		( SpringLayout.SOUTH, center
		, 50
		, SpringLayout.SOUTH, textarea01);
		
		layout01.putConstraint
		( SpringLayout.WEST, textint
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.WEST, center);
		
		layout01.putConstraint
		( SpringLayout.NORTH, textint
		, lib.CuaSo.khoang_Cach_Common
		, SpringLayout.SOUTH, textarea01);
		
	}
}
