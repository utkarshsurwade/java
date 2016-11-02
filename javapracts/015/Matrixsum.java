import java.util.*;
class Matrixsum
{
 public static void main(String args[])
 {
 int i,j;
 Scanner sc=new Scanner(System.in);
 System.out.print("enter first matrix:");
  int m1[][]=new int[3][3];
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    System.out.print("enter element in m1["+i+"]["+j+"]:");
    m1[i][j]=sc.nextInt();
   }
  }
 

 System.out.print("enter second matrix:");
  int m2[][]=new int[3][3];
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    System.out.print("enter element in m2["+i+"]["+j+"]:");
    m2[i][j]=sc.nextInt();
   }
  }


  int m[][]=new int[3][3];
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    m[i][j]=0;
   }
  }


 System.out.println("addition of first and second matrix is:");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    m[i][j]=( m1[i][j]+m2[i][j] );
   }
  }
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    System.out.print(m[i][j]+"\t");
   }
   System.out.println();
  }

 System.out.print("addition of all the elements of matrix1:");
 int sum1=0;
 for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    sum1+=m1[i][j];
   }
  }
System.out.println(sum1);

 System.out.print("addition of all the elements of matrix2:");
 int sum2=0;
 for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    sum2+=m2[i][j];
   }
  }
System.out.println(sum2);
 



 }
}
