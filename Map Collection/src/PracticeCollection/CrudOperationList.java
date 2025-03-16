package PracticeCollection;
import java.util.*;
public class CrudOperationList {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		List l = new ArrayList();
		while (true) {
			System.out.println("Case 1:Add data on List");
			System.out.println("Case 2:delete data from list");
			System.out.println("Case 3:Search Data from list");
			System.out.println("Case 4:Print data ");
			System.out.println("Case 5: Reverse Array list");
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter a  val");
				int val = xyz.nextInt();
				l.add(val);
				break;
			}
			case 2: {
				System.out.println("Enter a value");
				int val = xyz.nextInt();
				l.remove(val);
				break;
			}
			case 3: {
				System.out.println("Enter a searched Value");
				int val = xyz.nextInt();
				boolean b = l.contains(val);
				if (b) {
					System.out.println("Value found");
				} else {
					System.out.println("Value not found");
				}
				break;
			}
			case 4: {
				//Using Enhance For loop
			/*	for (Object obj : l) {
					System.out.println(obj);
				}
				*/
				//List Iterator
			/*	Iterator i=l.listIterator();
				while(i.hasNext())
				{
					Object obj=i.next();
					System.out.println(obj);
				}
				*/
				
				//Using Iterator 
			/*	Iterator i=l.iterator();
				while(i.hasNext())
				{
					Object obj=i.next();
					System.out.println(obj);
				}
				*/
				
				//Enumaration
				
				Enumeration e=Collections.enumeration(l);
				while(e.hasMoreElements())
				{
					Object obj=e.nextElement();
					System.out.println(obj);
				}
				//Reverse Print
				ListIterator li=l.listIterator(l.size());
				System.out.println("\nReverse Print");
				while(li.hasPrevious())
				{
					Object obj=li.previous();
					System.out.println(obj);
				}
				break;
			}
			case 5: {
				System.out.println("\nReverse List :");
				List a = l.reversed();
				System.out.println(a);
				break;
			}
			default: {
				System.out.println("Wrong choice");
			}
			}
		}
	}

}
