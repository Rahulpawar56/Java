/*  Write a program in C to find a pair with the given difference
Expected Output:
The given array is:
1 15 39 75 92
The given difference is: 53
The pair are: (39, 92)
*/

import java.util.*;
public class PairGivenDfff
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a element ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("ENter a diff");
		int diff=xyz.nextInt();
		int k=0;
		int p=0;
		int l=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[j]-a[i])==diff)
				{
					l=1;
					k=i;
					p=j;
					break;
				}
			}
		}
		if(l==1)
		{
			System.out.println("["+a[k]+" "+a[p]+"]");
		}
		else
		{
			System.out.println("Not present those value");
		}
	}
}