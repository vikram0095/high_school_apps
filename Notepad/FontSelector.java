package notepad;
import javax.swing.*;
import java.io.*;
import java.awt.*;

import java.awt.event.*;
public class FontSelector extends Font implements ActionListener
{
	
	
	
	JDialog wind;
	JTextArea TArea=new JTextArea("s");
	JButton color,Ok,Cancel;
	Color fontColor=Color.green;
	int fontSize=18;
	String fontName="Comic sans ms";
	int fontstyleindex=0,fontnameindex=0,fontsizeindex=0;
	JList fontsize,fontnames,fontstyles;
	String fontSizes[]={"2","4","6","8","10","12","15","18","20","32","48","64","72","128"};
	String fontStyles[]={"Plain","Bold","Italic","Bold Italic"};
	final Dimension scrsize=Toolkit.getDefaultToolkit().getScreenSize();
	GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment(); 
	String fontS[]=gEnv.getAvailableFontFamilyNames();
	
	public static Font main(String args[])
	{
			AddNimbusLook.look();
		
		 new FontSelector();
	}
	public Color getColor()
	{
		return fontColor;
	}
	
	public Font getFont()
	{
		System.out.println(fontName+fontSize+"");
		return new Font(fontName,Font.PLAIN,fontSize);
	}
	public FontSelector()
	{
		
		
			
			SpringLayout sp=new SpringLayout();
			JPanel pan=new JPanel(sp);
			JPanel fonts=fontNames();
			JPanel styles=fontStyles();
			JPanel sizes=fontSizes();
			JPanel panelS=submit();
			
		 color=new JButton("");
			color.setBackground(Color.green); color.addActionListener(this);
	   sp.putConstraint(SpringLayout.WEST,fonts,10,SpringLayout.WEST,pan);
       sp.putConstraint(SpringLayout.NORTH,fonts,10,SpringLayout.NORTH,pan);
       sp.putConstraint(SpringLayout.EAST,fonts,170,SpringLayout.WEST,pan);
       sp.putConstraint(SpringLayout.SOUTH,fonts,190,SpringLayout.NORTH,pan);
      
       sp.putConstraint(SpringLayout.WEST,styles,10,SpringLayout.EAST,fonts);
       sp.putConstraint(SpringLayout.NORTH,styles,10,SpringLayout.NORTH,pan);
       sp.putConstraint(SpringLayout.EAST,styles,170,SpringLayout.EAST,fonts);
       sp.putConstraint(SpringLayout.SOUTH,styles,110,SpringLayout.NORTH,pan);
       
       sp.putConstraint(SpringLayout.WEST,color,10,SpringLayout.EAST,fonts);
       sp.putConstraint(SpringLayout.NORTH,color,10,SpringLayout.SOUTH,styles);
       sp.putConstraint(SpringLayout.EAST,color,170,SpringLayout.EAST,fonts);
       sp.putConstraint(SpringLayout.SOUTH,color,190,SpringLayout.NORTH,pan);
        
       sp.putConstraint(SpringLayout.WEST,sizes,10,SpringLayout.EAST,styles);
       sp.putConstraint(SpringLayout.NORTH,sizes,10,SpringLayout.NORTH,pan);
       sp.putConstraint(SpringLayout.EAST,sizes,65,SpringLayout.EAST,styles);
       sp.putConstraint(SpringLayout.SOUTH,sizes,190,SpringLayout.NORTH,pan);
       
       sp.putConstraint(SpringLayout.WEST,panelS,10,SpringLayout.WEST,pan);
       sp.putConstraint(SpringLayout.NORTH,panelS,10,SpringLayout.SOUTH,fonts);
       sp.putConstraint(SpringLayout.EAST,panelS,-10,SpringLayout.EAST,pan);
       sp.putConstraint(SpringLayout.SOUTH,panelS,-10,SpringLayout.SOUTH,pan);
        
        
       
     
     
       	color.setPreferredSize(new Dimension(160, 70));
       	
      pan.add(fonts); pan.add(styles);pan.add(sizes);pan.add(color); pan.add(panelS);
		wind=new JDialog();
	 	 wind.add(pan);
	//	wind.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		wind.setSize(425,270);
		int wleft=(int)(scrsize.getWidth()-wind.getWidth())/2;
		int wtop=(int)(scrsize.getHeight()-wind.getHeight())/2;
		wind.setLocation(wleft,wtop);
		
		
	}

	public JPanel fontNames()
	{
		
		
			JPanel pan=new JPanel();
		 fontnames = new JList(fontS);
		pan.add(fontnames);
     fontnames.setSelectedIndex(0);
      fontnames.setLayoutOrientation(JList.VERTICAL);
      JScrollPane listScroller = new JScrollPane(fontnames);
		listScroller.setPreferredSize(new Dimension(160, 177));
		pan.add(listScroller);
		return pan;
	}
	
	public JPanel fontStyles()
	{
		
		
			JPanel pan=new JPanel();
			
		 fontstyles = new JList(fontStyles);
		
		
		fontstyles.setSelectedIndex(0);
		pan.add(fontstyles);
		JScrollPane Scroller = new JScrollPane(fontstyles);
	Scroller.setPreferredSize(new Dimension(160, 100));
		pan.add(Scroller);
      fontstyles.setLayoutOrientation(JList.VERTICAL);
		return pan;
	}
	
	public JPanel fontSizes()
	{
	
		
		
			JPanel pan=new JPanel();
			
			
		fontsize = new JList(fontSizes);
		pan.add(fontsize);
      fontsize.setSelectedIndex(0);
      fontsize.setLayoutOrientation(JList.VERTICAL);
     JScrollPane listScroller = new JScrollPane(fontsize);
	listScroller.setPreferredSize(new Dimension(55, 177));
		pan.add(listScroller);
		return pan;
	}
	
	public JPanel submit()
	{
		
			SpringLayout sp=new SpringLayout();
		JPanel pan=new JPanel(sp);
		
		Ok=new JButton("OK");
		Cancel=new JButton("Cancel");
		
		Ok.addActionListener(this);
		Cancel.addActionListener(this);
		pan.add(Ok);pan.add(Cancel);
		
		
	   sp.putConstraint(SpringLayout.WEST,Ok,-90,SpringLayout.WEST,Cancel);
       sp.putConstraint(SpringLayout.NORTH,Ok,0,SpringLayout.NORTH,pan);
       sp.putConstraint(SpringLayout.EAST,Ok,0,SpringLayout.WEST,Cancel);
       sp.putConstraint(SpringLayout.SOUTH,Ok,0,SpringLayout.SOUTH,pan);
       
	   sp.putConstraint(SpringLayout.WEST,Cancel,-80,SpringLayout.EAST,pan);
       sp.putConstraint(SpringLayout.NORTH,Cancel,0,SpringLayout.NORTH,pan);
       sp.putConstraint(SpringLayout.EAST,Cancel,0,SpringLayout.EAST,pan);
       sp.putConstraint(SpringLayout.SOUTH,Cancel,0,SpringLayout.SOUTH,pan);
		
		return pan;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		String ac=e.getActionCommand();
		if(ac.equals("OK"))
		{
			fontColor=color.getBackground();
			
			fontnameindex=fontnames.getSelectedIndex();
			fontsizeindex=fontsize.getSelectedIndex();
			fontstyleindex=fontstyles.getSelectedIndex();
		 
			fontSize=Integer.parseInt(fontSizes[fontsizeindex]);
			fontName=fontS[fontnameindex];
		//	System.out.println(fontColor+"        	"+fontSize +"            "  +   fontName + "    " +fontstyleindex);
	
			wind.dispose();
		}
		else if(ac.equals("Cancel"))
		{
			wind.dispose();
		}
		
		
		else
		{
			Color a= JColorChooser.showDialog(wind, "Choose Text Color",Color.green);
			if(a==null)
			{
				a=fontColor;
			}
			color.setBackground(a);
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
