//Spiral matrix 4*4
import java.util.*;
public class Spiral_Matrix
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter a m and n");
		m=abc.nextInt();
		n=abc.nextInt();
		
		int a[][]=new int[m][n];
		System.out.println("Enter a number:");
		for(int i=0;i<a.length;i++)
		{
		   for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=abc.nextInt();
			}
		}
		
		//print given matrix
		System.out.println("Given Matrix:");
		for(int i=0;i<a.length;i++)
		{
		   for(int j=0;j<a[i].length;j++)
			{
				System.out.printf(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//Logic for spiral Matrix
		int top=0,bottom=m-1;
		int left=0,right=n-1;
		
		System.out.println("Spiral Matrix:");
		while(left<=right)
		{
			for(int i=left;i<=right;i++)
			{
				System.out.printf(a[top][i]+" ");
			}
			top++;
			for(int i=top;i<=bottom;i++)
			{
				System.out.printf(a[i][right]+" ");
			}
			right--;
			for(int i=right;i>=left;i--)
			{
				System.out.printf(a[bottom][i]+" ");
			}
			bottom--;
			for(int i=bottom;i>=top;i--)
			{
				System.out.printf(a[i][left]+" ");
			}
			left++;
		}
	}
}