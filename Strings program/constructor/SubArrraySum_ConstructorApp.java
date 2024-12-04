/*
WAP to create class name as SubArrSum with constructor and one method 
SubArrSum(int a[],int sumValue): this method can accept array as parameter and one single value as sum
void findSubArr(): this method can find the sum array whose sum is equal with sum value provide by user.

Example: 1    5   2   5  4  8
User provided value : 12 
Index of sub array 1  and 3   and you sub array is  5  2  5

*/

import java.util.*;
class SubArraySum
{
	int sum,a[],t;
	SubArraySum(int a[],int t)
	{
		this.a=a;
		this.t=t;
	}
	
	void findSubArr()
	{
		for(int i=0;i<a.length-1;i++)
		{    sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{   sum=sum+a[j];
				if(sum==t)
				{
					System.out.println("["+i+"..."+j+"]");
					for(int k=i;k<=j;k++)
					{
						System.out.printf("%d ",a[k]);
					}
				}
			}
			sum=0;
		}
	}
	
}
public class SubArrraySum_ConstructorApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter a element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.println("Enter a target sum:");
		int s=xyz.nextInt();
		
		SubArraySum S=new SubArraySum(a,s);
		S.findSubArr();
	}
}