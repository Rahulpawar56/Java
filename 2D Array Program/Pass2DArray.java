//Pass Argument as 2D Array  with infinite argument display the  2D array and calculate its sum.

import java.util.*;
class Array
{
	int sum=0;
	void setArray(int []...x)
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				sum=sum+x[i][j];
				System.out.printf("%d\t",x[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.printf("Sum of Array is =%d",sum);
	}
	
}
public class Pass2DArray
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter a element in array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=abc.nextInt();
			}
			
		}
		
		 Array Ar=new  Array();
		 Ar.setArray(a);
	
	}
}