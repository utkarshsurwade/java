import java.io.*;
import java.util.*;
class Except3
{
 public static void main(String args[])throws ArithmeticException
 {
 int a,b,result;
 Scanner sc=new Scanner(System.in);
  try
  {
  a=sc.nextInt();
  b=sc.nextInt();
  result=a/b;
  System.out.println(result);
  }
  
  catch(ArithmeticException e)
  { 
  System.out.println("divide by zero"+e);
  }
  
  finally
  {
  System.out.println("result="+result);
  }
}
}
