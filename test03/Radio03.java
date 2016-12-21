package test03;
import lib.radio.JRadioButton_VinhNT;

public class Radio03 extends JRadioButton_VinhNT{
    private int value01;
    public Radio03(ButtonGroup03 a,int value){
        super(a);
        setText("adf");
        value01 = value;
    }
    public int getValue01(){
        return value01;
    }

}