import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
public class TicTacToe implements MouseListener,ActionListener
       {
       	
       	
       	String op;
       	ImageIcon de,win,p1,p1s,p2,p2s;
       	JMenuBar menu;
       	JMenu m1,m2,m3;
       	JMenuItem mi1,mi2,mi3,mi4,mi5;
		JFrame frame,cp1,cp2;
		int p11,p12,p13,p14,p15,p16,p17,p18,p19;
		int p21,p22,p23,p24,p25,p26,p27,p28,p29;
			int i=0,f=0,sta1,sta2,d;
       	JButton Choosed=new JButton("Start the Game");
       	JButton opicoch=new JButton("OK");JButton okab=new JButton("OK");
		JButton M1=		new JButton(new ImageIcon("m.png"));
		JButton M2=		new JButton(new ImageIcon("mr.png"));
		JButton M3=		new JButton(new ImageIcon("mb.png"));
		JButton M4=		new JButton(new ImageIcon("mc.png"));
		JButton M5=		new JButton(new ImageIcon("md.png"));
		JButton M6= 	new JButton(new ImageIcon("mst.png"));
		JLabel  PL=		new JLabel(" P1");
		JButton M7=		new JButton(new ImageIcon("mbe.png"));
		JButton M8=		new JButton(new ImageIcon("mm.png"));
		
		JButton MM1=	new JButton(new ImageIcon("m.png"));
		JButton MM2=	new JButton(new ImageIcon("mr.png"));
		JButton MM3=	new JButton(new ImageIcon("mb.png"));
		JButton MM4=	new JButton(new ImageIcon("mc.png"));
		JLabel  PpL=	new JLabel(" P2");
		JButton MM5=	new JButton(new ImageIcon("md.png"));
		JButton MM6=    new JButton(new ImageIcon("mst.png"));
		JButton MM7=	new JButton(new ImageIcon("mbe.png"));
		JButton MM8=	new JButton(new ImageIcon("mm.png"));
;	Border paneEdge = BorderFactory.createEmptyBorder(0,10,10,10);
		Border line = BorderFactory.createLineBorder(Color.white);
		Border raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border empty = BorderFactory.createEmptyBorder();
		Border compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
		
		Boolean st1=true,st2=true,st3=true,st4=true,st5=true,st6=true,st7=true,st8=true,st9=true;
       
       		Font ft=new Font("French Script mt",Font.PLAIN,40);
       	JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9;
       	final JFrame abf;
       	About ab;
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		

public static void main(String[] args) 
											{
												new TicTacToe();			
 											}
	
	public  TicTacToe()
											{
	
				de=new ImageIcon("m.png");

        //A border that puts 10 extra pixels at the sides and
        //bottom of each pane.
        				
				Font ft=new Font("French Script mt",Font.PLAIN,40);
								
				frame= new JFrame("Tic tac toe");
				
 			
 				
   				menu = new JMenuBar();
				m1 = new JMenu("File");
				m2 = new JMenu("Help");
				m3= new JMenu("Turn");
				mi1 = new JMenuItem("New Game");
				mi2 = new JMenuItem("Exit");
				mi3 = new JMenuItem("About");
				mi4 = new JMenuItem(p1s);
				mi5 = new JMenuItem("Choose Players");
				ab=new About();
				abf=new JFrame("About");
				
				
				menu.add(m1);
				menu.add(m3);menu.add(m2);
				m1.add(mi1);	m1.add(mi5);
				m1.add(mi2);
				m2.add(mi3);
			m3.add(mi4);
  				frame.add(Pm());	
  				frame.setIconImage(de.getImage());
  				frame.setJMenuBar(menu);	frame.setResizable(false);	frame.setSize(190,225);
  				frame.setLocation((screenSize.width - frame.getWidth()) / 2,(screenSize.height - frame.getHeight()) / 2);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		
				abf.add(ab,BorderLayout.CENTER);abf.add(okab,BorderLayout.SOUTH);
				abf.setSize(410,395);
				abf.setResizable(false);
  				abf.setIconImage(de.getImage());	abf.setLocation((screenSize.width - abf.getWidth()) / 2,(screenSize.height - abf.getHeight()) / 2);
  	//	frame.pack();
  	
  	
  		mi1.addActionListener(new ActionListener()
  		{
  			
  			public void actionPerformed(ActionEvent ev)
  			{
  				
  
  
  
  
 mi4.setText("");
  
  						L1.setIcon(new ImageIcon());
			  			L2.setIcon(new ImageIcon());
			  			L3.setIcon(new ImageIcon());
			    		L4.setIcon(new ImageIcon());
			    		L5.setIcon(new ImageIcon());
			    		L6.setIcon(new ImageIcon());
			    		L7.setIcon(new ImageIcon());
			    		L8.setIcon(new ImageIcon());
			    		L9.setIcon(new ImageIcon());
			  		
			  	st1=true;st2=true;st3=true;st4=true;st5=true;st6=true;st7=true;st8=true;st9=true;
			    		p11=0;
						p12=0;
						p13=0;
						p14=0;
						p15=0;
						p16=0;
						p17=0;
						p18=0;
						p19=0;
						p21=0;
						p22=0;
						p23=0;
						p24=0;
						p25=0;
						p26=0;
						p27=0;
						p28=0;
						p29=0;f=0;
  mi5.setEnabled(true);
  			}
  		});		
  		
  		mi2.addActionListener(new ActionListener()
  		{
  			
  			public void actionPerformed(ActionEvent ev)
  			{
  				System.exit(0);
  			}
  		});
			mi3.addActionListener(new ActionListener()
  		{
  			
  			public void actionPerformed(ActionEvent ev)
  			{
  				abf.setVisible(true);
  			}
  		});	
	cp1=new JFrame("Player 1");
		cp1.add(pan1());
		cp1.setVisible(true);
 		cp1.setResizable(false);	
  		cp1.setSize(180,225);
		cp1.add(opicoch,BorderLayout.SOUTH);
		cp1.setLocation((screenSize.width - cp1.getWidth()) / 2,( screenSize.height- cp1.getHeight()) / 2);
		
		
			cp1.setIconImage(de.getImage());
			
			
		cp2=new JFrame("Player 2");
		cp2.add(pan2());
		  opicoch.setEnabled(false);
		cp2.setResizable(false);
		cp2.setSize(180,225);
		cp2.add(Choosed,BorderLayout.SOUTH);	
			cp2.setLocation((screenSize.width - cp2.getWidth()) / 2,(screenSize.height - cp2.getHeight()) / 2);
	
		Choosed.setEnabled(false);	
				cp2.setIconImage(de.getImage());
	opicoch.addActionListener(new ActionListener()
  		{
  			
  			public void actionPerformed(ActionEvent ev)
  			{
  			cp2.setVisible(true);	
  			cp1.setVisible(false);
  			opicoch.setEnabled(false);
  			}	});
		okab.addActionListener(new ActionListener()
  		{
  			
  			public void actionPerformed(ActionEvent ev)
  			{
  			
  			abf.setVisible(false);
  			}	});
	
			
	
Choosed.addActionListener(new ActionListener()
  		{
  			
  			public void actionPerformed(ActionEvent ev)
  			{	cp2.setVisible(false);
  				frame.setVisible(true);
  				mi4.setIcon(p1s);	Choosed.setEnabled(false);
  			}
  		});		
											
		mi5.addActionListener(new ActionListener()
  		{
  			
  			public void actionPerformed(ActionEvent ev)
  			{	cp1.setVisible(true);
  				
  			}
  		});										
			
			
			
			
			
			
			
			
			



		
		
		
										}
											
				protected JPanel pan1()
											{
												
												
												
															
													JPanel P=new JPanel(new GridLayout(3,3));
													
													P.add(M1);
													P.add(M2);
													P.add(M3);
													P.add(M4);
													P.add(PL);
													P.add(M5);
													P.add(M6);	
													P.add(M7);
													P.add(M8);
													
													M1.addActionListener(this);
													M2.addActionListener(this);
													M3.addActionListener(this);
													M4.addActionListener(this);
													M5.addActionListener(this);
													M6.addActionListener(this);
													M7.addActionListener(this);	
													M8.addActionListener(this);
													
													PL.setFont(ft);		
													PL.setBorder(line);	
													P.setBorder(compound);	
														
													return P;	
				
				
				
			
										}
	protected JPanel pan2()
											{
												
												
																						
													JPanel Pp=new JPanel(new GridLayout(3,3));
										
													Pp.add(MM1);
													Pp.add(MM2);
													Pp.add(MM3);
													Pp.add(MM4);
													Pp.add(PpL);
													Pp.add(MM5);
													Pp.add(MM6);	
													Pp.add(MM7);
													Pp.add(MM8);
														
													MM1.addActionListener(this);
													MM2.addActionListener(this);
													MM3.addActionListener(this);
													MM4.addActionListener(this);
													MM5.addActionListener(this);
													MM6.addActionListener(this);
													MM7.addActionListener(this);	
													MM8.addActionListener(this);
													
													PpL.setFont(ft);
													PpL.setBorder(line);
													Pp.setBorder(compound);	
															
													return Pp;	
																		
																		
																		
																		
											}
  public void actionPerformed( java.awt.event.ActionEvent ev )
  { 
  mi5.setEnabled(false);	
  JButton but=(JButton)ev.getSource();
 
  if(but==M1)
  {
  	opicoch.setEnabled(true);
  M1.setEnabled(true);
  M2.setEnabled(true);
  M3.setEnabled(true);
  M4.setEnabled(true);
  M5.setEnabled(true);
  M6.setEnabled(true);
  M7.setEnabled(true);
  M8.setEnabled(true);
  
 
  MM1.setEnabled(false);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  
  PL.setIcon(but.getIcon());
  PL.setText("");
  
  but.setEnabled(false);
  p1=new ImageIcon("m.png");
  p1s =new ImageIcon("ms.png");
 d=1;
  
sta1=1;
 
  }
  
  
  
  
  else if(but==M2)
  {
  	opicoch.setEnabled(true);
  M1.setEnabled(true);
  M2.setEnabled(false);
  M3.setEnabled(true);
  M4.setEnabled(true);
  M5.setEnabled(true);
  M6.setEnabled(true);
  M7.setEnabled(true);
  M8.setEnabled(true);
  
 
  MM1.setEnabled(true);
  MM2.setEnabled(false);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  
  PL.setIcon(but.getIcon());
  PL.setText("");
  
  but.setEnabled(false);
  p1=new ImageIcon("mr.png");
  p1s =new ImageIcon("mrs.png");
 
  
	sta1=1;
 d=2;
  }
  
  
  
  else if(but==M3)
  {opicoch.setEnabled(true);
  M1.setEnabled(true);
  M2.setEnabled(true);
  M3.setEnabled(false);
  M4.setEnabled(true);
  M5.setEnabled(true);
  M6.setEnabled(true);
  M7.setEnabled(true);
  M8.setEnabled(true);
  
 
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(false);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  
  PL.setIcon(but.getIcon());
  PL.setText("");
  
  but.setEnabled(false);

 
  p1=new ImageIcon("mb.png");
  p1s= new ImageIcon("mbs.png");

	sta1=1;
 d=3;
  }
  
  
  
   else if(but==M4)
  {opicoch.setEnabled(true);
  M1.setEnabled(true);
  M2.setEnabled(true);
  M3.setEnabled(true);
  M4.setEnabled(false);
  M5.setEnabled(true);
  M6.setEnabled(true);
  M7.setEnabled(true);
  M8.setEnabled(true);
  
 
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(false);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  
  PL.setIcon(but.getIcon());
  PL.setText("");
  
  but.setEnabled(false);

 
  p1=new ImageIcon("mc.png");
  p1s =new ImageIcon("mcs.png");
d=4;	sta1=1;
 
  }
  
  
  
  
   else if(but==M5)
  {opicoch.setEnabled(true);
  M1.setEnabled(true);
  M2.setEnabled(true);
  M3.setEnabled(true);
  M4.setEnabled(true);
  M5.setEnabled(false);
  M6.setEnabled(true);
  M7.setEnabled(true);
  M8.setEnabled(true);
  
 
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(false);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  
  PL.setIcon(but.getIcon());
  PL.setText("");
  
  but.setEnabled(false);

 p1=new ImageIcon("md.png");
  p1s= new ImageIcon("mds.png");
  
	sta1=1;
 d=5;
  }
  
  
  
   else if(but==M6)
  {opicoch.setEnabled(true);
  M1.setEnabled(true);
  M2.setEnabled(true);
  M3.setEnabled(true);
  M4.setEnabled(true);
  M5.setEnabled(true);
  M6.setEnabled(false);
  M7.setEnabled(true);
  M8.setEnabled(true);
  
 
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(false);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  
  PL.setIcon(but.getIcon());
  PL.setText("");
  
  but.setEnabled(false);
  p1=new ImageIcon("mst.png");
  p1s =new ImageIcon("msts.png");
 
  d=6;;
	sta1=1;
 
  }
  
  
  
   else if(but==M7)
  {opicoch.setEnabled(true);
  M1.setEnabled(true);
  M2.setEnabled(true);
  M3.setEnabled(true);
  M4.setEnabled(true);
  M5.setEnabled(true);
  M6.setEnabled(true);
  M7.setEnabled(false);
  M8.setEnabled(true);
  
 
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(false);
  MM8.setEnabled(true);
  
  PL.setIcon(but.getIcon());
  PL.setText("");
  
  but.setEnabled(false);
 p1=new ImageIcon("mbe.png");
 p1s =new ImageIcon("mbes.png");
 
  d=7;
	sta1=1;
 
  }
  
  
  
   else if(but==M8)
  {opicoch.setEnabled(true);
  M1.setEnabled(true);
  M2.setEnabled(true);
  M3.setEnabled(true);
  M4.setEnabled(true);
  M5.setEnabled(true);
  M6.setEnabled(true);
  M7.setEnabled(true);
  M8.setEnabled(false);
  
 
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(false);
  
  PL.setIcon(but.getIcon());
  PL.setText("");
  
  but.setEnabled(false);
  p1=new ImageIcon("mm.png");
  p1s= new ImageIcon("mms.png");
 
  d=8;
  
	sta1=1;
}
	
	
	
  
  else if(but==MM1)
  {
  	
  	Choosed.setEnabled(true);
  	
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  PpL.setIcon(but.getIcon());
  PpL.setText("");
  p2=new ImageIcon("m.png");
  p2s= new ImageIcon("ms.png");
 sta2=1; 
  but.setEnabled(false);
  }else if(but==MM2)
  {
  	
  	Choosed.setEnabled(true);
  	  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  PpL.setIcon(but.getIcon());
  PpL.setText("");
  p2=new ImageIcon("mr.png");
  p2s= new ImageIcon("mrs.png");
 sta2=1; 
  but.setEnabled(false);
  }else if(but==MM3)
  {
  	
  			Choosed.setEnabled(true);
  	
  	
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  PpL.setIcon(but.getIcon());
  PpL.setText("");
  p2=new ImageIcon("mb.png");
  p2s= new ImageIcon("mbs.png");
 sta2=1; 
  but.setEnabled(false);
  }else if(but==MM4)
  {
  	
  		Choosed.setEnabled(true);
  	
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  PpL.setIcon(but.getIcon());
  PpL.setText("");
  p2=new ImageIcon("mc.png");
  p2s= new ImageIcon("mcs.png");
 sta2=1; 
  but.setEnabled(false);
  }else if(but==MM5)
  {
  	
  	
  		
  	Choosed.setEnabled(true);
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  PpL.setIcon(but.getIcon());
  PpL.setText("");
  p2=new ImageIcon("md.png");
  p2s= new ImageIcon("mds.png");
 sta2=1; 
  but.setEnabled(false);
  }else if(but==MM6)
  {
  	
  	 	
  	Choosed.setEnabled(true);
  	
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  PpL.setIcon(but.getIcon());
  PpL.setText("");
  p2=new ImageIcon("mst.png");
  p2s= new ImageIcon("msts.png");
 sta2=1; 
  but.setEnabled(false);
  }else if(but==MM7)
  {
  	
  	
  	Choosed.setEnabled(true);
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  PpL.setIcon(but.getIcon());
  PpL.setText("");
  	p2=new ImageIcon("mbe.png");
  p2s= new ImageIcon("mbes.png");
  	
 sta2=1; 
  but.setEnabled(false);
  }else if(but==MM8)
  {
  	
  	
  		
  	Choosed.setEnabled(true);
  MM1.setEnabled(true);
  MM2.setEnabled(true);
  MM3.setEnabled(true);
  MM4.setEnabled(true);
  MM5.setEnabled(true);
  MM6.setEnabled(true);
  MM7.setEnabled(true);
  MM8.setEnabled(true);
  PpL.setIcon(but.getIcon());
  PpL.setText("");
  p2=new ImageIcon("mm.png");
  p2s= new ImageIcon("mms.png");
 sta2=1; 
  but.setEnabled(false);
  }
  
  
  

  
  
  
  
  
  
  
  
  
  	switch(d)
  	{
  	      case 1:
  					MM1.setEnabled(false);break;
  		  case 2:			
  					MM2.setEnabled(false);break;
		  case 3:
		 			MM3.setEnabled(false);break;
		  case 4:
		  			MM4.setEnabled(false);break;
		  case 5:
		  			MM5.setEnabled(false);break;
		  case 6:
		  			MM6.setEnabled(false);break;
		  case 7:
		  			MM7.setEnabled(false);break;
		  case 8:
		  			MM8.setEnabled(false);break;
  			  
  			  
  	}
  	
  	
  	
  	
  	
  }

  	


				
				
				
				
				

 
  public Component Pm()
			  {
			  	JPanel pan=new JPanel(new GridLayout(3,3));
			  	
			  			L1=new JLabel("");
			  			L2=new JLabel("");
			  			L3=new JLabel("");
			    		L4=new JLabel("");
			    		L5=new JLabel("");
			    		L6=new JLabel("");
			    		L7=new JLabel("");
			    		L8=new JLabel("");
			    		L9=new JLabel("");
			    	

			    		
			    		Border compound;
        compound = BorderFactory.createCompoundBorder(
                                  raisedbevel, loweredbevel);
			    	
			    		L1.setBorder(compound);
			    		L2.setBorder(compound);
			    		L3.setBorder(compound);
			    		L4.setBorder(compound);
			    		L5.setBorder(compound);
			    		L6.setBorder(compound);
			    		L7.setBorder(compound);
			    		L8.setBorder(compound);
			    		L9.setBorder(compound);
			    		
			  			pan.add(L1);
			  			pan.add(L2);
			  			pan.add(L3);
			  			pan.add(L4);
			  			pan.add(L5);
			  			pan.add(L6);
			  			pan.add(L7);
			  			pan.add(L8);
			  			pan.add(L9);
			  		
			  			
			 	L1.addMouseListener(this);
			  			L2.addMouseListener(this);
			  			L3.addMouseListener(this);
			  			L4.addMouseListener(this);
			  			L5.addMouseListener(this);
			  			L6.addMouseListener(this);
			  			L7.addMouseListener(this);
			  			L8.addMouseListener(this);
			  			L9.addMouseListener(this);
			  			
			 
			  			return pan;
  
  }


	public void mouseClicked ( java.awt.event.MouseEvent ev  )
 {
 
 }
 public void mousePressed ( java.awt.event.MouseEvent ev )
 	
 	
  {
  	 mi5.setEnabled(false);
  
  	if((st1==false&&ev.getSource()==L1)||(st2==false&&ev.getSource()==L2)||(st3==false&&ev.getSource()==L3)||(st4==false&&ev.getSource()==L4)||(st5==false&&ev.getSource()==L5)||(st6==false&&ev.getSource()==L6)||(st7==false&&ev.getSource()==L7)||(st8==false&&ev.getSource()==L8)||(st9==false&&ev.getSource()==L9))
  	{}
  	else
  	{
  	
  	
  		
  	if(i==1)
  	{mi4.setIcon(p1s);
  		JLabel a=(JLabel)ev.getSource();a.setIcon(p2); 
  		i=0;
  		if(ev.getSource()==L1)
  		{	
  			st1=false;p11=1;
  		}
  		else if(ev.getSource()==L2)
  		{	
  			st2=false;p12=1;
  		}
  		else if(ev.getSource()==L3)
  		{	
  			st3=false;p13=1;
  		}
  		else if(ev.getSource()==L4)
  		{	
  			st4=false;p14=1;
  		}
  		else if(ev.getSource()==L5)
  		{	
  			st5=false;p15=1;
  		}
  		else if(ev.getSource()==L6)
  		{	
  			st6=false;p16=1;
  		}
  		else if(ev.getSource()==L7)
  		{	
  			st7=false;p17=1;
  		}
  		else if(ev.getSource()==L8)
  		{	
  			st8=false;p18=1;
  		}
  		else if(ev.getSource()==L9)
  		{	
  			st9=false;p19=1;
  		}
  		else{}	
  	}
  	else
  	{
  		mi4.setIcon(p2s);
  		i=1;
  		JLabel a=(JLabel)ev.getSource();a.setIcon(p1);
  		if(ev.getSource()==L1)
  		{	
  			st1=false;p21=1;
  		}
  		else if(ev.getSource()==L2)
  		{	
  			st2=false;p22=1;
  		}
  		else if(ev.getSource()==L3)
  		{	
  			st3=false;p23=1;
  		}
  		else if(ev.getSource()==L4)
  		{	
  			st4=false;p24=1;
  		}
  		else if(ev.getSource()==L5)
  		{	
  			st5=false;p25=1;
  		}
  		else if(ev.getSource()==L6)
  		{	
  			st6=false;p26=1;
  		}
  		else if(ev.getSource()==L7)
  		{	
  			st7=false;p27=1;
  		}
  		else if(ev.getSource()==L8)
  		{	
  			st8=false;p28=1;
  		}
  		else if(ev.getSource()==L9)
  		{	
  			st9=false;p29=1;
  		}
  		else{}	
  			
  	}}}
 public void mouseReleased ( java.awt.event.MouseEvent ev )
  {
  	
  	if((p11==1&&p12==1&&p13==1)||(p13==1&&p16==1&&p19==1)||(p11==1&&p14==1&&p17==1)||(p17==1&&p18==1&&p19==1)||(p11==1&&p15==1&&p19==1)||(p12==1&&p15==1&&p18==1)||(p13==1&&p15==1&&p17==1)||(p14==1&&p15==1&&p16==1))
  
  	{
  		
  		mi4.setIcon(p2s);
  		mi4.setText("Player 2 won");
  			JOptionPane.showMessageDialog(frame,"  Player 2 won.\nGame has ended.","Winner",JOptionPane.INFORMATION_MESSAGE,p2);
  	st1=false;st2=false;st3=false;st4=false;st5=false;st6=false;st7=false;st8=false;st9=false;
  	f=1;
  	}
  	if((p21==1&&p22==1&&p23==1)||(p23==1&&p26==1&&p29==1)||(p21==1&&p24==1&&p27==1)||(p27==1&&p28==1&&p29==1)||(p21==1&&p25==1&&p29==1)||(p22==1&&p25==1&&p28==1)||(p23==1&&p25==1&&p27==1)||(p24==1&&p25==1&&p26==1))
  
  	{
  		mi4.setIcon(p1s);
  		mi4.setText("Player 1 won");
  		f=1;
  			JOptionPane.showMessageDialog(frame,"  Player 1 won.\nGame has ended.","Winner",JOptionPane.INFORMATION_MESSAGE,p1);
  	st1=false;st2=false;st3=false;st4=false;st5=false;st6=false;st7=false;st8=false;st9=false;
  	
  	}
  	else if(st1==false&&st2==false&&st3==false&&st4==false&&st5==false&&st6==false&&st7==false&&st8==false&&st9==false&&f==0)
  	{	
  		JOptionPane.showMessageDialog(frame,"                            Its a draw.\n                   			    Game has ended.","Draw",JOptionPane.PLAIN_MESSAGE);
  		mi4.setIcon(new ImageIcon());
  		mi4.setText("Its a draw");
  	}
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	 }
 public void mouseEntered ( java.awt.event.MouseEvent ev )
  {
   
 // JLabel a=(JLabel)ev.getSource();a.setIcon(new ImageIcon("m.png"));
  }
 public void mouseExited ( java.awt.event.MouseEvent ev )
  {
    
  }
 }
  	



  
