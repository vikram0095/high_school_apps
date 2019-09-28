package encoder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import javax.swing.border.*;


public class Login extends JFrame implements ActionListener,MouseMotionListener,MouseListener 
	{
		JButton login,exit;
		JTextField userid;
		JPasswordField password;
		JLabel useridLabel,passwordLabel,warn;
		JFrame wind;
		Border bdr1,bdr2,bdr;
		int tr=0;
	    JLabel titext;
	  	double xc=0,yc=0;
  		
		public static void main(String args[])
				{
				
					new Login();
				}
 		public Login()
					 	{
					 				try
								       {
									       	SplashScreen splash=SplashScreen.getSplashScreen();
									       	Thread.sleep(3000); 
									       	splash.close();
								       }
							       	catch(Exception c)
								       {
								       }
								       
								 	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();	
								 	AddNimbusLook.look();
								 	wind=new JFrame("Log in");
								 	wind.add(createMainPanel());
								 	wind.setUndecorated(true);
								 	wind.setOpacity(0.95f); 
								 	wind.setVisible(true);	
								 	wind.setSize(370,130);
								 	wind.setLocation((int)(d.getWidth()-340)/2,(int)(d.getHeight()-110)/2);
								 	userid.requestFocus();
					 				
					 	
					 	
					  	}
 		public JPanel createMainPanel()
  	{
 			
 	//addin border
 		 	bdr1 = BorderFactory.createEtchedBorder(BevelBorder.RAISED);
        	bdr2 = BorderFactory.createEtchedBorder(BevelBorder.LOWERED);
         	bdr = BorderFactory.createCompoundBorder(bdr1,bdr2);
         
 	//Initialisation of components
 			SpringLayout layout=new SpringLayout();	
 			SpringLayout layout2=new SpringLayout();
		 	JPanel main=new JPanel(layout);
		 	main.setBorder(bdr);
		 	useridLabel=new JLabel("Name");
		 	passwordLabel=new JLabel("Password");warn=new JLabel("");
		 	userid=new JTextField();
		 	JLabel titext=new JLabel("TCP- Sign in");
 			Font font=new Font("French Script MT",Font.PLAIN,22);
 			titext.setFont(font);
 			titext.setHorizontalAlignment(JLabel.LEFT);	
 			titext.setVerticalAlignment(JLabel.TOP);	
		 	password=new JPasswordField();
		 	login=new JButton("Sign in");
		 	exit=new JButton("X");
		 	JPanel pn=new JPanel(layout2);
	
 	//adding them to panels
		 	main.add(pn);
		 	main.add(useridLabel);
		 	main.add(passwordLabel);
		 	main.add(userid);
		 	main.add(password);
		 	main.add(login);
		 	main.add(warn);
		 	pn.add(titext);	
		 	pn.add(exit);

	//adding properties
			warn.setForeground(Color.red);	 	
		 	exit.setFont(new Font("Comic sans ms",Font.BOLD,12));
		 	pn.setBorder(BorderFactory.createLineBorder(new Color(150,150,150)));
		 	
 	//adding eventlisterner
		 	pn.addMouseMotionListener(this);
		 	pn.addMouseListener(this);
		 	login.addActionListener(this);
		 	exit.addActionListener(this);
		 	userid.addActionListener(this);
		 	password.addActionListener(this);
		 	
 	//positioning them
		 	layout.putConstraint(SpringLayout.WEST,pn,0,SpringLayout.WEST,main);
			layout.putConstraint(SpringLayout.EAST,pn,0,SpringLayout.EAST,main);
			layout.putConstraint(SpringLayout.NORTH,pn,0,SpringLayout.NORTH,main);
			layout.putConstraint(SpringLayout.SOUTH,pn,25,SpringLayout.NORTH,main);
		 	
		 	
			layout.putConstraint(SpringLayout.WEST,useridLabel,10,SpringLayout.WEST,main);
			layout.putConstraint(SpringLayout.EAST,useridLabel,100,SpringLayout.WEST,main);
			layout.putConstraint(SpringLayout.NORTH,useridLabel,10,SpringLayout.SOUTH,titext);
		//	layout.putConstraint(SpringLayout.WEST,useridLabel,10,SpringLayout.WEST,main);
		
		 	layout.putConstraint(SpringLayout.WEST,passwordLabel,10,SpringLayout.WEST,main);
			layout.putConstraint(SpringLayout.EAST,passwordLabel,100,SpringLayout.WEST,main);
			layout.putConstraint(SpringLayout.NORTH,passwordLabel,10,SpringLayout.SOUTH,useridLabel);
		//	layout.putConstraint(SpringLayout.WEST,passwordLabel,10,SpringLayout.WEST,main);
		
		   
		 	 layout.putConstraint(SpringLayout.WEST,userid,10,SpringLayout.EAST,useridLabel);
			layout.putConstraint(SpringLayout.EAST,userid,-10,SpringLayout.EAST,main);
			layout.putConstraint(SpringLayout.NORTH,userid,-2,SpringLayout.NORTH,useridLabel);
		//	layout.putConstraint(SpringLayout.WEST,userid,10,SpringLayout.WEST,main);
		
		 	layout.putConstraint(SpringLayout.WEST,password,10,SpringLayout.EAST,passwordLabel);
			layout.putConstraint(SpringLayout.EAST,password,-10,SpringLayout.EAST,main);
			layout.putConstraint(SpringLayout.NORTH,password,-2,SpringLayout.NORTH,passwordLabel);
		//	layout.putConstraint(SpringLayout.WEST,password,10,SpringLayout.WEST,main);
		
		 	layout.putConstraint(SpringLayout.WEST,login,-165,SpringLayout.EAST,main);
			layout.putConstraint(SpringLayout.EAST,login,-10,SpringLayout.EAST,main);
			layout.putConstraint(SpringLayout.NORTH,login,10,SpringLayout.SOUTH,passwordLabel);
			layout.putConstraint(SpringLayout.SOUTH,login,-5,SpringLayout.SOUTH,main);
		
		 	layout.putConstraint(SpringLayout.WEST,warn,10,SpringLayout.WEST,main);
			layout.putConstraint(SpringLayout.EAST,warn,-10,SpringLayout.WEST,login);
			layout.putConstraint(SpringLayout.NORTH,warn,12,SpringLayout.SOUTH,passwordLabel);
			layout.putConstraint(SpringLayout.SOUTH,warn,-10,SpringLayout.SOUTH,main);
		
			layout2.putConstraint(SpringLayout.WEST,titext,10,SpringLayout.WEST,pn);
			layout2.putConstraint(SpringLayout.EAST,titext,-10,SpringLayout.EAST,pn);
			layout2.putConstraint(SpringLayout.NORTH,titext,0,SpringLayout.NORTH,pn);
			layout2.putConstraint(SpringLayout.SOUTH,titext,30,SpringLayout.NORTH,pn);
			
			layout2.putConstraint(SpringLayout.WEST,exit,-47,SpringLayout.EAST,pn);
			layout2.putConstraint(SpringLayout.EAST,exit,-10,SpringLayout.EAST,pn);
			layout2.putConstraint(SpringLayout.NORTH,exit,0,SpringLayout.NORTH,pn);
			layout2.putConstraint(SpringLayout.SOUTH,exit,22,SpringLayout.NORTH,pn);
 	
 			
 	return main;
 	
 }
		public String[][] Read(String path)
	{
		
			String userpass[][]=new String[10][10];
            try
	            {
						     InputStream fis = this.getClass().getResourceAsStream(path);
						    BufferedInputStream bis = new BufferedInputStream(fis);
						    DataInputStream dis = new DataInputStream(bis);
					           
	           				int i=0;
	            			while (dis.available() != 0) 
	            				{
							 		userpass[i][0]=Encoder.decode("Encoder_0000000001",dis.readLine());
							 		userpass[i][1]=Encoder.decode("Encoder_0000000001",dis.readLine());
						    		i++;
	      						}
											
							fis.close();
							bis.close();
							dis.close();
	            }
            catch(Exception e)
	            {
	            	
	            }
	
			return userpass;
	}
		public void actionPerformed(ActionEvent e)
					{
								 
								String act=e.getActionCommand();
								Boolean s=false;
						
								if(act.equals("Sign in"))
											{
												
												
												

			String users[][]=Read("data/log.tcp");
																for(int i=0;i<10;i++)
																{
																	  if(userid.getText().toLowerCase().equals(users[i][0])&&password.getText().equals(users[i][1]))
																	  {
																			try
																					{
																							wind.setVisible(false);	
																							new encoderMain("Encoder_0000000001");
																							warn.setText("");
																				  
																				  	}
																			catch(Exception c1)
																					{
																					}
																	  		s=true;
																	  		break;
																	  }
											
											}
											}
								else if(act.equals("X"))
											{
												System.exit(0);
											}
								else
											{
												JTextField txtfld=(JTextField)(e.getSource());
												if(txtfld==userid)
													{
														password.requestFocus();	s=true;
													}
												else if(txtfld==password)
													{
										
	String users[][]=Read("data/log.tcp");
						for(int i=0;i<10;i++)
																	{
																		  if(userid.getText().toLowerCase().equals(users[i][0])&&password.getText().equals(users[i][1]))
																		  {
																				try
																						{
																								wind.setVisible(false);	
																								new encoderMain("Encoder_0000000001");
																								warn.setText("");
																					  
																					  	}
																				catch(Exception c1)
																						{
																						}
																		  		s=true;
																		  		break;
																		  }
																	}
														
													
													}
												else{}
												
												
												
												
												
											}
											
								if(!s)
								{
								
									warn.setText("Try again (Chances left "+(3-tr)+")");
									
									if(tr==3)
										{
												System.exit(0);
										}
									tr++;
						
								}
							
								
								
									 
					}
		public void mouseClicked(MouseEvent e){}
		public void mousePressed(MouseEvent e)
			{
			 	xc=e.getX();yc=e.getY();
			}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){} 
		public void mouseExited(MouseEvent e){} 	
		public void mouseDragged(MouseEvent e)
		{
			Point xy=wind.getLocation();
			double x=xy.getX(),y=xy.getY();
			double x1=e.getX(),y1=e.getY();
		    wind.setLocation((int)(x+x1-xc),(int)(y+y1-yc));
		}
		public void mouseMoved(MouseEvent e){}
	}