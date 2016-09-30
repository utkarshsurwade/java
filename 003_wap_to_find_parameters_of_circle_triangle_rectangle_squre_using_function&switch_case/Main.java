import java.util.*;
class Main
{ 
 public static void main (String args[])
 {
  char op;
  Scanner sc=new Scanner(System.in);
  do
  {
  System.out.println("**********enter option**************\n"+
                     "1 area and circumference of circle\n"+
                     "2 area and perimeter of rectangle\n"+
                     "3 area and perimeter of square\n"+
                     "4 area of right angled triangle\n"+
                     "************************************\n");   
  System.out.println("enter option");
  op=sc.next().charAt(0); 
  calci o1=new calci();
  switch(op)
  {
  case '1':o1.cir();
  System.out.println("do you want to continue?enter n to quit");
  break;
  
  case '2':o1.rec();
  System.out.println("do you want to continue?enter n to quit");
  break;
  
  case '3':o1.sq();
  System.out.println("do you want to continue?enter n to quit");
  break;
  
  case '4':o1.tri();
  System.out.println("do you want to continue?enter n to quit");
  break;
  default:System.out.println("enter valid option");
  }                              
  }
  while(op != 'n');
 }
}

