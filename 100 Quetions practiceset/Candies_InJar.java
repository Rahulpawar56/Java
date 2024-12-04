//Number of candies are solid or left 
import java.util.*;
public class Candies_InJar
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a candies on counter");
		int n=xyz.nextInt();
		System.out.println("Enter a number of Candies Outside of jar");
		int k=xyz.nextInt();
		System.out.println("Enter a numberof candies");
		int m=xyz.nextInt();
		if(m==0)
		{
			System.out.println("INVALID CANDIES");
			System.out.println("Number of candies left="+n);

		}
		else if(m<=n)
		{
			System.out.println("Number of candies sold="+(k-m));
			System.out.println("Number of candies left="+(n-m));
		}
		else{
			System.out.println("Wrong choice");
		}
		
	}
}