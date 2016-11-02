import java.util.Scanner;

class multable
{
 public static void main(String args[])
 {
 System.out.print("print multiplication table up to ?");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();

for(int i=1;i<=n;i++)
{

 for(int j=1;j<=n;j++)
 {
  System.out.print( (i*j)+"\t");
 }

  System.out.println("");

}

}
}
