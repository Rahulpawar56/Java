import java.util.*;
class Table{
	synchronized void showTable(int no)
	{
		try{
		for(int i=1;i<=10;i++)
		{
			System.out.println(no*i);
			Thread.sleep(1000);
			if(i==5)
			{
				wait();
			}
		}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	synchronized void rejoin()
	{
		try{
			notify();
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
}
class A extends Thread{
	Table t;
	public void setNo(Table no)
	{
		t=no;
	}
	
	public void run()
	{
		t.showTable(100);
	}
}
class B extends Thread{
	Table t;
	public void setNo(Table no)
	{
		t=no;
	}
	
	public void run()
	{
		t.showTable(5);
	}
}

public class NotifyMethpdExample
{
	public static void main(String x[])
	{
		
		Table t=new Table();
		A a=new A();
		a.setNo(t);
		a.start();
		
		B b=new B();
		b.setNo(t);
		b.start();
		
		do{
			Scanner xyz=new Scanner(System.in);
			System.out.println("Do you continue thread....");
			String ch=xyz.nextLine();
			if(ch.equals("true"))
			{
				t.rejoin();
			}
		}while(true);
	}
}