import java.util.*;

class Matrixmul
{
 public static void main(String args[])
 {
  int r1,c1,r2,c2,i,j,k;
  Scanner sc=new Scanner(System.in);
  System.out.print("enter rows of matrix 1:");
  r1=sc.nextInt();
  System.out.print("enter columns of matrix 1:");
  c1=sc.nextInt();
  
  System.out.print("enter rows of matrix 2:");
  r2=sc.nextInt();
  System.out.print("enter columns of matrix 2:");
  c2=sc.nextInt();

 if(c1==r2)
{
    int m1[][]=new int[r1][c1];
    System.out.print("enter elements in matrix 1:\n\n");
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c1;j++)          //taking elements im matrix1
      {
       System.out.print("m1["+i+"]["+j+"]=");
       m1[i][j]=sc.nextInt();
      }
    }


    int m2[][]=new int[r2][c2];
    System.out.print("enter elements in matrix 2:\n\n");
    for(i=0;i<r2;i++)
    {
      for(j=0;j<c2;j++)              //taking elements im matrix2
      {
       System.out.print("m2["+i+"]["+j+"]=");
       m2[i][j]=sc.nextInt();
      }
    }


    int m[][]=new int[r1][c2];
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c2;j++)            //making every element=0 in our main matrix m
      {
       m[i][j]=0;
      }
    }


   for(i=0;i<r1;i++)
   {
      for(j=0;j<c2;j++)
      {
           for(k=0;k<c1;k++)             //matrix multiplication
           {
            m[i][j]=m[i][j]+ ( m1[i][k]*m2[k][j] );
           }

      }


   }


    System.out.print("multiplication matrix:\n\n");
    for(i=0;i<r1;i++)
    {
      for(j=0;j<c2;j++)
      {
       System.out.print( (m[i][j]) +"\t");
      }
    System.out.println("");
    }



}


else
{
System.out.print("invalid matrix dimention\n");
}

 }

}
