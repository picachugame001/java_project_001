package test02;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import lib.JFrame_VinhNT;
import test02.area01.Test02_Input01;
import test02.area01.Test02_Input0102;
import test02.area02.Test02_Output01;
import test02.area02.Test02_Output0102;

public class JFrame_Test02 extends JFrame_VinhNT{
	public static int block = 10;
	private Button_Test02_Run button_act;
	private Test02_Input01 input001;
	private Test02_Input02 input002;
	private Test02_Run run;
	private Test02_Output01 output001;
	private RegExResult process001;
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
		
		
		input001 = new Test02_Input01(Test02_Input0102.class);
		input002 = new Test02_Input02();
		run = new Test02_Run();
		output001 = new Test02_Output01(Test02_Output0102.class);
		process001 = new RegExResult(input001,input002,output001);
		
		center.add(input001);
		center.add(input002);
		center.add(run);
		center.add(output001);
		run.setProc(process001);
			
		layout01.putConstraint(
			SpringLayout.WEST
		,	input001
		,	block
		,	SpringLayout.WEST
		,	center
		);
		layout01.putConstraint(
			SpringLayout.NORTH
		,	input001
		,	block
		,	SpringLayout.NORTH
		,	center
		);
		layout01.putConstraint(
			SpringLayout.NORTH
		,	input002
		,	block
		,	SpringLayout.SOUTH
		,	input001
		);
		layout01.putConstraint(
			SpringLayout.WEST
		,	input002
		,	block
		,	SpringLayout.WEST
		,	center
		);
		layout01.putConstraint(
			SpringLayout.NORTH
		,	run
		,	block
		,	SpringLayout.SOUTH
		,	input001
		);
		layout01.putConstraint(
			SpringLayout.WEST
		,	run
		,	block
		,	SpringLayout.EAST
		,	input002
		);
		layout01.putConstraint(
			SpringLayout.NORTH
		,	output001
		,	block
		,	SpringLayout.SOUTH
		,	input002
		);
		layout01.putConstraint(
			SpringLayout.WEST
		,	output001
		,	block
		,	SpringLayout.WEST
		,	center
		);
		
	}
	
}
