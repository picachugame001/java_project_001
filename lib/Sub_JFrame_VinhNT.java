package lib;
import javax.swing.JFrame;
//
public abstract class Sub_JFrame_VinhNT extends JFrame_VinhNT{
    //
    private Sub_JButton_VinhNT button_start;
    //
    public Sub_JFrame_VinhNT(Sub_JButton_VinhNT button_start01){
        super();
        //
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //
        button_start = button_start01;
    }
    public void dispose(){
		super.dispose();
		button_start.setCloseWin();
	}
}
