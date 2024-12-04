/* Write a program in C to check whether a given matrix is an identity matrix.
1 0 0
0 1 0
0 0 1

*/

import java.util.*;
public class Identity_Matrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter a element in array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		
		//Print given matrix
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
		
		//Check given matrix identity or not
		int Identity=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j==i && a[i][j]!=1) 
				{
					Identity =0;
					break;			
				}
				if(j!=i && a[i][j]!=0)
				{
					Identity=0;
					break;
				}
			}
		}
		 if(Identity==1)
		 {
			 System.out.println("This is Identity Matrix");
		 }
		 else
		 {
			  System.out.println("This is Not Identity Matrix");
		 }
	}
}