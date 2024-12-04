/* Write a program in C for addition of two Matrices of same size.
  
    1 2     5 6  =    6  8
    3 4     7 8  =    10 12
*/

import java.util.*;
public class Addition_Matrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Enter a element in First Matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		//Input second matrix
		System.out.println("Enter a element in second Matrix:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=xyz.nextInt();
			}
		}
		
		//print first Matrix
		System.out.println("First Matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
		
		//print second matrix
		System.out.println("Second Matrix:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.printf("%d\t",b[i][j]);
			}
			System.out.println();
		}
		
		//Addition of the Matrix
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Addition of the matrix");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.println();
		}
	}
}