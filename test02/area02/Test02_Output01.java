package test02.area02;
import lib.text_area.JTextArea_VinhNT;
import java.awt.Dimension;
public class Test02_Output01
extends JTextArea_VinhNT<Test02_Output0102>
{
    public Test02_Output01(Class<Test02_Output0102> a001){
        super(a001);
    }
    public int get_Width(){
        return test02.JFrame_Test02.block * 22;
    }
    public int get_Height(){
        return test02.JFrame_Test02.block * 9;
    }
}
