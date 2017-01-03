package lib.radio;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class  JRadioButton_VinhNT<E extends ButtonGroup_VinhNT> 
extends JRadioButton 
implements  ActionListener

{
    private E main02;
    public JRadioButton_VinhNT(E main01){
        super();
        main02 = main01;
        addActionListener(this);
    }
    @SuppressWarnings({"unchecked", "varargs"})
    public void actionPerformed(ActionEvent e){
        
        main02.set_Select(this); 
    }   
}
