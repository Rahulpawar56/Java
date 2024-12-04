//  Write a program in C to count all distinct pairs for a specific difference
import java.util.*;
public class SpecificDiff
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter sa size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a element ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter a diff");
		int diff=xyz.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[j]-a[i])==diff)
				{
					count++;
					System.out.printf("[ %d %d ]",a[j],a[i]);
				}
			}
		}
		System.out.println();
		System.out.println("Diff of "+diff+" count is= ="+count);
	}
}