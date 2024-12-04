//Binary to string   example : 1001000 1100101 1101100 1101100 1101111     O/P: Hello

import java.util.*;
public class BinaryToString
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter a binary number:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=abc.nextInt();
		}
		//Convert Binary to Decimal
		int i=0;
		while(i<a.length)
		{   int sum=0;
			int pl=1;
			while(a[i]!=0)
			{
				int rem=a[i]%10;
				a[i]=a[i]/10;
				sum=sum+rem*pl;
				pl=pl*2;
			}
			System.out.printf("%d\t",sum);
			a[i]=sum;
			i++;
		}
		
		//Convert decimal to Character
		
		System.out.printf("After conversion Binary to String:");
		 i=0;
		while(i<a.length)
		{
		   	char ch;
			System.out.printf("%c",a[i]);
			i++;
		}
	}
}
