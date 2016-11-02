class Complex
{
int r;
int i;
 public Complex()
 {
 r=0;
 i=0;
 }
 
 public Complex(int l,int b)
 {
 r=l;
 i=b;
 }

 public void add(Complex c1,Complex c2)
 {
 r=c1.r+c2.r;
 i=c1.i+c2.i;
 }

 void display()
 {
 System.out.println("complex no. is "+r+"+"+i+"i");
 }
}

class Demo
{
 public static void main(String args[])
 {
 Complex c11=new Complex(10,20);
 Complex c22=new Complex(5,15);
 Complex c3=new Complex();
 c3.add(c11,c22);
 c3.display();
 }

}

