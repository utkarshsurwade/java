import java.io.*;
import java.util.*;

class NumberFormatExceptionn
{
  public static void main(String args[])throws IOException
  {
  Scanner sc=new Scanner(System.in);
  int m;
  System.out.print("enter month:");
  m=sc.nextInt();
  	try
  	{
	if(m>12 ||m<1)
	{
 	throw new NumberFormatException();
 	}
	System.out.println("month number is:"+m);
	
	}

	catch(NumberFormatException e)
	{
	System.out.println("invalid month number");
	}
  }
}


