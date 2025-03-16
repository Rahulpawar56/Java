import java.util.*;

class Voter {
	private int id;
	private String name;
	private int age;

	public Voter() {

	}

	public Voter(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class VoterExampleUsingHashMap {

	public static void main(String[] args) {
		ArrayList<Voter> al=new ArrayList<Voter>();
		Voter v1=new Voter(1,"Rahul",18);
		Voter v2=new Voter(2,"ROhan",22);
		Voter v3=new Voter(3,"Ram",20);
		al.add(v1);
		al.add(v2);
		al.add(v3);
		
		ArrayList<Voter> al1=new ArrayList<Voter>();
		Voter v4=new Voter(1,"Pravin",18);
		Voter v5=new Voter(2,"Rani",22);
		Voter v6=new Voter(3,"Ramesh",20);
		al1.add(v1);
		al1.add(v2);
		al1.add(v3);
		
		LinkedHashMap<String,ArrayList<Voter>> map=new LinkedHashMap<String,ArrayList<Voter>>();
		map.put("Ward1", al);
		map.put("Ward2", al1);
		
		Set<Map.Entry<String, ArrayList<Voter>>> setentry=map.entrySet();
		for(Map.Entry<String, ArrayList<Voter>> a:setentry)
		{
			String ward=a.getKey();
			System.out.println(ward);
			System.out.println("======================================================");
			ArrayList<Voter> VoterData=a.getValue();
			for(Voter v :VoterData)
			{
				System.out.println(v.getId()+"\t"+v.getName()+"\t"+v.getAge());
			}
			System.out.println("------------------------------------------------------");
		}
		
	}

}
