import java.util.Scanner;
class Arraysort
{
 public static void main(String args[])
 {
 System.out.print("enter no. of elements to be sorted:");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a[]=new int[n];
 int i,j,temp;
  
  for(i=0;i<n;i++)
  { 
   System.out.print("enter element in "+"a["+i+"]"+"th position of array:");
   a[i]=sc.nextInt(); 
  }
   
  for(i=0;i<n-1;i++)
  {
    for(j=i;j<n;j++)
    {
      if(a[i]<a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
 
  }



  System.out.print("the array is :");
  for(i=0;i<n;i++)
 {
  System.out.print((a[i])+" ");
 }
 System.out.print("\n");

 } 



}
