package lib;
public class JNumberField_Int_VinhNT extends JTextField_Number_VinhNT{
	public JNumberField_Int_VinhNT(){
		super();
	}
	public boolean is_Integer_Only(){
		return true;
	}
	public boolean is_Signed_Value(){
		return true;
	}
}