import java.util.*;

class Player
{
	int jno;
	String name;
	int run;
	int matches;
	void setJno(int jno)
	{
		this.jno=jno;
	}
	int getJno()
	{
		return jno;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setMatches(int matches)
	{
		this.matches=matches;
	}
	int getMatches()
	{
		return matches;
	}
	void setRun(int run)
	{
		this.run=run;
	}
	int getRun()
	{
		return run;
	}
}

class PlayerInfo
{
	Player p[];
	int x;
	void addNewplayer(int x,Player ...p)
	{
		this.p=p;
		this.x=x;
	}
	
	void showPlayer()
	{
	
		//ascending
		for(int i=0;i<p.length;i++)
		{	
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].getMatches() > p[j].getMatches())
				{
					Player temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
	
		for(int i=0;i<p.length;i++)
		{  
			if(i!=x)
			{
				System.out.println("Jno="+p[i].getJno()+"\t"+"name="+p[i].getName()+"\t"+"Run="+p[i].getRun()+"\t"+"Matches="+p[i].getMatches());
			}
		}
		
	
	}
}
public class PlayerApp
{
	public static void main(String x[])
	{	
		Player p[]=new Player[5];
		int jno;
		String name;
		int run;
		int matches;
			for(int i=0;i<p.length;i++)
			{
				
				p[i]=new Player();
				Scanner xyz=new Scanner(System.in);
				System.out.println("Enter a name, jno,run,matches");
				name=xyz.nextLine();
				jno=xyz.nextInt();
				run=xyz.nextInt();
				matches=xyz.nextInt();
				p[i].setName(name);
				p[i].setJno(jno);
				p[i].setRun(run);
				p[i].setMatches(matches);
			}
			Scanner xyz=new Scanner(System.in);	
			System.out.println("Enter a index for delete record");
			int index=xyz.nextInt();	
			
			PlayerInfo Info=new PlayerInfo();
			Info.addNewplayer(index,p);
			Info.showPlayer();	
	}
}