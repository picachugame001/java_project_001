package lib;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

public class JTextField_VinhNT
	extends JTextField
	implements ActionListener,FocusListener
{
	private boolean is_My_Set_Val;
	public JTextField_VinhNT(){
		super();
		setColumns(10);
		addActionListener(this);
		addFocusListener(this);
		is_My_Set_Val = true;
		if(is_Integer_Only()){
			setText("0");
			setHorizontalAlignment(JTextField.RIGHT);
			setCaretPosition(getText().length());
		}
		is_My_Set_Val = false;
	}
	public void actionPerformed(ActionEvent e){
	}
	public void focusGained(FocusEvent e){
		is_My_Set_Val = true;
		if(is_Integer_Only()){
			setCaretPosition(getText().length());
			if(getText().equals("0")){
				setText("");
			}
		}
		is_My_Set_Val = false;
		
	}
	public void focusLost(FocusEvent e){
		is_My_Set_Val = true;
		setText(getText().trim());
		if(is_Integer_Only()){
			
		}
		if(
			is_Integer_Only()
		&&	(	getText().equals("")
			||	getText().equals("-")
			)
		)
		{
			setText("0");
			is_My_Set_Val = false;
		}
	}
    //phương thức này sẻ được thừa kế
    public int get_Max_Length(){
        return 10;
    }
	// 1 upper case
	// 0 nomal
	// -1 lower case
	public int get_Case_Document(){
		return 0;
	}
	
	public boolean is_Integer_Only(){
		return true;
	}
	
	public boolean is_Signed_Value(){
		return true;
	}
	
	protected Document createDefaultModel(){
		//PlainDocument doc = (PlainDocument)super.createDefaultModel();
		
		return new PlainDocument_VinhNT();
	}
	class PlainDocument_VinhNT extends PlainDocument{
		public PlainDocument_VinhNT(){
			super();
		}
		public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
			if (str == null){
				return;
			}   
			if(
					get_Max_Length() <= 0
				||
					(
						get_Max_Length() > 0
					&&	(getLength() + str.length()) <= get_Max_Length()
					)
			){
			}
			else{
				return;
			}
			
			if(get_Case_Document() == 1){
				char[] upper = str.toCharArray();
				for (int i = 0; i < upper.length; i++) {
					upper[i] = Character.toUpperCase(upper[i]);
				}
				str = new String(upper);
			}
			if(get_Case_Document() == -1){
				char[] lower = str.toCharArray();
				for (int i = 0; i < lower.length; i++) {
					lower[i] = Character.toLowerCase(lower[i]);
				}
				str = new String(lower);
			}
			if(is_Integer_Only()){
				//Nếu nó là số nguyên không dấu
				if(!is_Signed_Value()){
					char[] test01 = str.toCharArray();
					for(int i = 0 ; i < test01.length; i++) {
						if(!Character.isDigit(test01[i])){
							return;
						}
					}
					if(str.equals("0")
						&& offset == 0
						&& is_My_Set_Val == false 
					)
					{
						return;
					}
				}
				else{
				//Nếu nó là số nguyên có dấu
					char[] str01 = getText().toCharArray();
					//nếu đang là chuỗi rỗng
					if(str01.length == 0){
						if(str.equals("0") && is_My_Set_Val == false){
							return;
						}
						char[] test01 = str.toCharArray();
						for(int i = 0 ; i < test01.length; i++){
							if(!Character.isDigit(test01[i])){
								if(test01[i] == '-' && i == 0){
									//OK
								}
								else{
									return;
								}
								
							}
							
						}
						
					}
					else{
					//nếu đang có chuỗi
						if(str.equals("0") && is_My_Set_Val == false){
							if(offset == 0){
								return;
							}
							else if(offset == 1){
								if(str01[0] == '-'){
									return;
								}
								if(str01[0] == '0'){
									return;
								}
							}
							
						}
						if(str.equals("-")){
							if(offset == 0){
								if(str01[0] == '-'){
									return;
								}
								if(str01[0] == '0'){
									return;
								}
							}
							else if(offset > 0 ){
								return;
							}
						}
						char[] test01 = str.toCharArray();
						for(int i = 0 ; i < test01.length; i++) {
							if(!Character.isDigit(test01[i])){
								if(test01[i] == '-' && i == 0){
									//check roi
								}
								else{
									return;
								}
								
							}
							
						}
					}	
					
				}
			}
			
			super.insertString(offset, str, attr);
			
		}
	}

}
