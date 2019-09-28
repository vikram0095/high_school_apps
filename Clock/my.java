
import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class my 
{ 

	 


	public static void main(String args[])
	{
		Dimension ss= Toolkit.getDefaultToolkit().getScreenSize();
		int w=(int)(ss.getWidth());
		int h=(int)(ss.getHeight());
	clock tt=new clock();	
	JFrame f = new JFrame("Clock");
	f.add(tt);tt.init();tt.start();
	f.setVisible(true);f.setSize(210,315);
	f.setLocation((w-f.getWidth()-10),(10));
	}

	 
  }