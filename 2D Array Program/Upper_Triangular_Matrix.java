/* Write a program in C to print or display the Upper triangular of a given matrix.
	1 2 3       1 0 0
	4 5 6  ==   4 5 0
	7 8 9       7 8 9
*/

import java.util.*;
public class Upper_Triangular_Matrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter a Element in matrix:");
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
				if(j<=i)
				{
					System.out.printf("%d\t",a[i][j]);
				}
				else
				{
					System.out.printf("0\t");
				}
			}
			System.out.println();
			
		}
	}
}