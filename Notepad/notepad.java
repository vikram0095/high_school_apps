package notepad;

import java.applet.Applet;
import java.awt.* ;import java.awt.event.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter.*;
import javax.swing.UIManager.*;
import javax.swing.plaf.metal.*;
import java.io.FileFilter.*;
import javax.swing.filechooser.*;



public class notepad implements ActionListener,WindowListener,KeyListener
	{
		
	Boolean state=false;
	String data="";
	JFrame frame;
	JTextArea tar =new JTextArea("");
	Dimension a=Toolkit.getDefaultToolkit().getScreenSize();
	int aw=(int)(a.getWidth());
	int ah=(int)(a.getHeight());
	File f=new File("Untitled.txt");
	javax.swing.filechooser.FileFilter filtertxt = new FileNameExtensionFilter("Text Document(.txt)","txt");
	final Font font_tar=new Font("Comic sans ms",Font.PLAIN,18);
	
	JFrame wind;
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
	String fontNames[]=gEnv.getAvailableFontFamilyNames();						

	public static void main(String a[])
				{
		
		
								
								new notepad();
						
				}
	public void LoadFont()
	{
		
		try
		{
		
		FileInputStream fis=new FileInputStream(new File("font.txt"));
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		
		fontnameindex=Integer.parseInt(dis.readLine());
		fontstyleindex=Integer.parseInt(dis.readLine());
		fontsizeindex=Integer.parseInt(dis.readLine());
		fontColor=new Color(Integer.parseInt(dis.readLine()),Integer.parseInt(dis.readLine()),Integer.parseInt(dis.readLine()));
		
		System.out.println(fontName+fontstyleindex+fontSize);
			tar.setFont(new Font(fontNames[fontnameindex],fontstyleindex,Integer.parseInt(fontSizes[fontsizeindex])));
		}
		catch(Exception e)
		{
	 JOptionPane.showMessageDialog(frame, "Could not load fonts.","Error",JOptionPane.ERROR_MESSAGE);	
		}
		
	}			
	public notepad()
				{
								
								
								
				
					
			       AddNimbusLook.look();
			       
			       try
								       {
									       	SplashScreen splash=SplashScreen.getSplashScreen();
									       	Thread.sleep(3000); 
									       	splash.close();
								       }
							       	catch(Exception c)
								       {
								       }
			      	//creating frame
			      		frame =new JFrame("");
			  			frame.setTitle("Notepad - Untitled.txt");
			        	frame.setIconImage(new ImageIcon("data/a.png").getImage());
			        	frame.setIconImage(new ImageIcon(getClass().getResource("data/a.png")).getImage());
			           	
						frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			           
			            frame.addWindowListener(this);
			        

					//creating menubar
			            JMenuBar menubar=createMenuBar();
			           frame.setJMenuBar(menubar);
			            
			            
					//adding textarea
			       		frame.add(tar);
			     		tar.setLineWrap(true);
			        	tar.setWrapStyleWord(true);
			        	tar.addKeyListener(this);
			        	tar.setFont(font_tar);
			        	JScrollPane pane = new JScrollPane(tar);
			        
			  			frame.add(pane,BorderLayout.CENTER);
			           	LoadFont();	tar.setForeground(fontColor);
			             frame.setSize(800,530);
			            frame.setLocation((aw-frame.getWidth())/2,(ah-frame.getHeight())/2);
			             frame.setVisible(true);
		            
			               
				}


public JPopupMenu createRightClickPopupMenu()
							{
								 		JPopupMenu popup = new JPopupMenu();
								        JMenuItem cutPMI = new JMenuItem("Cut");
								        JMenuItem copyPMI = new JMenuItem("Copy");
								        JMenuItem pastePMI = new JMenuItem("Paste");
								        JMenuItem select_allPMI = new JMenuItem("Select All");
								        
								        popup.add(cutPMI);
								        popup.add(copyPMI);
								        popup.add(pastePMI);
								        popup.addSeparator();
								        popup.add(select_allPMI);
								        
								      	cutPMI.addActionListener(this);
								      	copyPMI.addActionListener(this);
								   		pastePMI.addActionListener(this);
								     	select_allPMI.addActionListener(this);
								       
								      	select_allPMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
							            cutPMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));
							            copyPMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
							            pastePMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));
															
										return popup;
							}
	public JMenuBar createMenuBar()
	{
				JMenuBar menubar=new JMenuBar();
	            JMenu file = new JMenu("File");
	            JMenu edit = new JMenu("Edit");
	            JMenu format = new JMenu("Format");
	            JMenu about = new JMenu("About");
	            JMenuItem n =new JMenuItem("New");
	            JMenuItem o=new JMenuItem("Open"); 
	            JMenuItem cut=new JMenuItem("Cut"); 
	            JMenuItem copy=new JMenuItem("Copy"); 
	            JMenuItem paste=new JMenuItem("Paste"); 
	            JMenuItem select_all=new JMenuItem("Select All"); 
	            JMenuItem s=new JMenuItem("Save");
	            JMenuItem sa=new JMenuItem("Save as");
	            JMenuItem exit=new JMenuItem("Exit");
	            JMenuItem About=new JMenuItem("About");
	            JMenuItem font=new JMenuItem("Font"); 
	            
	            file.add(n);
	            file.add(o);
	            file.add(s); 
	            file.add(sa); 
	            file.addSeparator();
	            file.add(exit);
	            edit.add(cut);
	            edit.add(copy);
	            edit.add(paste);
	            edit.addSeparator();
	            edit.add(select_all);
	            about.add(About);
	            format.add(font);
	            menubar.add(file);
	            menubar.add(edit);
	            menubar.add(format);
	            menubar.add(about);
				
				o.addActionListener(this);
				font.addActionListener(this);
	            select_all.addActionListener(this);
				s.addActionListener(this);
				sa.addActionListener(this);
	            n.addActionListener(this);
	            exit.addActionListener(this);
	            About.addActionListener(this);
	            cut.addActionListener(this);
	            copy.addActionListener(this);
	            paste.addActionListener(this);
	            tar.addMouseListener(new MouseAdapter(){
														  public void mouseReleased(MouseEvent Me){
														  if(Me.isPopupTrigger()){
														 	JPopupMenu Pmenu=createRightClickPopupMenu();
														  Pmenu.show(Me.getComponent(), Me.getX(), Me.getY());
														  }
														  }
														  });
				
		           
  				//de.setVisible(false);
  
	            
	            select_all.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
	             font.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK));
	            cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));
	            copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
	            paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));
	            o.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
				s.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
				sa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
				exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
				About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
				n.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
				
				return menubar;
	}  		   	
	private JDialog About()
								 {
										 	JDialog aboutDialog=new JDialog(frame);
										 	aboutDialog.setTitle("About Notepad");
										 	aboutDialog.add(new About());
										 	aboutDialog.setSize(408,365);
										 	aboutDialog.setAlwaysOnTop(true);
										 	aboutDialog.setResizable(false);
										 	aboutDialog.setLocation(frame.getX()+(frame.getWidth()-aboutDialog.getWidth())/2,frame.getY()+(frame.getHeight()-aboutDialog.getHeight())/2);
											aboutDialog.setVisible(true);
											aboutDialog.setIconImage(new ImageIcon(getClass().getResource("data/a.png")).getImage());
										 	return aboutDialog;
						 }	
		private JDialog AboutDE()
								 {
										 	JDialog aboutDialog=new JDialog(frame);
										 	aboutDialog.setTitle("Dark Executer");
										 	aboutDialog.add(new JLabel(new ImageIcon(getClass().getResource("data/de.png"))));
										 	aboutDialog.setSize(905,432);
										 	aboutDialog.setAlwaysOnTop(true);
										 	aboutDialog.setResizable(false);
										 	aboutDialog.setLocation(frame.getX()+(frame.getWidth()-aboutDialog.getWidth())/2,frame.getY()+(frame.getHeight()-aboutDialog.getHeight())/2);
											aboutDialog.setVisible(true);
											aboutDialog.setIconImage(new ImageIcon(getClass().getResource("data/a.png")).getImage());
										 	return aboutDialog;
						 }	
						 	
						 	
						 	
	public void open()
	{
		
		
		
								data="";
			            		
			            		JFileChooser chooser = new JFileChooser();
			            		chooser.addChoosableFileFilter(filtertxt); 
						 		chooser.setFileFilter(filtertxt);
						 		 
			            		int ret = chooser.showOpenDialog(frame);
			            		
			 					if (ret == JFileChooser.APPROVE_OPTION) 
			 						{
				         
						       		 	f = chooser.getSelectedFile();
						            		
			            				try
											             			
											     {
																    FileInputStream fis = new FileInputStream(f);
																    BufferedInputStream bis = new BufferedInputStream(fis);
																    DataInputStream dis = new DataInputStream(bis);
																    
																    frame.setTitle("Notepad - "+ f.getName());
																    
			           												while (dis.available() != 0) 
			           													{
			           															data = data  + dis.readLine()+ "\n";
																		        tar.setText("");
																		        tar.setText(data);
			     														}
			
															      fis.close();
															      bis.close();
															      dis.close();
												} 
										catch (FileNotFoundException e) 
												{
											     		 JOptionPane.showMessageDialog(frame, "An error occured. File not found.","Error",JOptionPane.ERROR_MESSAGE);
												}
										catch (IOException e) 
												{
														 JOptionPane.showMessageDialog(frame, "An unknown error occured.","Error",JOptionPane.ERROR_MESSAGE);
												}
			           
			           
			           							
			            
									}
								else if(ret == JFileChooser.CANCEL_OPTION) 
									{
										  //  JOptionPane.showMessageDialog(frame, "Operation was cancelled. No file was chosen.","Error",JOptionPane.INFORMATION_MESSAGE);
									} 
								else if (ret == JFileChooser.ERROR_OPTION)
									{
										    JOptionPane.showMessageDialog(frame, "An error occured. No file was chosen.","Error",JOptionPane.ERROR_MESSAGE);
									}
								else
									{
										    JOptionPane.showMessageDialog(frame, "Unknown operation occured.","Error",JOptionPane.ERROR_MESSAGE);
									}
	
	}
	
	
	public void saveas()
	{
		
		
		
					            JFileChooser chooser = new JFileChooser();
			            		chooser.addChoosableFileFilter(filtertxt); 
					 			chooser.setFileFilter(filtertxt);
					 					
					 					
					 			chooser.setDialogTitle("Save as");
					 			 
					           	int ret = chooser.showSaveDialog(frame);
					            		
						            		if (ret == JFileChooser.APPROVE_OPTION) 
						            			{
						            			
						            				f=chooser.getSelectedFile();
						            				
						            				if(f.getName().toLowerCase().endsWith(".txt")||f.getName().toLowerCase().indexOf(".")!=-1)
								            				{
								            					f = new File(chooser.getSelectedFile().getAbsolutePath());
								            				}
						            				else
								            				{
								            					f = new File(chooser.getSelectedFile().getAbsolutePath()+".txt");	
								            				}
								     				frame.setTitle("Notepad - "+ f.getName());
								     				//System.out.print(f.getName().toLowerCase().indexOf(".")+"");
								            		try 
														{
													     	Writer output = new BufferedWriter(new FileWriter(f));
													      	output.write(tar.getText());
													    	output.close();
													    }
													catch(Exception exc)
														{
															
													    }
						    
						  
					           
						            			}
						            		else if(ret == JFileChooser.CANCEL_OPTION) 
												{
													//    JOptionPane.showMessageDialog(frame, "Operation was cancelled. No file was chosen.","Error",JOptionPane.INFORMATION_MESSAGE);
												} 
											else if (ret == JFileChooser.ERROR_OPTION)
												{
													    JOptionPane.showMessageDialog(frame, "An error occured. No file was chosen.","Error",JOptionPane.INFORMATION_MESSAGE);
												}
											else
												{
													    JOptionPane.showMessageDialog(frame, "Unknown operation occured.","Error",JOptionPane.INFORMATION_MESSAGE);
												}
												state=false;
	}
	
	public void save()
	{
		
		if(frame.getTitle().equals("Notepad - Untitled.txt"))
	            				{
	            					saveas();
	            				}
	            				else
	            				{
	            			
	            			     try 
									{
								     					
								     	Writer output = new BufferedWriter(new FileWriter(f));
								      	output.write(tar.getText());
								    	output.close();
								    	frame.setTitle("Notepad - "+ f.getName());
								    }
								catch(Exception exc)
									{
														 JOptionPane.showMessageDialog(frame, "An unknown error occured.","Error",JOptionPane.ERROR_MESSAGE);
											
								    }
								 }
								 state=false;
	}
						 	
	public void actionPerformed(ActionEvent ev)
	            	{
	            		 
	            		if(ev.getActionCommand().equals("New"))
		            		{ 
		            			
		            			int ret=JOptionPane.showConfirmDialog(frame,"Do you want to save changes to your file?","Notepad",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
		    
								    if(ret==JOptionPane.YES_OPTION)
											{
											save();
											}
								    else if(ret==JOptionPane.NO_OPTION)
									    	{ 
									    	}
		            			tar.setText("");
		            		  	frame.setTitle("Notepad - Untitled.txt");
		            		  	state=false;
		            		}
	            		else if(ev.getActionCommand().equals("de"))
	            			{
	            				AboutDE();
	            			}
	            		else if(ev.getActionCommand().equals("Exit"))
	            			{
	            				System.exit(0);
	            			}
	            		else if(ev.getActionCommand().equals("About"))
	            			{
	            				About();
	            			}
	            		else if(ev.getActionCommand().equals("Open"))
		            		{
			            		open();
		   					}  
		      			else if(ev.getActionCommand().equals("Save as")||(ev.getActionCommand().equals("Save")&&frame.getTitle().equals("Notepad - Untitled.txt")))
		            		{
		            			saveas();
						    }
						else if(ev.getActionCommand().equals("Font"))
		            		{
		            		FontSelector();
		            			
               
            	
		            		}
				    	else if(ev.getActionCommand().equals("Save"))
	            			{
	            				save();   
	            			}
	            		else if(ev.getActionCommand().equals("Cut"))
		            		{
		            			tar.cut();	
		            		}
	            		else if(ev.getActionCommand().equals("Copy"))
		            		{
		            			tar.copy();
		            		}
	            		else if(ev.getActionCommand().equals("Paste"))
		            		{
		            			tar.paste();
		            			
		            		}
	            		else if(ev.getActionCommand().equals("Select All"))
		            		{
		            			tar.selectAll();
		            			
		            		}
		            		else if(ev.getActionCommand().equals("OK"))
		{
			fontColor=color.getBackground();
			
			fontnameindex=fontnames.getSelectedIndex();
			fontsizeindex=fontsize.getSelectedIndex();
			fontstyleindex=fontstyles.getSelectedIndex();
		 
			fontSize=Integer.parseInt(fontSizes[fontsizeindex]);
			fontName=fontNames[fontnameindex];
		//	System.out.println(fontColor+"        	"+fontSize +"            "  +   fontName + "    " +fontstyleindex);
	tar.setForeground(fontColor);
		            		tar.setFont(new Font(fontName,fontstyleindex,fontSize));
		            		try 
														{
													     	BufferedWriter output = new BufferedWriter(new FileWriter(new File("font.txt")));
													      	output.write(fontnameindex+"");
													      	output.newLine();
													      	output.write(fontstyleindex+"");
													      	output.newLine();
													      	output.write(fontsizeindex+"");
													      	output.newLine();
													      	output.write(fontColor.getRed()+"");
													      	output.newLine();
													      	output.write(fontColor.getGreen()+"");
													      	output.newLine();
													      	output.write(fontColor.getBlue()+"");
													    	output.close();
													    }
													catch(Exception exc)
														{
															
													    }
			wind.dispose();
		}
		else if(ev.getActionCommand().equals("Cancel"))
		{
			wind.dispose();
		}
		
		
		else if((JButton)(ev.getSource())==color)
		{
			Color a= JColorChooser.showDialog(wind, "Choose Text Color",fontColor);
			if(a==null)
			{
				a=fontColor;
			}
			color.setBackground(a);
		}
	            		else
	            			{
	            			 			JOptionPane.showMessageDialog(frame, "Unknown operation occured.","Error",JOptionPane.INFORMATION_MESSAGE);
							}
			            							            	
	            	}
	            		
	            		
	            		
	            		
	public void FontSelector()
	{
		
		
			
			SpringLayout sp=new SpringLayout();
			JPanel pan=new JPanel(sp);
			JPanel fonts=fontNames();
			JPanel styles=fontStyles();
			JPanel sizes=fontSizes();
			JPanel panelS=submit();
			
		 color=new JButton("");
			color.setBackground(fontColor); color.addActionListener(this);
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
		wind=new JFrame("Font");
	 	 wind.add(pan);
		wind.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		wind.setSize(425,270);
		int wleft=(int)(scrsize.getWidth()-wind.getWidth())/2;
		int wtop=(int)(scrsize.getHeight()-wind.getHeight())/2;
		wind.setLocation(wleft,wtop);
		wind.setVisible(true);
		
	}
	     	public JPanel fontNames()
	{
		
		
			JPanel pan=new JPanel();
		 fontnames = new JList(fontNames);
		pan.add(fontnames);
     fontnames.setSelectedIndex(fontnameindex);
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
		
		
		fontstyles.setSelectedIndex(fontstyleindex);
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
      fontsize.setSelectedIndex(fontsizeindex);
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
	public void windowClosing(WindowEvent e) 
		{
			if(state==true)
			{
			
			int ret=JOptionPane.showConfirmDialog(frame,"Do you want to save changes to your file?","Notepad",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
		    
								    if(ret==JOptionPane.YES_OPTION)
											{
											save();
											}
								    else if(ret==JOptionPane.NO_OPTION)
									    	{ 
									    	}
			}
						System.exit(0);	
					
			    	
		}
	public void keyPressed(KeyEvent e){state=true;}
	public void keyReleased(KeyEvent e){state=true;}
	public void keyTyped(KeyEvent e){state=true;}
    public void windowClosed(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}	 		
	}
















