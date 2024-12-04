import java.util.*;
public class ConcatLetter_StringBuffer
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String First");
		String s1=xyz.nextLine();
		System.out.println("Enter a Second String");
		String s2=xyz.nextLine();
		
		StringBuffer sb=new StringBuffer();
		int limit=0,max=0,i=0;
		String str="";
		if(s1.length()>s2.length())
		{
			limit=s2.length();
			max=s1.length();
			str=s1;
		}
		else
		{
			limit=s1.length();
			max=s2.length();
			str=s2;
		}
		
		for(i=0;i<limit;i++)
		{
			char f=s1.charAt(i);
			sb.append(f);
			char s=s2.charAt(i);
			sb.append(s);
		}
		for(int k=i;k<max;k++)
		{
			char m=str.charAt(k);
			sb.append(m);			
		}
		System.out.println(sb);
	}
}