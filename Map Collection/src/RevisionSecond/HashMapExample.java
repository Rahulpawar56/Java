package RevisionSecond;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	public Student(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	private int id;
	private String name;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String gender;
}

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, ArrayList<Student>> map = new HashMap<>();
		ArrayList<Student> aList = new ArrayList<Student>();
		aList.add(new Student(1, "Ram", "Male"));
		aList.add(new Student(2, "Pravin", "Male"));
		aList.add(new Student(3, "Sakshi", "Female"));
		aList.add(new Student(4, "Kunal", "Female"));

		ArrayList<Student> aList2 = new ArrayList<Student>();
		aList2.add(new Student(1, "Ramesh", "Male"));
		aList2.add(new Student(2, "Krushna", "Male"));
		aList2.add(new Student(3, "Sonal", "Female"));
		aList2.add(new Student(4, "Priya", "Female"));
		map.put("CSE", aList);
		map.put("Ele", aList2);

		Set<Map.Entry<String, ArrayList<Student>>> entrySet=map.entrySet();
		for(Entry<String, ArrayList<Student>> i:entrySet) {
			String dept=i.getKey();
			System.out.println(dept);
			ArrayList<Student> obj=i.getValue();
			for(Student s:obj) {
				System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getGender());
			}
			System.out.println("\n");
		}
	}
}
