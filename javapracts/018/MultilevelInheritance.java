import java.util.Scanner;
class Student
{
 String name;
 int roll_no;
}

class Test extends Student 
{
Double sem1,sem2;
}

class Result extends Test
{
  Double total()
  {
   Double tot=sem1+sem2;
   return tot;
  }
}

class MultilevelInheritance
{
  public static void main(String args[])
  {
   Result r=new Result();
   Scanner sc=new Scanner(System.in);
   System.out.print("enter your name:");
   r.name=sc.nextLine();
   System.out.print("enter your rollno:");
   r.roll_no=sc.nextInt();
   System.out.print("enter your sem1 marks:");
   r.sem1=sc.nextDouble();
   System.out.print("enter your sem2 marks:");
   r.sem2=sc.nextDouble();
   

   System.out.println("\n\n**********Student Information**********\n\n");
   System.out.println("Name:"+r.name+"\nRollno:"+r.roll_no+"\nTotal marks ="+r.total());
  }
}
