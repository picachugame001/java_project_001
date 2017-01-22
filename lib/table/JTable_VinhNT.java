package lib.table;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class JTable_VinhNT
< E extends JTable_VinhNT02
, F extends TableModel_VinhNT
, G extends TableColumnModel_VinhNT
>
extends JScrollPane
{
    private E table02;
    private F talbeModel01;
    private G tableColumnModel10;
    public JTable_VinhNT(
        Class<E> a1,
        Class<F> tableModel,
        Class<G> tableColumnModel
    ){
        super();
        try{
            talbeModel01 = tableModel.newInstance();
            tableColumnModel10 = tableColumnModel.getConstructor(tableModel).newInstance(talbeModel01);
            table02 = a1.getConstructor(tableModel,tableColumnModel)
            .newInstance(talbeModel01,tableColumnModel10);
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
        catch(java.lang.NoSuchMethodException e){
            System.out.print("NoSuchMethodException");
        } 

        catch(java.lang.reflect.InvocationTargetException e){
            System.out.print("InvocationTargetException");
        } 
        setViewportView(table02);
        table02.setFillsViewportHeight(true);
        Dimension size1 = new Dimension(get_Width(),get_Height());
        setPreferredSize(size1);
        tableColumnModel10.newRow();
        tableColumnModel10.newRow();
        tableColumnModel10.newRow();
        tableColumnModel10.newRow();


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
