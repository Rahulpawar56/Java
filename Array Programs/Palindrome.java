//	Write a program to input number and check number is palindrome or not? 
import java.util.*;
public class Palindrome
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=xyz.nextInt();
		
		int temp=no;
		int Rev=0;
		while(temp!=0)
		{
			int rem=temp%10;
			temp=temp/10;
			Rev=Rev*10+rem;
		}
		if(Rev==no)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}