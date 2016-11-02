import java.io.*;
class Except1
{
 public static void main(String args[])throws Exception
 { 
 int a[] = {10,20,30},i,p,q,result;
 p=5;
 q=0;
  try
  {
   for(i=0;i<5;i++)
   {
    System.out.println(a[i]);
   }
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
  System.out.println("element does not exist\n"+e);
  }
  
 try
 {
 System.out.print(result=p/q);
 }
 catch(ArithmeticException e)
 {
 System.out.println("divident cannot be 0\n"+e);
 }
  
  finally
  {
   for(i=0;i<5;i++)
   {
    System.out.println(a[i]);
   }

   System.out.println(result=p/q);
  }
 }
} 

