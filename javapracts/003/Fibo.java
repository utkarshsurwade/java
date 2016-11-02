import java.util.*;

class Fibo
{
 public static void main(String args[])
 {
 System.out.print("enter number:");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
  int p=0,c=1,count=2,sum=0;
  while(count<n)
  {
  sum=p+c;
  p=c;
  c=sum;
  count++;
  }
 System.out.print("fibonacii series up to "+(n)+"th term is "+(sum)+"\n");
 }
}
