package lib.radio;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class  JRadioButton_VinhNT extends JRadioButton 
implements  ActionListener

{
    private ButtonGroup_VinhNT main02;
    public JRadioButton_VinhNT(ButtonGroup_VinhNT main01){
        super();
        main02 = main01;
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        
        main02.set_Select(this); 
    }   
}