package test01;
//D:\Workspaces\Java\Test01\test01
import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;

public class FieldTest extends PlainDocument{
    private int limit;
    public FieldTest(int limit01){
        super();
        limit = limit01;
    }
    public void insertString(int offset,String str,Attribute attr){
        
    }
    
    
}