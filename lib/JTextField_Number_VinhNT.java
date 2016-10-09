package lib;
import java.awt.event.FocusEvent;
public class JTextField_Number_VinhNT extends JTextField_VinhNT{
	public JTextField_Number_VinhNT(){
		super();
		fix_Value();
	}
	public boolean is_Integer_Only(){
		return true;
	}
	public boolean is_Signed_Value(){
		return true;
	}
	public int get_Max_Length(){
        return 11;
    }
	public int get_Max_Value(){
		return 2147483647;
	}
	public int get_Min_Value(){
		return -2147483648;
	}
	public void focusLost(FocusEvent e){
		super.focusLost(e);
		fix_Value();
	}
	private void fix_Value(){
		control_set_val();
		long value = Long.parseLong(getText());
		if(value > get_Max_Value()){
			setText(String.valueOf(get_Max_Value()));
		}else if(value < get_Min_Value()){
			setText(String.valueOf(get_Min_Value()));
		}
		control_set_val();
	}
}