//  Write a program in C to find the maximum circular subarray sum of a given array.
import java.util.*;
public class CircularArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter  a size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int last=a.length-1;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				sum=sum+a[i];
			}
			if(a[last]>0)
			{
				sum+=a[last];
				last--;
			}
			else
			{
				break;
			}
		}
		System.out.println("Sum of Circular array ="+sum);
	}
}