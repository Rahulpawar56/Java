//Multiplication of the matrix/

import java.util.*;
public class Multiplication_Matrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		System.out.println("Enter a first Matrix element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		
		System.out.println("Enter a Second Matrix element:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=xyz.nextInt();
			}
		}
		
		//Multiplication Logics 
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int sum=0;
				for(int k=0;k<c.length;k++)    // here k is work in a matrix by the column and in b matrix by a row.
				{
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
		}
		
		//print Multiplication Matrix
		System.out.println("After Multiplication :");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",c[i][j]);
			}
			System.out.println();
		}
	}
}