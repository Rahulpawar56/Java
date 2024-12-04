//  Write a program in C to find the maximum repeating number in a given array.
import java.util.*;
public class MaxRepeate
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
		int count1=0;
		int k=0;
		for(int i=0;i<a.length;i++)
		{	int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			if(count >count1 && a[i]!=0)
			{
				count1=count;
				k=i;
			}
		}
		System.out.println("Max repeating number ="+a[k]+" count ="+count1);
	}
}