//wap in java to implement method overloading to calculate area of rectangle

import java.util.*;
class Rectangle
{
 void area(int x,int y)
 {
 System.out.println("area="+(x*y));
 }
 void area(float a,float b)
 {
  System.out.println("area="+(a*b));
 }
}
class Overloading
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("for integer type area:-");
  System.out.print("enter length of rectangle:");
  int p=sc.nextInt(); 
  System.out.print("enter breadth of rectangle:");
  int q=sc.nextInt();
  Rectangle z=new Rectangle();
  z.area(p,q);

  System.out.println("for float type area:-");
  System.out.print("enter length of rectangle:");
  float r=sc.nextFloat();
  System.out.print("enter breadth of rectangle:");
  float s=sc.nextFloat();
  z.area(r,s);
 }
}
