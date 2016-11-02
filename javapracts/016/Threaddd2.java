class Rect implements Runnable
{
 public void run()
 {
 System.out.println("this is run method using Runnable interface");
 }
}

class Threaddd2
{
 public static void main(String args[])
 {
  Rect o=new Rect();
  Thread t=new Thread(o);
  t.start();
 }

}
