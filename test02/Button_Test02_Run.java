package test02;
import lib.JButton_VinhNT;
public class Button_Test02_Run extends JButton_VinhNT {
	private JFrame_Test02 a;
	public void on_Click(){
		if(a == null){
			a = new JFrame_Test02(this);
			
		}
		else{
			a.requestFocus();
		}
        return;
    }
	public void setCloseWin(){
		a = null;
	}
}
