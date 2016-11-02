import java.lang.Thread;
class Thread1 extends Thread {
	public void run() {
		try{
			for(int i = 1;i<=10;i++)
			{
				System.out.print(i);
				this.sleep(1000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Thread2 extends Thread {
	public void run() {
		try{
			for(int i = 1;i<=10;i++)
			{
				System.out.print((char)(i+64));
				this.sleep(1000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class ThreadClass {
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}