// Write a program in C for multiplication of two square Matrices
import java.util.*;
public class MultiplicationMatrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of matrix");
		int no=xyz.nextInt();
		int a[][]=new int[no][no];
		int b[][]=new int[no][no];
		System.out.println("Enter a element in array 1");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		
		System.out.println("Enter a element in array 2");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=xyz.nextInt();
			}
		}
		
		int c[][]=new int[no][no];
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{	int mul=0;
				for(int k=0;k<a[i].length;k++)
				{
					mul=a[i][k]*b[k][j]+mul;
				}
				c[i][j]=mul;	
			}
		}
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