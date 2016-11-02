import java.io.*;
class Except2
{
 public static void main(String args[])throws Exception
 { 
 int a,b,result;
 a=5;
 b=0;

 try
 {
 System.out.print(result=a/b);
 }
 
 catch(ArithmeticException e)
 {
 System.out.println("divident cannot be 0\n"+e);
 }
 finally
 {
 System.out.println(result=a/b);
 }
}
}
