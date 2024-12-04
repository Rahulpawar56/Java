//Enter a string from user and revere it

import java.util.*;
import java.lang.Math;
public class StringToBinary2
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		String s1;
		System.out.println("Enter a string :");
		s1=abc.nextLine();
		
        int n=s1.length();
		int arr[]=new int[n];
		
		//Convert string into integer
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)s1.charAt(i);
		}
		
		//convert integer to binary
		for(int i=0;i<arr.length;i++)
		{
			int no=arr[i];
			int count=0;
			int sum=0;
			while(no!=0)
			{
				int rem=no%2;
				no=no/2;
				int p=(int)Math.pow(10,count);
				sum=sum+rem*p;
				count++;
			}
			arr[i]=sum;
		}
		
		//Print the binary number
		for(int i=0;i<arr.length;i++)
		{
			System.out.printf("%d\t",arr[i]);
		}
	}
}