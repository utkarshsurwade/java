import java.util.*;
class demo
{
 public static void main (String args[])
 {
 int adm_year;
 String branch;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter admission year");
 adm_year=sc.nextInt();
 System.out.println("enter branch");
 branch=sc.next();
 switch(adm_year)
  {
  case 2014:System.out.println("issue admit card");
  break;
  case 2015:System.out.println("issue admit card");
  break;
  case 2016:switch(branch)
           {
           case "computer":System.out.println("you have to pay 10,000 rs fees");
           break;
           
           case "extc":System.out.println("you have to pay 20,000 rs fees");
           break;

           default :System.out.println("enter proper branch");
           }
 break;
 default :System.out.println("enter valid admission year");
 }

 }
};
