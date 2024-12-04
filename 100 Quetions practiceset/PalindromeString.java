/*
How to check if String is Palindrome?
Another easy coding question based upon String, I am sure you must have done this numerous time.
Your program should return true if String is a Palindrome, otherwise false. For example, if the input is "radar",
the output should be true, if the input is "madam" output will be true, and if the input is "Java" output should be 
false.
*/
import java.util.*;
public class PalindromeString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a string ");
		String s=xyz.nextLine();
		String s1=s;
		int mid=s.length()/2;
		int last=s.length()-1;
		
		for(int i=0;i<s.length();i++)
		{
			String t=s.charAt(i);
			s.charAt(i)=s.charAt(last);
			s.charAt(last)=t;
			last--;
		}
		System.out.println(s);
	}
}