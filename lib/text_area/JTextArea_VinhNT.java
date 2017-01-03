package lib.text_area;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;

public class JTextArea_VinhNT<E extends JTextArea02_VinhNT> extends JScrollPane{
    private E textField;
    public JTextArea_VinhNT(Class<E> baseClass01){
        super();
        setHorizontalScrollBarPolicy(ScrollPaneConstants
        .HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //
        try{
            textField = baseClass01.newInstance();
        }catch(java.lang.IllegalAccessException e){
            System.out.print("IllegalAccessException");
        }catch(java.lang.InstantiationException e){
            System.out.print("InstantiationException");
             System.err.println("Caught IOException: "
                        + e.getMessage());
            e.printStackTrace();
        }catch(java.lang.ExceptionInInitializerError e){
            System.out.print("ExceptionInInitializerError");
        }catch(java.lang.SecurityException e){
            System.out.print("SecurityException");
        } 
        setViewportView(textField);
        Dimension size1 = new Dimension(get_Width(),get_Height());
        setPreferredSize(size1);
        
    }
    public void setText(String t){
        textField.setText(t);
    }
    public String getText(){
        return textField.getText();
    }
    public void init_TextField(){
        
    }
    public int get_Width(){
        return 100;
    }
    public int get_Height(){
        return 100;
    }
}
