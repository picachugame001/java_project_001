package test02;

import lib.JTextField_VinhNT;
import java.awt.Dimension;

public class Test02_Input02 extends JTextField_VinhNT{
	public Test02_Input02(){
		super();
	}
	protected int get_width_01(){
		return JFrame_Test02.block * 14;
	}
	protected int get_height_01(){
		return JFrame_Test02.block * 2;
	}
}
