class Table
{
	synchronized void showTable(int no)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.printf("\n%d X %d =%d",i,no,i*no);
				if(i==5)
				{
					wait(10000);
					
				}
				Thread.sleep(2000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
class A {
	Table table;
	public void setTable(Table t)
	{
		table = t;
	}
	public void run()
	{
		table.showTable(2);
	}
}
class B {
	Table table;
	public void setTable(Table t)
	{
		table = t;
	}
	public void run()
	{
		table.showTable(3);
	}
}
public class SynchronizationApp
{
	public static void main(String x[])
	{
		Table t1=new Table();
		A a=new A();
		a.setTable(t1);
		a.start();
		
		B b=new B();
		b.setTable(t1);
		b.start();
	}
}
	