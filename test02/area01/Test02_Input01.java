package test02.area01;
import lib.text_area.JTextArea_VinhNT;
import lib.text_area.JTextArea02_VinhNT;
import java.awt.Dimension;
public class Test02_Input01
extends JTextArea_VinhNT<Test02_Input0102>
{
	public Test02_Input01(Class<Test02_Input0102> a001){
		super(a001);
		int	width01 = test02.JFrame_Test02.block * 22;
		int height01 = test02.JFrame_Test02.block * 9;
		Dimension size1 = new Dimension(width01,height01);
		setPreferredSize(size1);
	}
}

