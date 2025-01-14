/*
Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …
This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all 
the even terms form yet another geometric series. Write a program to find the Nth term in the series.
The value N in a positive integer that should be read from STDIN. The Nth term that is calculated by the 
program should be written to STDOUT. Other than value of n th term,no other character / string or message
 should be written to STDOUT. 
 For example , if N=16, the 16th term in the series is 2187, so only 
 value 2187 should be printed to STDOUT.
You can assume that N will not exceed 30.

*/
import java.util.*;
public class NumberSeries
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a number of find value");
		int n=xyz.nextInt();
		int p=n;
		int sum1=1;
		int sum2=1;
		int count=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				if(n!=0)
				{
					count=sum1;
					n--;
				}
				System.out.printf("%d\t",sum1);
				sum1=sum1*2;
			}
			else
			{
				if(n!=0)
				{
					count=sum2;
					n--;
				}
				System.out.printf("%d\t",sum2);
				sum2=sum2*3;
			}
		}
		System.out.println();
		System.out.println(p+" terms ="+count);
	}
}