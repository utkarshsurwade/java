import java.util.Scanner;

class Greatest
{
 void max(int x,int y)
 {
  if(x>y)
  System.out.print("greatest is "+x);
  else
  System.out.print("greatest is "+y);
 }

 void max(float a,float b)
 {
  if(a>b)
  System.out.print("greatest is "+a);
  else
  System.out.print("greatest is "+b);
 }
}

class overload 
{
 public static void main(String args[])
 {
  Greatest g=new Greatest();
  g.max(5,7);
  System.out.println("");
  g.max(55.67f,576.77f);
 System.out.println("");
 }
}
