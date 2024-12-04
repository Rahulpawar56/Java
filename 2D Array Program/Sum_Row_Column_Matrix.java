// Write a program in C to find sum of rows an columns of a Matrix.

import java.util.*;
public class Sum_Row_Column_Matrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter a element in matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		
		System.out.println("After sum or row and sum of the column:");
		for(int i=0;i<a.length;i++)
		{	int sum=0;
			for(int j=0;j<a[i].length;j++)
			{    
				sum=sum+a[i][j];
				System.out.printf("%d\t",a[i][j]);
			
			}
			System.out.printf("= %d",sum);
			System.out.println();
		}
	   
	   //Sum of the columns
	   	System.out.println();
	   for(int i=0;i<a.length;i++)
		{	int sum=0;
			for(int j=0;j<a[i].length;j++)
			{    
				sum=sum+a[j][i];
			
			}
			System.out.printf("%d\t",sum);
		}
	}
}