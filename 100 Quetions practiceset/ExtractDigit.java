//extract digit
import java.util.*;
public class ExtractDigit
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=xyz.nextLine();
		
		int sum=0;
		int rev=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int rem=s.charAt(i)-'0';
				rev=rev*10+rem;
			}
			else
			{
				sum=rev+sum;
				rev=0;
			}
		}
		System.out.println("Sum of total digit ="+(sum+rev));
	}
}