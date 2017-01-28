package lib;
public class Sub_JButton_VinhNT<E extends Sub_JFrame_VinhNT> extends JButton_VinhNT {
    private E a;
    private Class<E> a1;
    
    public Sub_JButton_VinhNT(Class<E> a2){
        super();
        a1 = a2;
    }
    public void on_Click(){
        try{
            if(a == null){
                a = a1.getConstructor(Sub_JButton_VinhNT.class).newInstance(this);
            
            }
            else{
                a.requestFocus();
            }
        }
        catch(InstantiationException e){
             System.err.println("InstantiationException: "+ e.getMessage());
        }
        catch(java.lang.IllegalAccessException e){
             System.err.println("IllegalAccessException: "+ e.getMessage());
        }
        catch(java.lang.IllegalArgumentException e){
             System.err.println("IllegalArgumentException: "+ e.getMessage());
        }
        catch(java.lang.reflect.InvocationTargetException e){
             System.err.println("InvocationTargetException: "+ e.getMessage());
        }
        catch(java.lang.SecurityException e){
             System.err.println("SecurityException: "+ e.getMessage());
        }
        catch(java.lang.NoSuchMethodException e){
             System.err.println("NoSuchMethodException: "+ e.getMessage());
        }
            
        return;
    }
    public void setCloseWin(){
        a = null;
    }
}
