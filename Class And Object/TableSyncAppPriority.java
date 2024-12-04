import java.util.*;
class Table
{
   synchronized void showTable(int no)
   {
      try{
	     for(int i=1; i<=10; i++)
		 {
		    System.out.printf("%d X %d = %d\n",i,no,i*no);
			if(i==5)
			{ wait();
			}
			Thread.sleep(1000);
		 }
	  }
	  catch(Exception ex)
	  { System.out.println("Error is "+ex);
	  }
   }
   synchronized void rejoin()
   {
	      try{
			  notifyAll();
		  }
		  catch(Exception ex)
		  { System.out.println("Error is "+ex);
		  }
   }
}
class Two extends Thread
{  Table table;
   void setTable(Table t)
   { table=t;
   }
   public void run(){
      table.showTable(2);
   }
}
class Three extends Thread
{ Table table;
   void setTable(Table t)
   { table=t;
   }
   public void run(){
      table.showTable(3);
   }
}
public class TableSyncAppPriority
{
    public static void main(String x[])
	{
	    Table t1 = new Table();
		 
		Two tw = new Two();
		Three th = new Three();
		tw.setTable(t1);
		
		th.setPriority(Thread.MAX_PRIORITY);
		tw.setPriority(Thread.MIN_PRIORITY);
		
		th.setTable(t1);
		
		tw.start();
		th.start();
		
		do{
			Scanner xyz  = new Scanner(System.in);
			String msg=xyz.nextLine();
			if(msg.equals("restart"))
			{   t1.rejoin();
			}
		}while(true);
	}
}
