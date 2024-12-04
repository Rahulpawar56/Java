// String to Binary 
import java.util.*;
import java.lang.*;
public class StringToBinary1
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String ");
		String s=xyz.nextLine();
		
		char ch[]=s.toCharArray();
		int len=ch.length;
		//System.out.println("Length="+len);
		int a[]=new int[len];
		
		int k=0;
		while(k<ch.length)
		{
			int no=ch[k];
			int sum=0;
			int count=0;
			while(no!=0)
			{
				int rem=no%2;
				no=no/2;
				int p=(int)Math.pow(10,count);
				sum=sum+rem*p;
				count++;
			}
			a[k]=sum;
			k++;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		
	}
}