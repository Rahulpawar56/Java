package RevisionSecond;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Emp {
	public Emp(int id, String name, String gender) {
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

	public String toString() {
		return id + "\t" + name + "\t" + gender;
	}
}

public class MapDataFetchIteratorExample {

	public static void main(String[] args) {
		HashMap<String, ArrayList<Emp>> map = new HashMap<String, ArrayList<Emp>>();
		ArrayList<Emp> aList = new ArrayList<Emp>();
		aList.add(new Emp(1, "Ram", "Male"));
		aList.add(new Emp(2, "Sakshi", "Female"));
		aList.add(new Emp(3, "Krushna", "Male"));

		ArrayList<Emp> aList2 = new ArrayList<Emp>();
		aList2.add(new Emp(1, "Ramesh", "Male"));
		aList2.add(new Emp(2, "Komal", "Female"));
		aList2.add(new Emp(3, "Karan", "Male"));

		map.put("CSE", aList);
		map.put("Ele", aList2);

		Iterator<Map.Entry<String, ArrayList<Emp>>> iterator=map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, ArrayList<Emp>> entry=iterator.next();
			System.out.println(entry.getKey());
			ArrayList<Emp> list=entry.getValue();
			list.forEach((val)->System.out.println(val.toString()));
			System.out.println();
		}
	}
}
