//check the prefix in the string   
// ex : "I love india"    prefix:lo   o/p: 1    or
//						  prefix : you   o/p:-1
import java.util.*;
public class WordOccurPrefix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=xyz.nextLine();
		System.out.println("Enter a  Word Occur Prefix");
		String pre=xyz.nextLine();
		
		String strArray[]=str.split("\\s+");
		boolean flag=true ,flag2=false;
		for(int i=0;i<strArray.length;i++)
		{	String s1=strArray[i];
			flag=true;
			if(s1.length()>=pre.length())
			{
				for(int j=0;j<pre.length();j++)
				{ 
					if(pre.charAt(j)!=s1.charAt(j))
					{
					   flag= false;
					   break;
					}
				}
			}	if(flag)
				{
					System.out.println("Present ");
					flag2=true;
					break;
				}
				else
				{
					flag=true;
				}			
			}
			
		if(!flag2)
		{
			System.out.println("Not present....");
		}
	}
}