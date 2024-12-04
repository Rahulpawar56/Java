//Capacity of student
import java.util.*;
public class CapacityStudent
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a new Regestration student");
		int nn=xyz.nextInt();
		System.out.println("Enter a Capacity of student");
		int kk=xyz.nextInt();
		System.out.println("Enter a already regester student");
		int mm=xyz.nextInt();
		
		if((nn+mm)<=kk)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}
}