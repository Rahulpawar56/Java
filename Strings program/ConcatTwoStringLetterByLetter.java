//String Buffer and String builder
// s1="abc"  s2="mno"  ==>   output="ambnco"
import java.util.*;
public class ConcatTwoStringLetterByLetter
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a first string");
		String First=xyz.nextLine();
		System.out.println("Enter a second string");
		Strig Second=xyz.nextLine();
		
		StringBuffer sb=new StringBuffer();
		int limit=0,max=0;
		String str="";
		
		if(First.length()>Second.length() )
		{
			limit=Second.length();
			max=First.length();
			str=second;
			
		}
		else
		{
			limit=First.length();
			max=Second.length();
			max=First;
		} 
		
		for(int i=0;i<limit;i++)
		{
			char f=First.charAt(i);
			sb.append(f);
			char s=Second.charAt(i);
			sb.append(s);
		}
		for(int k=i;k<max;k++)
		{
			char m=str.charAt(k);
			ab.append(m);
		} 
		System.out.println(sb);
	}
}