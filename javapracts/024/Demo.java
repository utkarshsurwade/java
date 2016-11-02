//wap in java to create a Rectangle class, objects, and implement method to calculate area of rectange
import java.util.*;
class Rectangle
{ 
  int length,breadth;
  void getData(int x,int y)
  {
  length=x;
  breadth=y;
  }
  void area()
  {
   System.out.println("area="+(length*breadth));
  }
}

class Demo
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.print("enter length of rectangle:");
  int a=sc.nextInt();
  System.out.print("enter breadth of rectangle:");
  int b=sc.nextInt();
  Rectangle r=new Rectangle();
  r.getData(a,b);
  r.area();
  }
}
