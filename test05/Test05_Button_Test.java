package test05;
import lib.JButton_VinhNT;
import java.lang.InstantiationException;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test05_Button_Test extends JButton_VinhNT{

	private JPanel panelAdd;
	private JFrame jframeAdd;
	
	public void setPanelAdd(JPanel panel){
		panelAdd = panel;
	}
	
	public void setJFrameAdd(JFrame jframe){
		jframeAdd = jframe;
	}
	
	public  void on_Click(){
		super.on_Click();
		test_abc();
		if(panelAdd != null){
			JButton ga = new JButton("Button 123");
			panelAdd.add(ga);
			jframeAdd.revalidate();
			//jframeAdd.pack();
			//jframeAdd.repaint();
			//System.out.print("Da click");
		}
		
	}
	@SuppressWarnings("unchecked")
	public static void test_abc(){
		test_a02<test_a01> abc;
		abc = new test_a02(test_a01.class);
	}

}

class test_a01{
	
}
class test_a02<E>{
	private Class<E> abc001;

	public test_a02(Class<E> abc){
		try{
			abc001 = abc;
			abc.newInstance();
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
        /*catch(java.lang.reflect.InvocationTargetException e){
             System.err.println("InvocationTargetException: "+ e.getMessage());
        }*/
        catch(java.lang.SecurityException e){
             System.err.println("SecurityException: "+ e.getMessage());
        }
        /*catch(java7.lang.NoSuchMethodException e){
             System.err.println("NoSuchMethodException: "+ e.getMessage());
        }*/
	}
}