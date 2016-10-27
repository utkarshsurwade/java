class Abc 
{
 int a,b;
 void add()
 { 
  System.out.println("Addition:"+(a+b));
 }
}

interface Xyz
{
  int c=5;
  void add1();
}

interface Mno
{
 void display();
}

class Pqr extends Abc implements Xyz,Mno
{
 
 public/*must be public*/ void add1()
 {
  System.out.println("addition of "+a+","+b+","+c+" is:"+(a+b+c) );
 }

 public/*must be public*/ void display()
 {
 System.out.println("Hello World");
 }

}

class Demo
{
 public static void main(String args[])
 {
  Pqr x=new Pqr();
  x.a=10;
  x.b=11;
  x.add();
  x.add1();
  x.display();
 }
}

