import java.util.*;

class Shape
{
int base,height;
Scanner sc=new Scanner(System.in); 
void Getdata()
 {
 System.out.print("enter base:");
 base=sc.nextInt();
 System.out.print("enter height:");
 height=sc.nextInt();
 }
}

class Triangle extends Shape
{
 void Displayarea()
 {
  Getdata();
  float area=(base*height*(0.5f));
  System.out.println("area="+area);
 }
}

class Rectangle extends Shape

{
 void Displayarea()
 {
  Getdata();
  int area=base*height;
  System.out.println("area="+area);
 }
}

class Hirar
{
 public static void main(String args[])
 {
 Triangle o1=new Triangle();
 o1.Displayarea();
 Rectangle o2=new Rectangle();
 o2.Displayarea();
 }
}
