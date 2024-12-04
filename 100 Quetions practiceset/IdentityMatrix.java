//Write a program in C to check whether a given matrix is an identity matrix. import java.util.*;
import java.util.*;
public class IdentityMatrix
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
		
		System.out.println("Given matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
		
	//check identity or not
	int k=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(j==i)
			{
				if(a[i][j]==1)
				{
					continue;
				}
				else
				{
					k=1;
					break;
				}
			}
			else{
				if(a[i][j]==0)
				{
					continue;
				}
				else{
					k=1;
					break;
				}
			}
		}
	}
		if(k==0)
		{
			System.out.println("Identity matrix");
		}
		else{
			System.out.println("Not Identity matrix");
		}
	
	}
}