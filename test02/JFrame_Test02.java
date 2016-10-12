package test02;
import javax.swing.JFrame;
import lib.JFrame_VinhNT;

public class JFrame_Test02 extends JFrame_VinhNT{
	private Button_Test02_Run button_act;
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
}