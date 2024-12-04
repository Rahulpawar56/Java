/*
7)	Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.
There is no element next to the last element, therefore replace it with -1. 

Input- Original Array 
[45, 20, 100, 23, -5, 2, -6]
Output- The modified array:
[100, 100, 23, 2, 2, -6, -1]
*/

class Array
{
	private int a[];
	public void SetArray(int a[])
	{
		this.a=a;
	}
	
	public void getArray()
	{
		int b[]=new int [a.length];
		int Max=a[a.length-1];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.println();
		a[a.length-1]=-1;
        for(int i=a.length-2;i>=0;i--)
		{   
			int temp=a[i];
			a[i]=Max;
			
			if(temp>Max)
			{
				Max=temp;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}
public class Next_Greater_Element
{
	public static void main(String x[])
	{   int a[]=new int[]{45,20,100,23,-5,2,-6};
		Array A=new Array();
		A.SetArray(a);
		A.getArray();
	}
}