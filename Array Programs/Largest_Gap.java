/*
 Write a Java program to calculate the largest gap between sorted elements of an array of integers.  
Example:
Original array: [23 -2 45 38 12 4 6]
Largest gap between sorted elements of the said array: 15
*/

import java.util.*;
public class Largest_Gap
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("Enter a element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		int mGap=0;
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i] > mGap)
			{
				mGap=a[i+1]-a[i];
			}
		}
		
		System.out.println("Maximun Gap "+mGap);
	}
}