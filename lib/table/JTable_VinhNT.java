package lib.table;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class JTable_VinhNT<E extends JTable_VinhNT02> extends JScrollPane{
    private E table02;
    public JTable_VinhNT(Class<E> a1){
        super();
        try{
            table02 = a1.newInstance();
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
        setViewportView(table02);
        table02.setFillsViewportHeight(true);
        Dimension size1 = new Dimension(get_Width(),get_Height());
        setPreferredSize(size1);


    }
    public int get_Width(){
        return test02.JFrame_Test02.block * 22;
    }
    public int get_Height(){
        return test02.JFrame_Test02.block * 9;
    }
    public E get_Table(){
        return table02;
    }
}
