/*
Write a C program to input week number(1-7) and print day of week name using switch case.
 C program to find week day name using switch case. How to find day name of week using switch case in C programming.
*/
import java.util.*;
public class Week
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("case 1:");
		System.out.println("case 2: ");
		System.out.println("case 3: ");
		System.out.println("case 4: ");
		System.out.println("case 5: ");
		System.out.println("case 6: ");
		System.out.println("case 7: ");
		System.out.println("Enter a choice");
		int ch=xyz.nextInt();
		switch(ch)
		{
			case 1:
			{
				System.out.println("Monday");
				break;
			}
			case 2:
			{
				System.out.println("tuesday");
				break;
			}
			case 3:
			{
				System.out.println("Wednesday");
				break;
			}
			case 4:
			{
				System.out.println("thursday");
				break;
			}
			case 5:
			{
				System.out.println("Friday");
				break;
			}
			case 6:
			{
				System.out.println("Satureday");
				break;
			}
			case 7:
			{
				System.out.println("Sunday");
				break;
			}
			default:
			{
				System.out.println("Wrong choice");
			}
		}
	
	}
}