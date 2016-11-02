//wap to find factorial of a number using recursive method

import java.util.*;
class Recursive_fact
{

int recurFact(int n)
{
 if(n>1)
 {
 return recurFact(n-1)*n;
 }
 else
 {
 return 1;
 }
}
}

class demo
{
 public static void main(String args[])
 {
 System.out.print("enter number:");
 Scanner sc=new Scanner(System.in);
 int n;
 n=sc.nextInt();
 Recursive_fact k=new Recursive_fact();
 int result=k.recurFact(n);
 System.out.print("factorial "+(n)+"="+(result)+("\n"));
 }

}
