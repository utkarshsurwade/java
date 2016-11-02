import java.util.Scanner;
class primeornot
{
 public static void main(String args[])
 {
 int f=1,i,n;
 Scanner sc=new Scanner(System.in);
 System.out.print("enter number :");
 n=sc.nextInt();

 for (i=2;i<n;i++)
 {
  if(n%i==0)
  {
   f=0;
  }
 }
  
  if(f==1)
 {
 System.out.println(n+" is prime");
 }
 else
 {
 System.out.println(n+" is not prime");
 }

 }
}
