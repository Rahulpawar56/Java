//String Buffer and String builder
// s1="abc"  s2="mno"  ===>   output="ambnco"
import java.util.*;
public class ConcatTwoStringLetterByLetter_StringBuffer
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a first string");
		String first=xyz.nextLine();
		System.out.println("Enter a second string");
		String second=xyz.nextLine();
		
		StringBuffer sb=new StringBuffer();
		int limit=0,i=0,max=0;
		String str="";
		
		if(first.length()>second.length() )
		{
			limit=second.length();
			max=first.length();
			str=first;
			
		}
		else
		{
			limit=first.length();
			max=second.length();
			str=second;
		} 
		
		for(i=0;i<limit;i++)
		{
			char f=first.charAt(i);
			sb.append(f);
			char s=second.charAt(i);
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