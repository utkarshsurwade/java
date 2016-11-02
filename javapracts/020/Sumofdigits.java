class Sumofdigits
{
 public static void main(String args[])
 { 
 int n=Integer.parseInt(args[0]); 
 System.out.print("sum of digits of "+n+" =");
 int sum=0,r;
 while(n%10!=0)
 {
 r=n%10;
 sum=sum+r;
 n=n/10;
 }
System.out.println(sum);
 }

}
