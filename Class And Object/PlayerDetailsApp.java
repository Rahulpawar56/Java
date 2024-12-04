//Array of object 
/* WAP to create POJO class name Player with fields id,name,run . 
	1)delete a record of student using name
	2)Arrange a data in Ascending order by id
*/
import java.util.*;
class Player
{
	private int id;
	private String name;
	private int run;
	
	Player(int id,String name,int run)
	{
		this.id=id;
		this.name=name;
		this.run=run;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getRun()
	{
		return run;
	}
}
class PlayerDetails
{
	private Player p[];
	public void addNewPlayer(Player ...p)
	{
		this.p=p;
	}
	
	public void Ascending()
	{
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].getId()> p[j].getId())
				{
					Player temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
	}
	
	public void delete(String dname)
	{
		for(int i=0;i<p.length-1;i++)
		{
			if(p[i].getName().equals(dname))
			{
				p[i]=p[i+1];     
				p[i+1]=null;
			}
		}
		for(int i=0;i<p.length;i++)
		{
			if(p[i]!=null)
			{				
				System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRun());
			}
		}
	}
}
public class PlayerDetailsApp
{
	public static void main(String x[])
	{ 
		Player p[]=new Player[5];
		for(int i=0;i<p.length;i++)
		{	Scanner xyz=new Scanner(System.in);
			System.out.println("Enter a name id and run");
			String name=xyz.nextLine();
			int id=xyz.nextInt();
			int run=xyz.nextInt();
			p[i]=new Player(id,name,run);
		}
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a deleted name");
		String name=xyz.nextLine();
		PlayerDetails pd=new PlayerDetails();
		pd.addNewPlayer(p);
		pd.Ascending();
		pd.delete(name);
	}
}
