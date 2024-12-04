//Write a program in C to find out the maximum difference between any two elements such that larger element
// appears after the smaller number.
import java.util.*;
public class MaxDiff
{
	public static void main(String x[])
	{
		Scanner syz=new Scanner(System.in);
		System.out.println("Entera size");
		int size=xyz.mextInt();
		int a[]=new int[size];
		System.out.println("Enter a element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int maxdiff=a[0]+a[1];
		int p=0;
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int currentMax=a[i]+a[j];
				if(currentMax > max)
				{
					max=currentMax;
					p=i;
					k=j;
				}
			}
		}
		System.out.println(" Max Difference between two numbers "+"p="+a[p]+"\t"+"k="+a[k]+" diff ="+max);
		
	}
}