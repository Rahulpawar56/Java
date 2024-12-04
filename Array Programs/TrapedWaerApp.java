/* Trapping Rainwater Problem states that given an array of N non-negative integers arr[] 
representing an elevation map where the width of each bar is 1, compute how much water it can trap after rain.

Trapping Rainwater Problem
Examples :
Let us understand Trapping Rainwater problem with the help of some examples :  
Input : arr[] = {3, 0, 1, 0, 4, 0, 2}
Output : 10
Explanation : The expected rainwater to be trapped is shown in the above image.
Input : arr[]   = {3, 0, 2, 0, 4}
Output : 7 
*/

import java.util.*;
class TrapWater
{ 
	int a[];
	void setArray(int a[])
	{
		this.a=a;
	}
	
	void TrapedWater()
	{
		if(a.length==0)
		{
			System.out.println("0");
		}
		int left=0;
		int right=a.length-1;
		int lmax=0;
		int rmax=0;
		int trapWater=0;
		
		while(left<=right)
		{
			if(a[left]<=a[right])
			{
				if(a[left]>=lmax)
				{
					lmax=a[left];
				}
				else
				{
					trapWater=trapWater+(lmax-a[left]);
				}
				left++;
			}
			else
			{
				if(a[right]>=rmax)
				{
					rmax=a[right];
				}
				else
				{
					trapWater=trapWater+(rmax-a[right]);
				}
				right--;
			}
		}
		System.out.println("Traped Water="+trapWater);
	}
}
public class TrapedWaerApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size if array:");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		TrapWater T=new TrapWater();
		T.setArray(a);
		T.TrapedWater();
	}
}