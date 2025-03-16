package PracticeCollection;

import java.security.KeyStore.Entry;
import java.util.*;

class Student {
	private int id;
	private String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
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

}

public class StudentExampleUsingMapCollection {

	public static void main(String[] args) {
		LinkedHashMap<String, LinkedHashMap<String, ArrayList<Student>>> map = new LinkedHashMap<>();
		LinkedHashMap<String, ArrayList<Student>> FE = new LinkedHashMap<>();
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1, "Rahul"));
		al.add(new Student(2, "Ganesh"));
		al.add(new Student(3, "Pravin"));
		FE.put("CSE", al);

		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(new Student(1, "Ram"));
		al1.add(new Student(2, "Shyam"));
		al1.add(new Student(3, "Rohan"));
		FE.put("ETC", al1);

		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(new Student(1, "Rajesh"));
		al2.add(new Student(2, "Omkar"));
		al2.add(new Student(3, "Krushna"));
		FE.put("Mech", al2);

		map.put("FE", FE);

		LinkedHashMap<String, ArrayList<Student>> SE = new LinkedHashMap<>();
		ArrayList<Student> al3 = new ArrayList<>();
		al3.add(new Student(1, "Rahul"));
		al3.add(new Student(2, "Ganesh"));
		al3.add(new Student(3, "Pravin"));
		SE.put("CSE", al3);

		ArrayList<Student> al4 = new ArrayList<>();
		al4.add(new Student(1, "Ram"));
		al4.add(new Student(2, "Shyam"));
		al4.add(new Student(3, "Rohan"));
		SE.put("ETC", al4);

		ArrayList<Student> al5 = new ArrayList<>();
		al5.add(new Student(1, "Rajesh"));
		al5.add(new Student(2, "Omkar"));
		al5.add(new Student(3, "Krushna"));
		SE.put("Mech", al5);
		
		map.put("SE", SE);
		
		Set<Map.Entry <String,LinkedHashMap<String,ArrayList<Student>>>> entry=map.entrySet();
		for(Map.Entry<String,LinkedHashMap<String,ArrayList<Student>>> data:entry )
		{
			String Year=data.getKey();
			System.out.println(Year);
			System.out.println("---------------------------------------------------");
			LinkedHashMap<String,ArrayList<Student>> bInfo=data.getValue();
			Set<Map.Entry<String,ArrayList<Student>>>entryset=bInfo.entrySet();
			 for(Map.Entry<String, ArrayList<Student>> bdata:entryset)
			 {
				 String branch=bdata.getKey();
				 System.out.println("\t"+branch);
				 ArrayList<Student> sInfo=bdata.getValue();
				 for(Student s:sInfo)
				 {
					 Student s1=(Student)s;
					 System.out.println("\t"+s1.getId()+"\t"+s1.getName());
				 }
				 System.out.println("\n\n--------------------------------------------------");
			 }
		}
	}

}
