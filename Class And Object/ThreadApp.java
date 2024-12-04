class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(2*i);
			Thread.sleep(10);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(3*i);
			//	Thread.sleep(2000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
	
}
public class ThreadApp
{
	public static void main(String x[])throws InterruptedException 
	{
		A a = new A();
		a.start();
		
		B b = new B();
		//a.join();
		b.sleep(1000);
		b.start();
	}
}