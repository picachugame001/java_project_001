package test01;
import lib.JButton_VinhNT;
import lib.JTextField_VinhNT;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.io.IOException;
public class Button01 extends JButton_VinhNT{
	private JTextArea a;
	private int chiều_dọc;
	private int chiều_ngang;
	private JPanel pane;
	private Logger logger;
	private FileHandler fh;
	public Button01(JPanel pane01){
		/*a = a1;
		chiều_dọc = 5;
		chiều_ngang = 30;
		pane = pane01;*/
		try{
			fh = new FileHandler("mylog.txt");
		}
		catch(IOException e){
			logger.fine("vai error");
		}
		logger = Logger.getLogger("lib.vinh");
		
		logger.addHandler(fh);
		logger.setLevel(Level.ALL);
	}
    public void on_Click(){
		/*chiều_dọc += 5;
		chiều_ngang += 30;
		a.setColumns(chiều_ngang);
		a.setRows(chiều_dọc);
		pane.validate();*/
		 logger.fine("doing stuff");
		  logger.log(Level.WARNING, "trouble sneezing", this);
		 logger.fine("done");
		
    }
    
	
}