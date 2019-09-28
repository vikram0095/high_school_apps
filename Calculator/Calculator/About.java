import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class About extends Applet 
{ 
     Font bft;
     
	public void paint(Graphics g)
		{
			g.setColor(Color.red);	
			g.fillRoundRect(10, 10, 120,150,20,20);
			g.fillRoundRect(140, 10, 120,150,20,20);
			g.fillRoundRect(270, 10, 120,150,20,20);
	   		g.fillRoundRect(10, 170, 380,150,20,20);	
	   	 	bft = new Font("French Script MT", Font.PLAIN, 130);
			g.setFont(bft);	
			g.setColor(Color.white);
			g.drawString("T",30,130);	
			g.drawString("C",160,130);	g.drawString("P",290,130);
			bft = new Font("Times new Roman", Font.PLAIN, 22);g.setFont(bft);
			g.drawString("Calculator Version 1.0",50,210);	
			g.drawString("Developed By : Dark Executer",50,240);
			g.drawString("Company : The Cyber Protocol (c)",50,270);
			bft = new Font("Times new Roman", Font.PLAIN, 15);g.setFont(bft);
			g.drawString("This program is protected by copyright law.",50,295);
		}
  }