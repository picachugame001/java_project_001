package test05;

import lib.Sub_JButton_VinhNT;
import lib.Sub_JFrame_VinhNT;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import lib.JFrame_VinhNT;
import javax.swing.JComboBox;
import java.util.Vector;
import javax.swing.ComboBoxEditor;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Component;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import lib.PicachuLayout;

public class Test05_JFrame extends Sub_JFrame_VinhNT{
    private Input01_Test05 input01;
    private JTextArea_Test05 output01;
    private Gen_Test05 gen_button;
    
    public Test05_JFrame(Sub_JButton_VinhNT button_run){
        super(button_run);
    }
    public void build_Layout(){
        JPanel main = get_Main_Panel();
        SpringLayout layout01 = get_Main_Layout();
		
        
        input01= new Input01_Test05();
        //output01 = new JTextArea_Test05(JTextArea02_Test05.class);
        gen_button = new Gen_Test05();
		
		VEditor veditor = new VEditor();
		JButton a10 = new JButton("Button 010");
        
        main.add(input01);
        //main.add(output01);
        main.add(gen_button);
		main.add(veditor);
		main.add(a10);
        
        layout01.putConstraint
        ( SpringLayout.NORTH, input01
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.NORTH, main);
        layout01.putConstraint
        ( SpringLayout.WEST, input01
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.WEST, main);
        
        layout01.putConstraint
        ( SpringLayout.NORTH, gen_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.NORTH, main);
        layout01.putConstraint
        ( SpringLayout.WEST, gen_button
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.EAST, input01);
        /*/
        layout01.putConstraint
        ( SpringLayout.NORTH, output01
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.SOUTH, input01);
        layout01.putConstraint
        ( SpringLayout.WEST, output01
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.WEST, main);*/
		
		layout01.putConstraint
        ( SpringLayout.NORTH, veditor
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.	SOUTH, gen_button);
        layout01.putConstraint
        ( SpringLayout.WEST, veditor
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.WEST, main);
		
		layout01.putConstraint
        ( SpringLayout.NORTH, a10
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.	SOUTH, veditor);
        layout01.putConstraint
        ( SpringLayout.WEST, a10
        , JFrame_VinhNT.khoang_Cach_Common
        , SpringLayout.WEST, main);
        
    }
    protected int get_Min_Height(){
        return 600;
    }
    protected int get_Min_Width(){
        return 800;
    }
}

class VCombobox extends JComboBox{
	@SuppressWarnings("unchecked")
	public VCombobox(Vector a){
		super(a);
		//setEditor(ComboBoxEditor anEditor);
	}
}
class VEditor extends JPanel/* implements ComboBoxEditor*/{
	
	//init method
	public VEditor(){
		super();
		//FlowLayout layout = (FlowLayout)getLayout();
		PicachuLayout layout02 = new PicachuLayout();
		setLayout(layout02);
		//layout.setAlignment(FlowLayout.LEFT);
		
		//setPreferredSize(new Dimension(300,200));
		//setMinimumSize(new Dimension(250,250));
		//setMaximumSize(new Dimension(250,1000));
		
		
		
		final JButton a2 = new JButton("Button 001"){};
		ActionListener hanh_dong_01 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.print(a2.getHeight());
			}
		};
		a2.addActionListener(hanh_dong_01);
		JButton a3 = new JButton("Button 002");
		JButton a4 = new JButton("Button 003"); 
		JButton a5 = new JButton("Button 004");
		JButton a6 = new JButton("Button 005");
		JButton a7 = new JButton("Button 006");
		JButton a8 = new JButton("Button 007");
		add(a2);
		add(a3);
		add(a4);
		add(a5);
		add(a6);
		add(a7);
		add(a8);



		//System.out.printf("\nchieu rong la : %d",a5.getMinimumSize().getWidth());
		
		//System.out.printf("\nchieu cao la : %d \n",a5.getMinimumSize().getHeight());
		
	}

	public void addC(Component a){
		add(a);
	}
}

class Data{
	public boolean check;
	public String text;
	public String thoi_gian;
}