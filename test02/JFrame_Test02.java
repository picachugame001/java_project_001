package test02;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import lib.JFrame_VinhNT;
import test02.area01.Test02_Input01;
import test02.area01.Test02_Input0102;

public class JFrame_Test02 extends JFrame_VinhNT{
	private Button_Test02_Run button_act;
	private Test02_Input01 input001;
	public JFrame_Test02(Button_Test02_Run c1){
		super();
		button_act = c1;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	public String getTitle02(){
        return "cửa sổ test02";
    }
	protected int get_Min_Height(){
		return 400;
	}
	protected int get_Min_Width(){
		return 600;
	}
	public void dispose(){
		super.dispose();
		button_act.setCloseWin();
	}
	public void build_Layout(){
		JPanel center = get_Main_Panel();
		SpringLayout layout01 = get_Main_Layout();
		
		
		input001 = new Test02_Input01
		(Test02_Input0102.class);
		
		center.add(input001);
			
		layout01.putConstraint(
			SpringLayout.WEST
		,	input001
		,	5
		,	SpringLayout.WEST
		,	center
		);
		layout01.putConstraint(
			SpringLayout.NORTH
		,	input001
		,	5
		,	SpringLayout.NORTH
		,	center
		);
		
	}
	
}
