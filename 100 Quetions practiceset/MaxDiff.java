//Write a program in C to find out the maximum difference between any two elements such that larger element
// appears after the smaller number.
import java.util.*;
public class MaxDiff
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Entera size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int max=0;
		int p=0;
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{   if(a[j]>a[i])
				{
					int currentMax=a[j]-a[i];
					if(currentMax > max)
					{
						max=currentMax;
						p=i;
						k=j;
					}
				}
			}
		}
		System.out.println(" Max Difference between two numbers "+"p="+a[p]+"\t"+"k="+a[k]+" diff ="+max);
		
	}
}