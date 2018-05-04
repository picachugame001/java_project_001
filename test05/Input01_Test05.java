package test05;
import lib.JTextField_VinhNT;

public class Input01_Test05 extends JTextField_VinhNT{
    public Input01_Test05(){
        super();
    }
    //phương thức này sẻ được thừa kế
    public int get_Max_Length(){
        return 100;
    }
}