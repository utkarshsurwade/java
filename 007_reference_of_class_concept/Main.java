class ref
{
int a,b;
 void add()
 {
 System.out.println("\naddition:"+(a+b));
 }
}
class normal extends ref
{
 void sub()
 {
 System.out.println("\nsubstraction:"+(a-b));
 }
}

class Main
{ 
 public static void main(String args[])
 {
 ref obj1=new normal();
 obj1.a=5;//obj1 is the object of normal but since its reference is to class ref,it cant acess sub() method.
 obj1.b=4;
 obj1.add();
// obj1.sub(); //not possible

 normal obj2;//reference of normal class is created
 obj2=new normal();//obj2 is the object of normal
 obj2.a=5;
 obj2.b=4;
 obj2.add();
 obj2.sub();
 }
}
