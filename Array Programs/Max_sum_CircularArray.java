/*Write a program in C to find the maximum circular subarray sum of a given array.
Expected Output :
The given array is : 10 8 -20 5 -3 -5 10 -13 11
The maximum circular sum in the above array is: 29
*/

import java.util.*;
public class Max_sum_CircularArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[9];
		System.out.println("Enter a element in Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{	int sum=a[i];
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[j];
				if(max<sum)
				{
					max=sum;
				}
			}
		}
		
	    System.out.printf("Max Sum=%d",max);
	}
}