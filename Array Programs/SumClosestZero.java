//Write a program in C to find two elements whose sum is closest to zero
import java.util.*;
public class SumClosestZero
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int sum=a[0]+a[1];
		int k=0;
		int p=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int Sum1=a[i]+a[j];
				if(Math.abs(Sum1)<Math.abs(sum))
				{
					sum=Sum1;
					k=i;
					p=j;
				}
			}
		}
			System.out.println("Sum closest to Zero ="+" k="+a[k] +" "+" p="+a[p]);
	}
}