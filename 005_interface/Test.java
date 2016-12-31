class Demo implements Info
{
 
 public void/*public must be there*/ display()
 {
  System.out.println("this is display");
 }
 
 public void /*public must be present*/show()
 {
 System.out.println("this is show");
 }

 public void print()
 {
 System.out.println("this is print");
 }

}


class Test
{

 public static void main(String args[])
 {
 /*reference*/Info d1=new Demo();
 d1.display();
 d1.show();

 Demo d2=new Demo();
 d2.print();
 }

}
