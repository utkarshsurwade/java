import java.util.Scanner;
class calci
{
Scanner sc=new Scanner(System.in);

void cir()
{
System.out.print("enter radius:");
double r;
double c=3.14;
r=sc.nextDouble();
double area ,circum;
area=c*r*r;
circum=2*c*r;
System.out.print("area:"+area+"\n");
System.out.print("circumference:"+circum+"\n");
}

void rec()
{
int l,b,area,per;
System.out.print("enter length:");
l=sc.nextInt();
System.out.print("enter breadth:");
b=sc.nextInt();
area=l*b;
per=2*(l+b);
System.out.print("area:"+area+"\n"+
                 "perimeter"+per+"\n");
}

void sq() 
{
int l,b,area,per;
System.out.print("enter length:");
l=sc.nextInt();
area=l*l;
per=2*(l+l);
System.out.print("area:"+area+"\n"+
                 "perimeter"+per+"\n");
}


void tri()
{
int b,h;
double area;
System.out.print("enter base of right angled triangle:");
b=sc.nextInt();
System.out.print("enter height of right angled triangle:");
h=sc.nextInt();
area=h*b*0.5;
System.out.print("area:"+area+"\n");
}


}
