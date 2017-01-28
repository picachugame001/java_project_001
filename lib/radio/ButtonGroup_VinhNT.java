package lib.radio;
import javax.swing.ButtonGroup;

public class ButtonGroup_VinhNT<E extends JRadioButton_VinhNT>
extends ButtonGroup
{
    private E select01;
    public ButtonGroup_VinhNT(){
        super();
    }
    public void set_Select(E a){
            select01 = a;
    }
    public E get_Select(){
        return select01;
    }
    public void set_Value(E a){
        setSelected(a.getModel(),true);
        select01 = a;
    }
}
