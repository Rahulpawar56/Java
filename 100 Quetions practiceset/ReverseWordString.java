
import java.util.*;
public class ReverseWordString
{
	public static void main(String x[])
	{
		// How to reverse words in a sentence without using a library method?   // "Rahul Pawar"  ----> " luhaR  rawaP"
		/*Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a string ");
		String s=xyz.nextLine();
		

		for(int i=0;i<s.length();i++)
		{
			int j=i;
			while(j<s.length() && s.charAt(j)!=' ')	
			{
				j++;
			}
			for(int k=j-1;k>=i;k--)
			{
				System.out.printf("%s",s.charAt(k));
			}
			if(j<s.length())
			{
				System.out.printf(" ");
			}
			i=j;
			System.out.printf(" ");
		}*/
		
		// How to reverse words in a sentence without using a library method?   // "Rahul Pawar"  ----> " Pawar Rahul"
		
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a string ");
		String s=xyz.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		{
			int j=i;
			while( j>=0 && s.charAt(j)!=' ')
			{
				j--;
			}
			for(int k=j+1;k<=i;k++)
			{
				System.out.printf("%s",s.charAt(k));
			}
			System.out.printf(" ");
			i=j;
		}	
	}
}