//Write a program in C to print or display the Uppertriangular of a given matrix.
import java.util.*;
public class UpperTriangularMatrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of matrix");
		int size=xyz.nextInt();
		int a[][]=new int[size][size];
		int b[]=new int[size];
		System.out.println("Enter a element in matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j>i)
				{
					a[i][j]=0;
				}
			}
		}
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
	}
}