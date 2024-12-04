//Questions 1
import java.util.*;
public class Questions1
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a first cab ");
		int xx=xyz.nextInt();
		System.out.println("Enter a second cab");
		int xy=xyz.nextInt();
		if(xx<xy)
		{
			System.out.println("First");
		}
		else if(xx>xy)
		{
			System.out.println("Second");
		}
		else{
		System.out.println("Each");
		}
	}
}