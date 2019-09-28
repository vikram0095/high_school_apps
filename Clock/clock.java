  import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.* ;

import java.text.*;
public class clock extends Applet implements Runnable{

  int i;int h,m,s; ;Thread f ;
int x,y;

  SimpleDateFormat fmt=new SimpleDateFormat ("hh:mm:ss");  Date now= new Date(); String today=fmt.format(now); 
public void init() {

      
}
			
			
			
	public void paint( Graphics g ) {
	g.setColor(Color.white);setBackground( new Color(80,0,0) );
	//	g.drawArc(10,10,180,180,0,360);
		g.drawRoundRect(10,10,180,180,10,10);
		g.drawRoundRect(9,9,182,182,10,10);
		g.drawRoundRect(8,8,184,184,10,10);
		g.drawRoundRect(7,7,186,186,10,10);
		
		
		
		g.drawRoundRect(10,200,180,40,10,10);
		g.drawRoundRect(9,199,182,42,10,10);
		g.drawRoundRect(8,198,184,44,10,10);
		g.drawRoundRect(7,197,186,46,10,10);
		
		
			
		g.drawRoundRect(10,250,180,20,10,10);	
		g.drawRoundRect(9,249,182,22,10,10);	
		g.drawRoundRect(8,248,184,24,10,10);	
		g.drawRoundRect(7,247,186,26,10,10);
		
		
		
		
		
		
				
		g.drawLine(100,10,100,20);	g.drawLine(100,180,100,190);	g.drawLine(10,100,20,100);	g.drawLine(190,100,180,100);		
			
			
			
			
			
			
		now= new Date();
		
      fmt=new SimpleDateFormat ("ss"); 
       today=fmt.format(now); 	
      	s=Integer.parseInt(today);
      	if(s==60)
			{
				s=0;
			}
			
			
			
			 fmt=new SimpleDateFormat ("mm"); 
       today=fmt.format(now); 	
      	m=Integer.parseInt(today);
      	if(m==60)
			{
				m=0;
			}
			
		fmt=new SimpleDateFormat ("hh"); 
       today=fmt.format(now); 	
      	h=5*Integer.parseInt(today);
      
			x = (int)( 60*Math.cos(4.712625+(h*0.104725)+(m/6*5*0.0104725))) ;//4.712625
       y = (int)( 60*Math.sin(4.712625+(h*0.104725)+(m/6*5*0.0104725)) );
        g.drawLine( 100,100, 100+x,100 + y );
			
			
			
			
			
			
			
			
       x = (int)( 70*Math.cos(4.712625+(m*0.104725)) );//4.712625
       y = (int)( 70*Math.sin(4.712625+(m*0.104725)) );
        g.drawLine( 100,100, 100+x,100 + y );
     	
			
      today=fmt.format(now); 
  
   
       x = (int)( 80*Math.cos(4.712625+(s*0.104725)) );//4.712625
       y = (int)( 80*Math.sin(4.712625+(s*0.104725)) );
        g.setColor(Color.red); g.drawLine( 100,100, 100+x,100 + y ); 	g.setColor(Color.white);
     
       fmt=new SimpleDateFormat ("EEEEEEEEEE MMMMMMMMMMM dd yyyy ",  Locale.getDefault());//hh:mm:ss 
          today=fmt.format(now);
          Font font=new Font("Comic Sans MS",Font.PLAIN,12) ;  
          	g.setFont(font);
          g.drawString(today,20,265);
            fmt=new SimpleDateFormat ("hh:mm:ss",  Locale.getDefault());//hh:mm:ss 
          today=fmt.format(now);
          font=new Font("Comic Sans MS",Font.PLAIN,34) ;
          
          
          g.setFont(font);
       g.drawString(today,32,235);


      

      	}	
		public void start()
		{
			f = new Thread(this);
f.start(); 
			
		}
		public void run()
		{
			
	
			for(i=0;i!=0.2;i++)
				
				
				
			{	
				
			try{
				
				
		
		
			Thread.sleep(500);
		
			
				
				
			}
			catch(InterruptedException e)
			{
				System.exit(0);
			}
			
			
			
			
			repaint();
			}
			}
		
			
		
			
			
			
			
		
			
			
			
		
   

  
   }
