import java.util.*;
class Rect extends Thread
{
 public void run()
 {
 System.out.println("this is run method using Thread class");
 }
}
class Threaddd1
{
 public static void main(String args[])
 {
 Rect o=new Rect();
 o.start();
 }

}
