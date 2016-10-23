package lib;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Container;
import lib.SpringUtilities;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
/**
 * This is the typical format of a simple documentation comment
 * that spans two lines.
 */
public abstract class JFrame_VinhNT extends JFrame{
	private	JPanel main_Panel;
	private	SpringLayout main_Layout;
    public JFrame_VinhNT(){
		
        super();
		khoi_Tao_CuaSo();
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init_CuaSo();

		//init container
		Container main_Container = getContentPane();
		main_Container.add(get_Page_Start(),BorderLayout.PAGE_START);
		main_Container.add(get_Line_Start(),BorderLayout.LINE_START);
		//
		main_Panel = new JPanel();
		main_Layout = new SpringLayout();
		main_Panel.setLayout(main_Layout);
		build_Layout();
		//
		main_Container.add(main_Panel      ,BorderLayout.CENTER);
		main_Container.add(get_Line_End()  ,BorderLayout.LINE_END);
		main_Container.add(get_Page_End()  ,BorderLayout.PAGE_END);
		pack();
        show01();

    }
	
    public void show01(){
        javax.swing.SwingUtilities.invokeLater(
            new Runnable(){
                public void run(){
                    setVisible(true);
                }
            }
        );
    }
    public void test(){
        System.out.print("ka ka");
    }
    public String getTitle02(){
        return "default";
    }
	public static void khoi_Tao_CuaSo(){
		JFrame.setDefaultLookAndFeelDecorated(true);
	}
	protected int get_Min_Height(){
		return 300;
	}
	protected int get_Min_Width(){
		return 400;
	}
	public boolean get_is_resize(){
		return true;
	}
	private void init_CuaSo(){
		setMinimumSize(new java.awt.Dimension(get_Min_Width(),get_Min_Height()));
		//disable resize
		setResizable(get_is_resize());
		//default title name
		setTitle(getTitle02());
	}

	public JPanel get_Page_Start(){
		JPanel page_start = new JPanel();
		SpringLayout layout01 = new SpringLayout();
		page_start.setLayout(layout01);
		return page_start;
	}
	public JPanel get_Line_Start(){
		JPanel line_start = new JPanel();
		SpringLayout layout01 = new SpringLayout();
		line_start.setLayout(layout01);
		return line_start;
	}
    /*public JPanel get_Center(){
		JPanel center = new JPanel();
		SpringLayout layout01 = new SpringLayout();
		center.setLayout(layout01);
		return center;
	}*/
    public JPanel get_Line_End(){
		JPanel line_end = new JPanel();
		SpringLayout layout01 = new SpringLayout();
		line_end.setLayout(layout01);
		return line_end;
	}
    public JPanel get_Page_End(){
		JPanel page_end = new JPanel();
		SpringLayout layout01 = new SpringLayout();
		page_end.setLayout(layout01);
		return page_end;
	}
	public SpringLayout get_Main_Layout(){
		return main_Layout;
	}
	public JPanel get_Main_Panel(){
		return main_Panel;
	}
	public abstract void build_Layout();
    

}