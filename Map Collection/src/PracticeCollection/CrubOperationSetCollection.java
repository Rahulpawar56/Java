package PracticeCollection;

import java.util.*;

public class CrubOperationSetCollection {

	public static void main(String[] args)throws Exception {
		
		Scanner xyz=new Scanner(System.in);
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		while(true)
		{
			System.out.println("Case 1:Add Data");
			System.out.println("Case 2:Delete data");
			System.out.println("Case 3:Show all data");
			System.out.println("Enter your choice");
			int choice=xyz.nextInt();
			switch(choice)
			{
			case 1:
			{   xyz.nextLine();
				System.out.println("Enter a data");
				int data=xyz.nextInt();
				boolean b=set.add(data);
				if(b)
				{
					System.out.println("Data Added Sucesfuly...");
				}
				else
				{
					System.out.println("Not added data");
				}
				break;
			}
			case 2:
			{
				xyz.nextLine();
				System.out.println("Enter a delete data");
				int data=xyz.nextInt();
				boolean b=set.remove(data);
				if(b)
				{
					System.out.println("Data Remove Sucesfuly...");
				}
				else
				{
					System.out.println("Not Remove data");
				}
				break;
			}
			
			case 3:
			{
				Iterator i=set.iterator();
				while(i.hasNext())
				{
					Object obj=i.next();
					System.out.println(obj);
				}
				break;
			}
			default:
			{
			System.out.println("Wrong choice..");
			}
		}

	}
	}
}

