//Compare two String 

import java.util.*;
class Compare
{
	String s1,s2;
	Compare(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	void showString()
	{
		System.out.println("First String ="+s1);
		System.out.println("Second String ="+s2);
	}
	void CompareString()
	{
		System.out.println();
		int a=1;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.length()!=s2.length())
			{
				System.out.println("Strings are not equal");
				break;
			}
			else if(s1.charAt(i)==s2.charAt(i))
			{
				continue;
			}
			else
			{
				a=0;
				break;
			}
		}
		
		if(a==1)
		{
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
	}
}
public class Compare_StringApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String one");
		String s1=xyz.nextLine();
		System.out.println("Enter a String two");
		String s2=xyz.nextLine();
		
		Compare C=new Compare(s1,s2);
		C.showString();
		C.CompareString();
		
	}
}
