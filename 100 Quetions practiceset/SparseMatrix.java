// Write a program in C to accept a matrix and determine whether it is a sparse matrix. 
import java.util.*;
public class SparseMatrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of matrix");
		int size=xyz.nextInt();
		int a[][]=new int[size][size];
		System.out.println("Enter a element in matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		
		int count=0;
		int count1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==0)
				{
					count++;
				}
				else
				{
					count1++;
				}
			}
		}
		if(count>count1)
		{
			System.out.println("Sparse Matrix");
		}
		else
		{
			System.out.println("Not Sparse Matrix");
		}
	}
}