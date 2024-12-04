//Monkey and banana
import java.util.*;
public class MonkeyBanana
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a total number of monkey");
		int n=xyz.nextInt();
		System.out.println("Enter a number of banana etable of monkey");
		int k=xyz.nextInt();
		System.out.println("Enter a number of peanuts etable of monkey");
		int j=xyz.nextInt();
		System.out.println("Enter a total number of Bananas");
		int m=xyz.nextInt();
		System.out.println("Enter a total number of peanuts");
		int p=xyz.nextInt();
		if(m>0)
		{
			int total=m/k;
			m=m%k;
			
			int total1=p/j;
			j=p%j;
			System.out.println("Total number of monkey="+(n-(total+total1)-m-j));
			}
			else
		{
			System.out.println("INVALID INPUT");
		}
	}
}