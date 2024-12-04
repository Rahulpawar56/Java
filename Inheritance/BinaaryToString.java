//binary to string 
import java.util.*;
public class BinaaryToString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of string");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a binary numer in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int k=0;
		
		while(k<a.length)
		{
			int sum=0;
			int pl=1;
			while(a[k]!=0)
			{
				int rem=a[k]%10;
				a[k]=a[k]/10;
				sum=sum+rem*pl;
				pl=pl*2;
			}
			a[k]=sum;
			k++;
		}
		
		//print string
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%c\t",a[i]);
		}
	}
}