package test02.area02;
import lib.text_area.JTextArea_VinhNT;
import java.awt.Dimension;
public class Test02_Output01
extends JTextArea_VinhNT<Test02_Output0102>
{
	public Test02_Output01(Class<Test02_Output0102> a001){
		super(a001);
		int	width01 = test02.JFrame_Test02.block * 22;
		int height01 = test02.JFrame_Test02.block * 9;
		Dimension size1 = new Dimension(width01,height01);
		setPreferredSize(size1);
	}
}

