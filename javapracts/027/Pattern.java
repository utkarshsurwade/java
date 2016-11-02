import java.util.*;

class Pattern
{
 public static void main(String args[])
 {
  int n,i,j,alph=65;
 System.out.print("enter n:");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt(); 
  for(i=1;i<=n;i++)
  {
      for(j=n;j>i;j--)
      {
       System.out.print("\t");
      }    
       
      for(j=1;j<=i;j++)
      {
      System.out.print("*\t");
      } 

      for(j=i;j>1;j--)
      {
      System.out.print((char)(alph+j-2));
      System.out.print("\t");
      }

 System.out.println();
 }
 }

}

