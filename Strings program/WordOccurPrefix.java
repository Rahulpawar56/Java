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
		
		String[] strArray=str.split("\\s+");
		boolean flag=false;
		for(String a:strArray)
		{
			if(a.startsWith(pre))
			{
				System.out.println("Present Prefix ");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Not Present");
		}
	}
}