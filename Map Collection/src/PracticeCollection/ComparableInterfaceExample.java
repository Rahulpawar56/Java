package PracticeCollection;
import java.util.*;
class Employee implements Comparable {
	private int id;
	private String name;
	private int sal;

	Employee() {

	}

	Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;

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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		if(this.id>e.getId())
		{
			return 1;
		}
		if(this.id<e.getId())
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}

}
public class ComparableInterfaceExample {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		Employee e1=new Employee(1,"Ram",1000);
		Employee e2=new Employee(5,"Sham",5000);
		Employee e3=new Employee(4,"Ramesh",2000);
		Employee e4=new Employee(3,"RAhul",3000);
		Employee e5=new Employee(2,"Kunal",8000);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println("Before Sorting :\t");
		for(Object obj:al)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
		Collections.sort(al);
		System.out.println("\nAfterSorting :\t");
		for(Object obj:al)
		{	Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
	}

}
