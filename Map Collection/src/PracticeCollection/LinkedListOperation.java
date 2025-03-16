package PracticeCollection;

import java.util.*;

public class LinkedListOperation {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		LinkedList li=new LinkedList();
		
		while (true) {
			System.out.println("Case 1:Add data");
			System.out.println("Case 2:Remove data");
			System.out.println("Case 3:Search Data");
			System.out.println("Case 4:Print data");
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter a data");
				int val=xyz.nextInt();
				 li.add(val);
				break;
			}
			case 2: {
				System.out.println("Enter a index ");
				int val=xyz.nextInt();
				 li.remove(val);
				break;
			}
			case 3: {
				System.out.println("Enter a search data");
				int val=xyz.nextInt();
				 boolean b=li.contains(val);
				 if(b)
				 {
					 System.out.println("Value found");
				 }
				 else
				 {
					 System.out.println("Not found");
				 }
				break;
			}
			case 4: {
				Iterator I=li.iterator();
				while(I.hasNext())
				{
					Object obj=I.next();
					System.out.println(obj);
				}
				break;
			}
			default: {
				System.out.println("Wrong choice");
			}
			}
		}

	}

}
