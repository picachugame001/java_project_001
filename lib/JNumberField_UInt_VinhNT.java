package lib;
public class JNumberField_UInt_VinhNT extends JTextField_Number_VinhNT{
	public JNumberField_UInt_VinhNT(){
		super();
	}
	public boolean is_Integer_Only(){
		return true;
	}
	public boolean is_Signed_Value(){
		return false;
	}
	public int get_Min_Value(){
		return 0;
	}
}