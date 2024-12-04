// Write a program in C to find the maximum for each and every contigious subarray of size k from a given array.
import java.util.*;
public class MaxSubArray
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
		int b[]=new int[4];
		int p=4;
		for(int i=0;i<=a.length-4;i++)
		{   int max=a[i];
			int k=0;
			for(int j=i;j<p;j++)
			{    b[k++]=a[j];
			}
			System.out.printf("[");
			for(int l=0;l<b.length;l++)
			{
				System.out.printf(" %d",b[l]);
				if(b[l]>max)
				{
					max=b[l];
				}
			}
			System.out.printf("]");
			System.out.printf(" Max--->%d",max);
			p++;
			System.out.println();
		}
	}
}