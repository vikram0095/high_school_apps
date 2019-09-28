package encoder;
import java.awt.*;
import javax.swing.* ;
import javax.swing.plaf.*;
import javax.swing.UIManager.*;



public class AddNimbusLook
{
	public static void main(String args)
									{
									}
	public static void look()
									{
											try
													{
														for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
														  		{
												    
													        		if("Nimbus".equals(info.getName()))
													        			{
													         				UIManager.setLookAndFeel(info.getClassName());
													           
													        			} 
												        
												    			}
														JDialog.setDefaultLookAndFeelDecorated(true);
														JFrame.setDefaultLookAndFeelDecorated(true);
													} 
										    catch (Exception e) 
										    		{
										    
													}
								 
								
									}
}


















