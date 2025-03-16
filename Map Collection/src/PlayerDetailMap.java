import java.util.*;
class Player{
	private int id;
	private String name;
	public Player() {
		
	}
	public Player(int id,String name,int run)
	{
		this.id=id;
		this.name=name;
		this.run=run;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	private  int run;
}
public class PlayerDetailMap {

	public static void main(String[] args) {
		LinkedHashMap<String,ArrayList<Player>> map=new LinkedHashMap<String,ArrayList<Player>>();
		ArrayList<Player> al=new ArrayList<Player>();
		Player p1=new Player(1,"Rahul",100);
		Player p2=new Player(2,"Pravin",150);
		Player p3=new Player(3,"Ram",200);
		
		ArrayList<Player> al1=new ArrayList<Player>();
		Player p4=new Player(1,"Rohan",150);
		Player p5=new Player(2,"Pandit",250);
		Player p6=new Player(3,"Rani",300);
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al1.add(p4);
		al1.add(p5);
		al1.add(p6);
		
		map.put("ComputerScience", al);
		map.put("Mechanical", al1);
		
		Set<Map.Entry<String, ArrayList<Player>>> entryset=map.entrySet();
		for(Map.Entry<String, ArrayList<Player>> data:entryset)
		{
			String branch=data.getKey();
			System.out.println(branch);
			System.out.println("===================================");
			ArrayList<Player> sdata=data.getValue();
			for(Player p:sdata)
			{
				System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
			}
			System.out.println("--------------------------------------------");
		}
		

	}

}
