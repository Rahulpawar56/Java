/*
0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
This series is a mixture of 2 series all the odd terms in this series form even numbers in ascending
 order and every even terms is derived from the previous  term using the formula (x/2)
Write a program to find the nth term in this series.
The value n in a positive integer that should be read from STDIN the nth term that is calculated by the
 program should be written to STDOUT. Other than the value of the nth term no other characters /strings 
 or message should be written to STDOUT.
For example if n=10,the 10 th term in the series is to be derived from the 9th term in the series.
 The 9th term is 8 so the 10th term is (8/2)=4. Only the value 4 should be printed to STDOUT.
You can assume that the n will not exceed 20,000.
*/
import java.util.*;
public class Series2
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a  number");
		int n=xyz.nextInt();
		int p=n;
		int sum1=0;
		int sum2=0;
		int count =0;
		for(int i=1;i<21;i++)
		{  
				if(i%2!=0)
				{
					if(n!=0)
					{
						count =sum1;
						n--;
					}
					System.out.printf("%d\t",sum1);
					sum1=sum1+2;
					
				}
				else
				{
				
					if(n!=0)
					{
						count=sum2;
						n--;
					}
					System.out.printf("%d\t",sum2);
					sum2=sum1/2;
					
				}
					
		}
		System.out.println();
		System.out.println(p+" term ="+count +"\t"+(p+1)+" term ="+count/2);
	}
}
