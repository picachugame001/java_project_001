package test05;
import lib.Sub_JFrame_VinhNT;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import lib.Sub_JButton_VinhNT;

import java.util.Vector;
import lib.layout.PicachuLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.stream.FileImageInputStream;
import java.io.RandomAccessFile;
import java.net.URI;
import java.io.File;
import java.net.URISyntaxException;
import java.io.FileNotFoundException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Graphics;
import lib.file.File_VinhNT;



public class Test05_JFrame extends Sub_JFrame_VinhNT{
	
	private Test05_Button_Test buttonTest;
	public Test05_JFrame(Sub_JButton_VinhNT a){
		super(a);
		setTitle("kaka test05");
		

	}

	
	public void build_Layout(){
		
		
		PicachuLayout layout01 = new PicachuLayout(PicachuLayout.LEFT);
		layout01.setMaxWidth(250);
		//layout01.setHgap(0);
		//layout01.setVgap(0);
		JPanel panel01 = new JPanel();
		panel01.setBackground(Color.GREEN);
		panel01.setLayout(layout01);
		JScrollPane jscroll01 = new JScrollPane(panel01);
		jscroll01.setPreferredSize(new Dimension(layout01.getMaxWidth() + 20, 150));
		JButton button01 = new JButton("Button 001");
		JButton button02 = new JButton("Button 002");
		JButton button03 = new JButton("Button 003");
		JButton button04 = new JButton("Button 004");
		JButton button05 = new JButton("Button 005");
		panel01.add(button01);
		panel01.add(button02);
		panel01.add(button03);
		panel01.add(button04);
		
		ItemMonHoc item01 = new ItemMonHoc();
		
		FileImageInputStream fiinput;
		BufferedImage bufferimage01;
		Graphics hinh_Dug;
		
		
		try{
			File_VinhNT a1 = new File_VinhNT();
			String imagepath = a1.path_Main.concat("image/Dug-up.jpg");
			URI file_path = new URI("file:/D:/Vinh_WorkSpace/Test01/bin/first_jar.jar!/image/Dug-up.jpg");
		
			System.out.print(file_path.toString());
			
			File file_image = new File(file_path);
		
			RandomAccessFile filerandom = new RandomAccessFile(file_image,"r");
			fiinput = new FileImageInputStream(filerandom);
			bufferimage01 = ImageIO.read(fiinput);
			hinh_Dug = bufferimage01.getGraphics();
			/*JPanel hinhanh = new JPanel(){
				@Override
				protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					g.drawImage(bufferimage01, 0, 0, this); // see javadoc for more info on the parameters            
				}
			};*/
			//hinhanh.setPreferredSize(new Dimension(500,500));
		
		

		
			JPanel mainPanel = get_Main_Panel();
			SpringLayout mainLayout = get_Main_Layout();

			mainPanel.setBackground(Color.RED);

			buttonTest = new Test05_Button_Test();
			buttonTest.setPanelAdd(panel01);
			buttonTest.setJFrameAdd(this);

			mainPanel.add(buttonTest);
			mainPanel.add(jscroll01);
			mainPanel.add(button05);
			mainPanel.add(item01);
			//mainPanel.add(hinhanh);
			

			mainLayout.putConstraint(	SpringLayout.NORTH, buttonTest
								, 10,	SpringLayout.NORTH , mainPanel);
			mainLayout.putConstraint(	SpringLayout.WEST, buttonTest
								, 10,	SpringLayout.WEST, mainPanel);

			mainLayout.putConstraint(	SpringLayout.NORTH, jscroll01
								, 10,	SpringLayout.SOUTH, buttonTest);
			mainLayout.putConstraint(	SpringLayout.WEST, jscroll01
								, 10,	SpringLayout.WEST, mainPanel);

			mainLayout.putConstraint(	SpringLayout.NORTH, button05
								, 10,	SpringLayout.SOUTH, jscroll01);
			mainLayout.putConstraint(	SpringLayout.WEST, button05
								, 10,	SpringLayout.WEST, mainPanel);

			mainLayout.putConstraint(	SpringLayout.NORTH, item01
								, 10,	SpringLayout.SOUTH, button05);
			mainLayout.putConstraint(	SpringLayout.WEST, item01
								, 10,	SpringLayout.WEST, mainPanel);
								
			/*mainLayout.putConstraint(	SpringLayout.NORTH, hinhanh
								, 10,	SpringLayout.SOUTH, item01);
			mainLayout.putConstraint(	SpringLayout.WEST, hinhanh
								, 10,	SpringLayout.WEST, mainPanel);*/
		}
		catch(FileNotFoundException e){
			System.out.print("FileNotFoundException");
		}
		catch(URISyntaxException e){
			System.out.print("URISyntaxException");
		}
		catch(IOException e){
			System.out.print("IOException");
		}
	}
	
}
class ItemMonHoc extends JPanel{
	private JLabel text;
	private JButton buttonX;
	
	public ItemMonHoc(){
		super();
		buttonX = new JButton("X");
		text = new JLabel("Lịch sử");
		add(text);
		add(buttonX);
	}
}
class ButtonX extends JButton{
	//public 
}

