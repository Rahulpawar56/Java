class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i*5);
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
class B extends Thread{
public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i*10);
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
public class AsyncThreading
{
	public static void main(String x[])
	{
		A a=new A();
		a.start();
		
		B b=new B();
		b.start();
	}
}