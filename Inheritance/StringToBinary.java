//String to binary
import java.util.*;
import java.lang.*;
public class StringToBinary
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of string ");
		int size=xyz.nextInt();
		char ch[]=new char[size];
		System.out.println("Enter a character of string");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=xyz.next().charAt(0);
		}
		int k=0;
		int a[]=new int[ch.length];
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