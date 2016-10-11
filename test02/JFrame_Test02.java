package test02;
import javax.swing.JFrame;
import lib.JFrame_VinhNT;

public class JFrame_Test02 extends JFrame_VinhNT{
	public JFrame_Test02(){
		super();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public String getTitle02(){
        return "cửa sổ test02";
    }
	public int get_Min_Height(){
		return 400;
	}
	public int get_Min_Width(){
		return 600;
	}
}