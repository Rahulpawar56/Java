//How to check if a String is a valid shuffle of two String?
import java.util.*;
public class ShuffleString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a string 1");
		String s=xyz.nextLine();
		
		System.out.println("Enter a second String ");
		String s1=xyz.nextLine();
		
		String c=s+s1;
		char ch[]=c.toCharArray();
		Random rand=new Random();
		for(int i=0;i<ch.length;i++)
		{
			int j=rand.nextInt(ch.length);
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.printf("%c",ch[i]);
		}
	}
}
		
		

