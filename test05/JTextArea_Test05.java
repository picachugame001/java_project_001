package test05;
import lib.text_area.JTextArea_VinhNT;

public class JTextArea_Test05 extends JTextArea_VinhNT<JTextArea02_Test05>{
    public JTextArea_Test05(Class<JTextArea02_Test05> p1){
        super(p1);
    }
    public int get_Width(){
        return 600;
    }
    public int get_Height(){
        return 800;
    }
}