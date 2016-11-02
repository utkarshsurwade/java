//wap in java to demonstrate interface in java

import java.util.*;
interface myinterface
{
void rect();
void equiTri();
void cir();
}

class Abc implements myinterface
{
 Scanner sc=new Scanner(System.in);
 public void rect()
 { 
  System.out.print("enter length of rectangle:");
  int a=sc.nextInt();
  System.out.print("enter breadth of rectangle:");
  int b=sc.nextInt();
  System.out.println("area of rectangle ="+(a*b));
 }
 
 public void equiTri()
 {
  System.out.print("enter base of equilateral triangle:");
  int x=sc.nextInt();
  System.out.print("enter height of equilateral triangle:");
  int y=sc.nextInt();
  System.out.println("area of equilateral triangle ="+(x*y*0.5));
 }

 public void cir()
 {
  System.out.print("enter radius of circle:");
  float r=sc.nextInt();
  System.out.println("area of circle ="+(3.14f*r*r));
 }

}

class Interface1
{
  public static void main(String args[])
  {
   Abc k=new Abc();
   k.rect();
   k.equiTri();
   k.cir();
  }
}
