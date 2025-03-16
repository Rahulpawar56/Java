package RevisionSecond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
	public Employee(int id, String nameString, int sal) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.sal = sal;
	}

	private int id;
	private String nameString;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	private int sal;

	public String toString() {
		return id+"\t"+nameString+"\t"+sal;
	}
}

class sortById implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}

class sortBySal implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSal() > o2.getSal()) {
			return 1;
		} else if (o1.getSal() < o2.getSal()) {
			return -1;
		} else {
			return 0;
		}

	}

}

public class SortingEmployeeData {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		List<Employee> aList = new ArrayList<Employee>();
		aList.add(new Employee(3, "Ram", 20000));
		aList.add(new Employee(4, "Ramesh", 15000));
		aList.add(new Employee(2, "Kailash", 25000));
		aList.add(new Employee(5, "Pratik", 19000));
		aList.add(new Employee(1, "Rahul", 10000));
		while (true) {
			System.out.println("Case 1:Sort By Id");
			System.out.println("Case 2:Sort By Sal");
			System.out.println("ENter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1: {
				sortById id=new sortById();
				Collections.sort(aList,id);;
				break;
			}
			case 2: {
				sortBySal sal= new sortBySal();
				Collections.sort(aList,sal);
				break;
			}
			default:
				System.out.println("Wrong choice");
			}
			aList.forEach((val)->System.out.println(val.toString()));
			System.out.println("\n================================================\n");
		}
	}

}
