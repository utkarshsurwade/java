import java.util.Scanner;
class stringmethods
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.print("enter first name:");
 String name=sc.next();
 System.out.print("enter last name:");
 String lastname=sc.next();
 String fullname;
 fullname=name.concat(lastname);//1 concat()
 System.out.println("fullname is :"+fullname);

 System.out.println( fullname.indexOf('w') ); //2 indexOf()

 System.out.println(fullname.toUpperCase() );//3 toUpperCase()

 System.out.println(fullname.length());//4 lenght()

 System.out.println(fullname.charAt(0));//5 charAt()
 }
}
