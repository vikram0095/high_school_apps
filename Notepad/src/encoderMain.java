package encoder;

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
public class encoderMain implements ActionListener,WindowListener
	{
	
	String data="";
	JFrame frame;
	JTextArea tar =new JTextArea("");
	Dimension a=Toolkit.getDefaultToolkit().getScreenSize();
	int aw=(int)(a.getWidth());
	int ah=(int)(a.getHeight());
	File f=new File("Untitled.tcp");
	javax.swing.filechooser.FileFilter filter = new FileNameExtensionFilter("Tcp encoded file(.tcp)","tcp");
	MenuItem hide2,show,exit2,about2;
	public static void main(String a[])
				{
		
						if(a[0].equals("Encoder_0000000001"))
							{
								AddNimbusLook.look();
								new encoderMain(a[0]);
							}
				}
	public encoderMain(String password)
				{
								
								
								
					//checking password
						if(!(password.equals("Encoder_0000000001")))
						{
							System.exit(0);
						}
			       
			      	//creating frame
			      		frame =new JFrame("");
			  			frame.setTitle("Encoder - Untitled.tcp");
			        //	frame.setIconImage(new ImageIcon("data/a.png").getImage());
			        	frame.setIconImage(new ImageIcon(getClass().getResource("data/a.png")).getImage());
			            frame.setSize(530,630);
			            frame.setLocation((aw-frame.getWidth())/2,(ah-frame.getHeight())/2);
						frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			            frame.setVisible(true);
			            frame.addWindowListener(this);
			        

					//creating menubar
			            JMenuBar menubar=createMenuBar();
			            frame.setJMenuBar(menubar);
			            
			            
					//adding textarea
			       		frame.add(tar);
			     		tar.setLineWrap(true);
			        	tar.setWrapStyleWord(true);
			        	JScrollPane pane = new JScrollPane(tar);
			  			frame.add(pane,BorderLayout.CENTER);
			            createSysTray();
			            
		            
			               
				}
	public void createSysTray()
							{
									PopupMenu popup = createPopupMenu();
									final SystemTray tray = SystemTray.getSystemTray();
									final TrayIcon trayIcon = new TrayIcon(new ImageIcon(getClass().getResource("data/a.png")).getImage());      
									try 
										{
									    	tray.add(trayIcon);
										} 
									catch (AWTException e) 
										{
									    	System.out.println("TrayIcon could not be added.");
									    	return;
										}
									trayIcon.setPopupMenu(popup);
									trayIcon.setImageAutoSize(true);
									trayIcon.setToolTip("TCP - Encoder");
									trayIcon.displayMessage("Welcome to Encoder","Produced by The Cyber Protocol", TrayIcon.MessageType.INFO);
									trayIcon.addActionListener(new ActionListener()
									     {
									     	public void actionPerformed(ActionEvent e)
									     	{
									     		frame.setVisible(true);
									     		
									     	}
									      });
							}
	public PopupMenu createPopupMenu()
							{
								 		PopupMenu popup = new PopupMenu();
								        about2 = new MenuItem("About");
								        exit2 = new MenuItem("Exit");
								        hide2 = new MenuItem("Hide");
								        show = new MenuItem("Show");
								        
								        popup.add(about2);
								        popup.add(show);
								        popup.add(hide2);
								        popup.addSeparator();
								        popup.add(exit2);
								        
								        exit2.addActionListener(this);
								        about2.addActionListener(this);
								        show.addActionListener(this);
								        hide2.addActionListener(this);
								       
										show.setEnabled(false);
										
										return popup;
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
	            JMenu about = new JMenu("About");
	            JMenuItem n =new JMenuItem("New");
	            JMenuItem o=new JMenuItem("Open"); 
	            JMenuItem cut=new JMenuItem("Cut"); 
	            JMenuItem copy=new JMenuItem("Copy"); 
	            JMenuItem paste=new JMenuItem("Paste"); 
	            JMenuItem select_all=new JMenuItem("Select All"); 
	            JMenuItem hide=new JMenuItem("Hide");
	            JMenuItem s=new JMenuItem("Save");
	            JMenuItem sa=new JMenuItem("Save as");
	            JMenuItem exit=new JMenuItem("Exit");
	            JMenuItem About=new JMenuItem("About");
	            
	            file.add(n);
	            file.add(o);
	            file.add(s); 
	            file.add(sa); 
	            file.addSeparator();
	            file.add(hide);
	            file.add(exit);
	            edit.add(cut);
	            edit.add(copy);
	            edit.add(paste);
	            edit.addSeparator();
	            edit.add(select_all);
	            about.add(About);
	            menubar.add(file);
	            menubar.add(edit);
	            menubar.add(about);
				
				o.addActionListener(this);
	            select_all.addActionListener(this);
				s.addActionListener(this);
				sa.addActionListener(this);
				hide.addActionListener(this);
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
													  
  
  
  
	            
	            select_all.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
	            cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));
	            copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
	            paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));
	            o.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
				s.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
				sa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
				hide.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
				exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
				About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
				n.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
				
				return menubar;
	}  		   	
	private JDialog About()
								 {
										 	JDialog aboutDialog=new JDialog(frame);
										 	aboutDialog.setTitle("About Encoder");
										 	aboutDialog.add(new About());
										 	aboutDialog.setVisible(true);
										 	aboutDialog.setSize(408,365);
										 	aboutDialog.setAlwaysOnTop(true);
										 	aboutDialog.setResizable(false);
										 	aboutDialog.setLocation(frame.getX()+(frame.getWidth()-aboutDialog.getWidth())/2,frame.getY()+(frame.getHeight()-aboutDialog.getHeight())/2);
											aboutDialog.setIconImage(new ImageIcon(getClass().getResource("data/a.png")).getImage());
										 	return aboutDialog;
								 }						 
	protected String decode(String str){
		 String c,re="";int y=0,state=0;
		 	for(int i=0;i<str.length();i++)
		 	{
		 		c = str.substring(i,i+1);
		 		if(state==0)
		 		{
		 		
		 			
		 		
		 		if(c.equals("#"))
		 		{
		 		c="a";		
		 		}
				else if(c.equals("~"))
				{
				c="b";	
				}
				else if(c.equals("`"))
		 		{
		 		c="c";	
		 		}
				else if(c.equals("@"))
		 		{
		 		c="d";	
		 		}
				else if(c.equals("$"))
		 		{
		 		c="e";	
		 		}
				else if(c.equals("%"))
		 		{
		 		c="f";	
		 		}
				else if(c.equals("^"))
		 		{
		 		c="g";	
		 		}
				else if(c.equals("*"))
		 		{
		 		c="h";	
		 		}
				else if(c.equals(","))
		 		{
		 		c="i";	
		 		}
				else if(c.equals("("))
		 		{
		 		c="j";	
		 		}
				else if(c.equals(")"))
		 		{
		 		c="k";	
		 		}
				else if(c.equals("_"))
		 		{
		 		c="l";	
		 		}
				else if(c.equals("-"))
		 		{
		 		c="m";	
		 		}
				else if(c.equals("="))
		 		{
		 		c="n";	
		 		}	
		 		else if(c.equals("+"))
		 		{
		 		c="o";	
		 		}	
		 		else if(c.equals("|"))
		 		{
		 		c="p";	
		 		}	
		 		else if(c.equals("{"))
		 		{
		 		c="q";	
		 		}	
		 		else if(c.equals("}"))
		 		{
		 		c="r";	
		 		}	
		 		else if(c.equals("?"))
		 		{
		 		c="s";	
		 		}	
		 		else if(c.equals("["))
		 		{
		 		c="t";	
		 		}	
		 		else if(c.equals("]"))
		 		{
		 		c="u";	
		 		}	
		 		else if(c.equals(":"))
		 		{
		 		c="v";	
		 		}	
		 		else if(c.equals(";"))
		 		{
		 		c="w";	
		 		}	
		 		else if(c.equals("."))
		 		{
		 		c="x";	
		 		}	
		 		else if(c.equals(">"))
		 		{
		 		c="y";	
		 		}	
		 		else if(c.equals("<"))
		 		{
		 		c="z";	
		 		}
		 		
		 		else{}
		 			
		 		
		 		if(c.equals("&")){
		 			state=1;
		 		
		 		}
		 		
		 		else if(c.equals("!"))
		 		{
		 			y=1;
		 			
		 		}
		 	
		 		else{
		 			if(y==1)
		 			{c=c.toUpperCase();y=0;
		 			}re=re+c;
		 		}
		 		
		 		
		 		
		 		
		 		}
		 		else
		 		{
		 		 state=0;
		 		 	re=re+c;
		 		 
		 		 
		 		} 
		 			
			
		 	
		 		
			 	}
		return re;	}
	protected String encode(String str){
		 String c,re="";
		 	for(int i=0;i<str.length();i++)
		 	{
		 		c = str.substring(i,i+1);
		 		//JOptionPane.showMessageDialog(f,c,"",JOptionPane.INFORMATION_MESSAGE);
		 		
		 		
		 		
		 		if(c.equals("a"))
		 		{
		 		c="#";		
		 		}
				else if(c.equals("b"))
				{
				c="~";	
				}
				else if(c.equals("c"))
		 		{
		 		c="`";	
		 		}
				else if(c.equals("d"))
		 		{
		 		c="@";	
		 		}
				else if(c.equals("e"))
		 		{
		 		c="$";	
		 		}
				else if(c.equals("f"))
		 		{
		 		c="%";	
		 		}
				else if(c.equals("g"))
		 		{
		 		c="^";	
		 		}
				else if(c.equals("h"))
		 		{
		 		c="*";	
		 		}
				else if(c.equals("i"))
		 		{
		 		c=",";	
		 		}
				else if(c.equals("j"))
		 		{
		 		c="(";	
		 		}
				else if(c.equals("k"))
		 		{
		 		c=")";	
		 		}
				else if(c.equals("l"))
		 		{
		 		c="_";	
		 		}
				else if(c.equals("m"))
		 		{
		 		c="-";	
		 		}
				else if(c.equals("n"))
		 		{
		 		c="=";	
		 		}	
		 		else if(c.equals("o"))
		 		{
		 		c="+";	
		 		}	
		 		else if(c.equals("p"))
		 		{
		 		c="|";	
		 		}	
		 		else if(c.equals("q"))
		 		{
		 		c="{";	
		 		}	
		 		else if(c.equals("r"))
		 		{
		 		c="}";	
		 		}	
		 		else if(c.equals("s"))
		 		{
		 		c="?";	
		 		}	
		 		else if(c.equals("t"))
		 		{
		 		c="[";	
		 		}	
		 		else if(c.equals("u"))
		 		{
		 		c="]";	
		 		}	
		 		else if(c.equals("v"))
		 		{
		 		c=":";	
		 		}	
		 		else if(c.equals("w"))
		 		{
		 		c=";";	
		 		}	
		 		else if(c.equals("x"))
		 		{
		 		c=".";	
		 		}	
		 		else if(c.equals("y"))
		 		{
		 		c=">";	
		 		}	
		 		else if(c.equals("z"))
		 		{
		 		c="<";	
		 		}
		 		else if(c.equals("A"))
		 		{
		 		c="!#";		
		 		}
				else if(c.equals("B"))
				{
				c="!~";	
				}
				else if(c.equals("C"))
		 		{
		 		c="!`";	
		 		}
				else if(c.equals("D"))
		 		{
		 		c="!@";	
		 		}
				else if(c.equals("E"))
		 		{
		 		c="!$";	
		 		}
				else if(c.equals("F"))
		 		{
		 		c="!%";	
		 		}
				else if(c.equals("G"))
		 		{
		 		c="!^";	
		 		}
				else if(c.equals("H"))
		 		{
		 		c="!*";	
		 		}
				else if(c.equals("I"))
		 		{
		 		c="!,";	
		 		}
				else if(c.equals("J"))
		 		{
		 		c="!(";	
		 		}
				else if(c.equals("K"))
		 		{
		 		c="!)";	
		 		}
				else if(c.equals("L"))
		 		{
		 		c="!_";	
		 		}
				else if(c.equals("M"))
		 		{
		 		c="!-";	
		 		}
				else if(c.equals("N"))
		 		{
		 		c="!=";	
		 		}	
		 		else if(c.equals("O"))
		 		{
		 		c="!+";	
		 		}	
		 		else if(c.equals("P"))
		 		{
		 		c="|";	
		 		}	
		 		else if(c.equals("Q"))
		 		{
		 		c="!{";	
		 		}	
		 		else if(c.equals("R"))
		 		{
		 		c="!}";	
		 		}	
		 		else if(c.equals("S"))
		 		{
		 		c="!?";	
		 		}	
		 		else if(c.equals("T"))
		 		{
		 		c="![";	
		 		}	
		 		else if(c.equals("U"))
		 		{
		 		c="!]";	
		 		}	
		 		else if(c.equals("V"))
		 		{
		 		c="!:";	
		 		}	
		 		else if(c.equals("W"))
		 		{
		 		c="!;";	
		 		}	
		 		else if(c.equals("X"))
		 		{
		 		c="!.";	
		 		}	
		 		else if(c.equals("Y"))
		 		{
		 		c="!>";	
		 		}	
		 		else if(c.equals("Z"))
		 		{
		 		c="!<";	
		 		}
		 		else if(c.equals("#")||c.equals("~")||c.equals("`")||c.equals("@")||c.equals("$")||c.equals("%")||c.equals("^")||
		 			c.equals("*")||c.equals(",")||c.equals("(")||c.equals(")")||c.equals("_")||c.equals("-")||c.equals("=")||c.equals("+")
		 				||c.equals("|")||c.equals("{")||c.equals("}")||c.equals("?")||c.equals("[")||c.equals("]")||c.equals(":")||
		 					c.equals(";")||c.equals(".")||c.equals(">")||c.equals("<")||c.equals("!")||c.equals("&"))
		 		{
		 			c="&"+c;
		 			}	else{}
		 			
		 		
		 	
		 		
		 		
		 	re=re+c;
		 		
		 
		 	
		 		
		 		
		 		
		 		
		 		
		 		}
		 		
			
		 	return re;			
		 		
		 	}
	public void actionPerformed(ActionEvent ev)
	            	{
	            		 javax.swing.filechooser.FileFilter filter = new FileNameExtensionFilter("Tcp encoded file(.tcp)","tcp");
	            		if(ev.getActionCommand().equals("New"))
		            		{ 
		            			tar.setText("");
		            		  	frame.setTitle("Encoder - Untitled.tcp");
		            		}
	            		else if(ev.getActionCommand().equals("Exit"))
	            			{
	            				System.exit(0);
	            			}
	            		else if(ev.getActionCommand().equals("About"))
	            			{
	            				About();
	            			}
	            		else if(ev.getActionCommand().equals("Hide"))
		            		{
		            			frame.setVisible(false);
		            			show.setEnabled(true);
		            			hide2.setEnabled(false);
		            		}
	            		else if(ev.getActionCommand().equals("Show"))
	            			{
	            				frame.setVisible(true);
	            				hide2.setEnabled(true);
	            				show.setEnabled(false);
	            			}
	            		else if(ev.getActionCommand().equals("Open"))
		            		{
			            		data="";
			            		JFileChooser chooser = new JFileChooser();
			            		chooser.addChoosableFileFilter(filter); 
						 		chooser.setFileFilter(filter); 
			            		int ret = chooser.showOpenDialog(frame);
			 					if (ret == JFileChooser.APPROVE_OPTION) 
			 						{
				         
						       		 	f = chooser.getSelectedFile();
						            		if(f.getName().toLowerCase().endsWith(".tcp"))
			           								 {
			            									try
											             			{
																    FileInputStream fis = new FileInputStream(f);
																    BufferedInputStream bis = new BufferedInputStream(fis);
																    DataInputStream dis = new DataInputStream(bis);
																    frame.setTitle("Encoder - "+ f.getName());
			           												while (dis.available() != 0) 
			           													{
			           															data = data  + dis.readLine()+ "\n";
																		        tar.setText("");
																		        tar.setText(decode(data));
			     														}
			
															      fis.close();
															      bis.close();
															      dis.close();
																	} 
															catch (FileNotFoundException e) 
																	{
																     System.out.println("File not found");
																    }
															catch (IOException e) {
																      
																    }
			           
			           
			           								}
			           						else  
			           								{
			                  	                    		JOptionPane.showMessageDialog(frame,"Invalid file.\nPlease choose a tcp file.","Error",JOptionPane.INFORMATION_MESSAGE);
			           								}
			            
									}
								else if(ret == JFileChooser.CANCEL_OPTION) 
									{
										    JOptionPane.showMessageDialog(frame, "Operation was cancelled. No file was chosen.","Error",JOptionPane.INFORMATION_MESSAGE);
									} 
								else if (ret == JFileChooser.ERROR_OPTION)
									{
										    JOptionPane.showMessageDialog(frame, "An error occured. No file was chosen.","Error",JOptionPane.INFORMATION_MESSAGE);
									}
								else
									{
										    JOptionPane.showMessageDialog(frame, "Unknown operation occured.","Error",JOptionPane.INFORMATION_MESSAGE);
									}
		   					}  
		      			else if(ev.getActionCommand().equals("Save as")||(ev.getActionCommand().equals("Save")&&frame.getTitle().equals("Encoder - Untitled.tcp")))
		            		{
		            			
					            		JFileChooser chooser = new JFileChooser();	chooser.addChoosableFileFilter(filter); 
					 					chooser.setFileFilter(filter);
					 					chooser.setDialogTitle("Save as"); 
					            		int ret = chooser.showSaveDialog(frame);
						            		if (ret == JFileChooser.APPROVE_OPTION) 
						            			{
						            				
						            				f=chooser.getSelectedFile();
						            				if(f.getName().toLowerCase().endsWith(".tcp"))
								            				{
								            					f = new File(chooser.getSelectedFile().getAbsolutePath());
								            				}
						            				else
								            				{
								            					f = new File(chooser.getSelectedFile().getAbsolutePath()+".tcp");	
								            				}
								     				
								     				frame.setTitle("Encoder - "+ f.getName());
								            		try 
														{
													     	Writer output = new BufferedWriter(new FileWriter(f));
													      	output.write(encode(tar.getText()));
													    	output.close();
													    }
													catch(Exception exc)
														{
															
													    }
						    
						  
					           
						            			}
						            		else if(ret == JFileChooser.CANCEL_OPTION) 
												{
													    JOptionPane.showMessageDialog(frame, "Operation was cancelled. No file was chosen.","Error",JOptionPane.INFORMATION_MESSAGE);
												} 
											else if (ret == JFileChooser.ERROR_OPTION)
												{
													    JOptionPane.showMessageDialog(frame, "An error occured. No file was chosen.","Error",JOptionPane.INFORMATION_MESSAGE);
												}
											else
												{
													    JOptionPane.showMessageDialog(frame, "Unknown operation occured.","Error",JOptionPane.INFORMATION_MESSAGE);
												}
						           			}
				    	else if(ev.getActionCommand().equals("Save"))
	            			{
	            	
			            		try 
									{
								     					
								     	Writer output = new BufferedWriter(new FileWriter(f));
								      	output.write(encode(tar.getText()));
								    	output.close();
								    	frame.setTitle("Encoder - "+ f.getName());
								    }
								catch(Exception exc)
									{
										
								     		    JOptionPane.showMessageDialog(frame,exc+"","Error3",JOptionPane.INFORMATION_MESSAGE);
									
								    }
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
	            		else
	            			{
	            			 			JOptionPane.showMessageDialog(frame, "Unknown operation occured.","Error",JOptionPane.INFORMATION_MESSAGE);
							}
			            							            	
	            	}
	            		
	            		
	            		
	            		
	
	            	 	
	public void windowClosing(WindowEvent e) 
		{
			int ret=JOptionPane.showConfirmDialog(frame,"Are you sure you want to quit?","Encoder",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
		    
		    if(ret==JOptionPane.YES_OPTION)
					{
						System.exit(0);	
					}
		    else if(ret==JOptionPane.NO_OPTION)
			    	{
			    	}
		}
    public void windowClosed(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}	 		
	}
















