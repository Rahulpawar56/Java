package PracticeCollection;

import java.util.*;

public class VectorCrudOperation {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		while (true) {
			System.out.println("Case 1:Add data in vector collection");
			System.out.println("Case 2:Remove data From Vector collection");
			System.out.println("Case 3:show specific index specific index");
			System.out.println("Case 4:Print all data from Vector");
			System.out.println("Case 5:Search Data from Vector Collection");
			System.out.println("Case 6:Check Vector is Emplty or not");
			System.out.println("Case 7:Size of vector");
		
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter a adding data from keyboard");
				int val=xyz.nextInt();
				v.add(val);
				break;
			}
			case 2: {
				System.out.println("Enter a index fro keyboard keyboard");
				int val=xyz.nextInt();
				v.remove(val);
				break;
			}
			case 3: {
				System.out.println("Enter a val from keyboard");
				int val=xyz.nextInt();
				int index=v.indexOf(val);
				System.out.println("Index :"+index);
				break;
			}
			case 4: {
				for(Integer i:v)
				{
					System.out.println(i);
				}
				break;
			}
			case 5: {
				System.out.println("Enter a Searched Data from keyboard");
				int val=xyz.nextInt();
				boolean b=v.contains(val);
				if(b)
				{
					System.out.println("Data found");
				}
				else
				{
					System.out.println("Data not present");
				}
				break;
			}
			case 6:
			{
				boolean b=v.isEmpty();
				if( b)
				{
					System.out.println("Empty ");
				}
				else
				{
					System.out.println("Not Empty");
				}
				break;
			}
			case 7:
			{
				System.out.println("Size of vector is :"+v.size());
				System.out.println("Last Element :"+v.lastElement());
			}
			default: {
				System.out.println("Wrong choice");
			}
			}
		}
	}

}
