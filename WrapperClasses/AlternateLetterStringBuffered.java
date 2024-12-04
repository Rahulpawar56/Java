//Print Alternate letter of two string   ex: s1=abc  s2=mno    ====> ambnco  
import java.util.*;
public class AlternateLetterStringBuffered
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("ENter a frist String");
		String s1=xyz.nextLine();
		System.out.println("ENter a second string ");
		String s2=xyz.nextLine();
		StringBuffer sb=new StringBuffer();
		int max=0,i=0,limit;
		String str="";
		if(s1.length()>s2.length())
		{
			max=s1.length();
			limit=s2.length();
			str=s1;
		}
		else
		{
			max=s2.length();
			limit=s1.length();
			str=s2;
		}
		for(i=0;i<limit;i++)
		{
			char a=s1.charAt(i);
			sb.append(a);
			char b=s2.charAt(i);
			sb.append(b);
		}
		for(int k=i;k<max;k++)
		{
			char c=str.charAt(k);
			sb.append(c);
		}
		System.out.println(sb);
	}
}