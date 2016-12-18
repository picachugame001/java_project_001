package lib;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JButton_VinhNT extends JButton implements ActionListener {
    public JButton_VinhNT(){
        addActionListener(this);
        setText("button");
    }
    public void actionPerformed(ActionEvent e){
        on_Click();
    }
    //function will override
    public void on_Click(){
        return;
    }
}
