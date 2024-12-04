/*
Consider the below series:
1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17…..
This series is a mixture of 2 series fail the odd terms in this series form a Fibonacci series and all
 the even terms are the prime numbers in ascending order
Write a program to find the Nth term in this series
The value N in a positive integer that should be read from mm. The Nth term that is calculated by the 
program should be written to STDOUT Otherthan the value of Nth term , no other characters / string or 
message should be written to STDOUT.
For example, when N:14, the 14th term in the series is 17 So only the value 17 should be printed to STDOUT

*/
import java.util.*;
public class Series3
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter  a number");
		int no=xyz.nextInt();
		
		int f=0;
		int s=1;
		int sum=1;
		int j=2;
		for(int i=1;i<=15;i++)
		{
			if(i%2!=0)
			{
				System.out.printf("%d\t",sum);
				sum=f+s;
				f=s;
				s=sum;
				
			}
			else
			{
				
				
			while(j<100)
			{  int count=0;
				int k=1;
				while(k<=j)
				{
					if(j%k==0)
					{
						count++;
					}
					k++;
				}
				if(count==2)
				{
					
					System.out.printf("%d\t",j);
						j++;
					   break;	
				}
				j++;
			}
			
		}
	}
}
}