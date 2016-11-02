import java.util.Scanner;
class Smallestno
{
 public static void main(String args[])
 { 
 System.out.print("state array size:");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n],i,s;
 System.out.println("enter elements in array");
 for(i=0;i<n;i++)
 { 
 System.out.print("a["+i+"]=");
 a[i]=sc.nextInt();
 }
 
 s=a[0];
 for(i=0;i<n;i++)
 {
 
  if(a[i]<s)
  {
  s=a[i];
  }
 }
System.out.println("smallest element is "+s);

 }
}
