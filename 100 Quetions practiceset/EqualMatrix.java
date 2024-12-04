//Write a program check matrix equal are not
import java.util.*;
public class EqualMatrix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of matrix");
		int size=xyz.nextInt();
		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		System.out.println("Enter a element in matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		
		System.out.println("Enter a element in matrix 2");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=xyz.nextInt();
			}
		}
		
		
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==b[i][j])
				{
					continue;
				}
				else
				{
					t=1;
					break;
				}
			}
		}
		if(t==0)
		{
			System.out.println("Matrix equal");
		}
		else{
			System.out.println("Not equal Matrix");
		}
			
	}
}