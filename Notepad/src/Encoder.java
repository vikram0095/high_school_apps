package encoder;

import java.awt.* ;
public class Encoder
{
public static void main(String args)
	{
	}
public static String decode(String password,String str){
	if(!password.equals("Encoder_0000000001"))
	{
		return "Thisisasecretpassword";
	}
	 String c,re="";int y=0,state=0;
	 	for(int i=0;i<str.length();i++)
	 	{
	 		
	 		c = str.substring(i,i+1);
	 		//JOptionPane.showMessageDialog(f,c,"",JOptionPane.INFORMATION_MESSAGE);
	 		
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
public static String encode(String password,String str){
	if(!password.equals("Encoder_0000000001"))
	{
		return "Thisisasecretpassword";
	}
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
}


















