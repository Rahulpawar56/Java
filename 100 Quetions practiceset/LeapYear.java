//Checking if a given year is leap year or not
import java.util.*;
public class LeapYear
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=xyz.nextInt();
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
}