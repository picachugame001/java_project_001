package lib.radio;
import javax.swing.ButtonGroup;

public class ButtonGroup_VinhNT<E extends JRadioButton_VinhNT>
extends ButtonGroup
{
    private E select01;
    public ButtonGroup_VinhNT(){
        super();
    }
    @SuppressWarnings({"unchecked"})
    public void set_Select(JRadioButton_VinhNT a){
            select01 = (E)a;
    }
    public E get_Select(){
        return select01;
    }
    @SuppressWarnings({"unchecked"})
    public void set_Value(JRadioButton_VinhNT a){
        setSelected(a.getModel(),true);
        select01 = (E)a;
    }
}