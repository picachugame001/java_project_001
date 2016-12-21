package test03;
import lib.radio.ButtonGroup_VinhNT;

public class ButtonGroup03 extends ButtonGroup_VinhNT<Radio03>{
    public ButtonGroup03(){
        super();
    }
    public int get_Int(){
        Radio03 select99 = get_Select();
        return  select99.getValue01();
    }
    
}