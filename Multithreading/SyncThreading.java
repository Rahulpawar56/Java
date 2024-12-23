//Synchronus 
import java.util.*;
class A extends Thread{
	 synchronized void run(){
				try{
					for(int i=1;i<=10;i++)
					{
						System.out.println(i*5);
						Thread.sleep(1000);
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
		try{
			for(int i=1;i<=10;i++)
			{
				System.out.println(10*i);
				Thread.sleep(1000);
			}
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
	}
}
public class SyncThreading
{
	public static void main(String x[]) throws Exception
	{
		Scanner xyz=new Scanner(System.in);
		
		A a=new A();
		a.start();
		//a.join();
		B b=new B();
		b.start();
	}
}