package test02;
import lib.JButton_VinhNT;
import java.awt.Dimension;

public class Test02_Run extends JButton_VinhNT{
	private RegExResult proc01;
	public Test02_Run(){
		super();
		setText("Run");
		int width08 = JFrame_Test02.block * 7;
		int height08 = JFrame_Test02.block * 2 ;
		Dimension size = new Dimension(width08,height08);
		setPreferredSize(size);
		
	}
	public void setProc(RegExResult a){
		proc01 = a;
	}
	public void on_Click(){
		if(proc01 != null){
			proc01.calculator();
		}
		
	}
}
