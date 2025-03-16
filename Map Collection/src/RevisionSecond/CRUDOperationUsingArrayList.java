package RevisionSecond;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CRUDOperationUsingArrayList {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		while (true) {
			Scanner xyz = new Scanner(System.in);
			System.out.println("Case 1:Add Number");
			System.out.println("Case 2:Update Number");
			System.out.println("Case 3:Remove Number");
			System.out.println("Case 4:View All Number");
			System.out.println("Case 5:Exit");
			System.out.println("Enter a your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter  a number");
				int no = xyz.nextInt();
				boolean val = al.add(no);
				if (val)
					System.out.println("Data added succesfuly");
				else
					System.out.println("Not added data");
				break;
			}
			case 2: {
				System.out.println("Enter a index where you want to update");
				int index = xyz.nextInt();
				System.out.println("Enter a number");
				int no = xyz.nextInt();
				int val = al.set(index, no);
				if (val > 0)
					System.out.println("Data Update");
				else
					System.out.println("Not Update data");
				break;
			}
			case 3: {
				System.out.println("Enter you want to delete number");
				int no = xyz.nextInt();
				int b = al.remove(no);
				if (b > 0)
					System.out.println("Data delete succesfuly");
				else
					System.out.println("Data not deleted");
				break;
			}
			case 4: {
				System.out.println("All Data :\n");
				al.forEach(System.out::println);
				break;
			}
			case 5: {
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Wrong choice");
			}
			}
			System.out.println("===============================================\n");
		}
	}
}
