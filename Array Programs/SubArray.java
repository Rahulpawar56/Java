//	 Write a program in C to find a subarray with given sum from the given array?
import java.util.*;
public class SubArray
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
		System.out.println("Enter a target Value");
		int target=xyz.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			int sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==target)
				{  
					System.out.printf("[ %d---%d ]--->[",i,j);
					for(int k=i;k<=j;k++)
					{
						System.out.printf(" %d ",a[k]);
					}
					System.out.printf(" ]");
					System.out.println();
				}
			}
		}
	}
}
