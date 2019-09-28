package notepad;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.io.*;

public class About extends Applet 
{ 
     Font bft;
     public void paint(Graphics gr)
		{
			
				Graphics2D g=(Graphics2D)gr;
			g.setColor(new Color(255,0,0));	
			g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
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
			g.drawString("Encoder Version 1.0",50,210);	
			g.drawString("Developed By : Dark Executer",50,240);
			g.drawString("Company : The Cyber Protocol (c)",50,270);
			bft = new Font("Times new Roman", Font.PLAIN, 15);g.setFont(bft);
			g.drawString("This program is protected by copyright law.",50,295);
		}
  }
     /*
	public void paint(Graphics gr)
		{
			
			try {
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(getClass().getResource("data/AnnabelScript.ttf").toURI())));
    
} catch (Exception ioe){System.out.print(ioe+"");}
				Graphics2D g=(Graphics2D)gr;
			g.setColor(new Color(255,0,0));	
			g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.fillRoundRect(10, 10, 120,150,20,20);
			g.fillRoundRect(140, 10, 120,150,20,20);
			g.fillRoundRect(270, 10, 120,150,20,20);
	   		g.fillRoundRect(10, 170, 380,150,20,20);	
	   	 	bft = new Font("Annabel Script", Font.PLAIN, 100);
			g.setFont(bft);	
			g.setColor(Color.white);
			g.drawString("T",30,130);	
			g.drawString("C",160,130);	g.drawString("P",290,130);
			bft = new Font("Times new Roman", Font.PLAIN, 22);g.setFont(bft);
			g.drawString("Encoder Version 1.0",50,210);	
			g.drawString("Developed By : Dark Executer",50,240);
			g.drawString("Company : The Cyber Protocol (c)",50,270);
			bft = new Font("Times new Roman", Font.PLAIN, 15);g.setFont(bft);
			g.drawString("This program is protected by copyright law.",50,295);
		}
  }*/