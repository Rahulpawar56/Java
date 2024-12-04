/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000

*/
import java.util.*;
class Median
{
	private int num1[];
	private int num2[];
	public void setArray(int num1[],int num2[])
	{
		this.num1=num1;
		this.num2=num2;
	}
	public float getArray()
	{
		int a[]=new int[num1.length+num2.length];
		int k=0;	
		//Mergerd Two array
		for(int i=0;i<num1.length;i++)
		{
			a[i]=num1[i];
			k++;
		}
		for(int i=0;i<num2.length;i++)
		{
			a[k]=num2[i];
			k++;
		}
		Arrays.sort(a);
		//median of array
		int n=a.length;
		if(n%2==1)
		{
			return a[n/2];
		}
		else
		{
			return (a[(n/2)-1]+ a[n/2] ) /2.0f;
		}
		
	
	}
	

}
public class Median_of_two_Array
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter a size of first array");
		int size1=xyz.nextInt();
		int num1[]=new int[size1];
		System.out.println("Enter a size of Second array");
		int size2=xyz.nextInt();
		int num2[]=new int[size2];
		System.out.println("Enter a element in first array");
		for(int i=0;i<num1.length;i++)
		{
			num1[i]=xyz.nextInt();
		}
		
		System.out.println("Enter a element in Second array");
		for(int i=0;i<num2.length;i++)
		{
			num2[i]=xyz.nextInt();
		}
		
		Median M=new Median();
		M.setArray(num1,num2);
		float res=M.getArray();
         
		 System.out.println("Median="+res);
		
	}
}