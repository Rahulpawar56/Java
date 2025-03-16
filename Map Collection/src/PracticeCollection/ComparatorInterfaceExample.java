package PracticeCollection;

import java.util.*;

class Player {
	private int id;
	private String name;
	private int sal;

	Player() {

	}

	Player(int id, String name, int sal) {
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

}

class SortById implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Player p1 = (Player) o1;
		Player p2 = (Player) o2;
		if (p1.getId() > p2.getId()) {
			return 1;
		}
		if (p1.getId() < p2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}

class SortBySal implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Player p1 = (Player) o1;
		Player p2 = (Player) o2;
		if (p1.getSal() > p2.getSal()) {
			return 1;
		}
		if (p1.getSal() < p2.getSal()) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class ComparatorInterfaceExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Player p1 = new Player(1, "Rahul", 10000);
		Player p2 = new Player(4, "Mayur", 100000);
		Player p3 = new Player(3, "Ram", 30000);
		Player p4 = new Player(2, "Kiran", 20000);
		Player p5 = new Player(7, "Sopan", 90000);
		Player p6 = new Player(5, "Ganesh", 80000);
		Player p7 = new Player(8, "Arjun", 60000);
		Player p8 = new Player(10, "Rohan", 50000);
		Player p9 = new Player(9, "Pravin", 40000);
		Player p10 = new Player(6, "Krushna", 78000);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);
		al.add(p7);
		al.add(p8);
		al.add(p9);
		al.add(p10);
		Scanner xyz = new Scanner(System.in);
		System.out.println("Before Sorting :\n");
		System.out.println("ID\tNAME\tSAL");
		for (Object obj : al) {
			Player pdata = (Player) obj;
			System.out.println(pdata.getId() + "\t" + pdata.getName() + "\t" + pdata.getSal());
		}
		while (true) {
			System.out.println("Case 1:Sort By id");
			System.out.println("Case 2:Sort By Sal");
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1: {
				SortById sid = new SortById();
				Collections.sort(al, sid);
				break;
			}
			case 2: {
				SortBySal sal = new SortBySal();
				Collections.sort(al, sal);
				break;
			}
			}
			System.out.println("\nAfter Sorting :\n");
			System.out.println("ID\tNAME\tSAL");
			for (Object obj : al) {
				Player pdata = (Player) obj;
				System.out.println(pdata.getId() + "\t" + pdata.getName() + "\t" + pdata.getSal());
			}

		}
	}

}
