//Addition of digit from string  eg=ra12hul10l15  output: 37
import java.util.*;
public class CompareString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String ");
		String s1=xyz.nextLine();
		System.out.println("Enter a String ");
		String s2=xyz.nextLine();
		
		int flag=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				continue;
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Equal");
		}
		else{
		System.out.println("Not Equal");
		}
	}
}