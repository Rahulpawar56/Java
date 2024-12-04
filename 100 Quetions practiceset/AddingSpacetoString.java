// Adding Spaces to a String
import java.util.*;
public class  AddingSpacetoString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=xyz.nextLine();
		System.out.println("Enter a count how many times spaces are added");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a number where spaces added");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int j=0;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(j<a.length && i==a[j])
			{	
				sb.append(" ");
				j++;
			}
			
				sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}
}