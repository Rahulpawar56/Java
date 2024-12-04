//  Write a program in C to find if a given integer x appears more than n/2 times in a sorted array of n integers ?
import java.util.*;
public class MoreThanHalf
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
		Arrays.sort(a);
		int len=a.length/2;
		for(int i=0;i<a.length;i++)
		{	int j=i;
			int k=i;
			int count=1;
			while(j<a.length-1)
			{
				if(a[j]==a[j+1])
				{
					count++;
					k++;
				}
				j++;
			}
			if(count>len)
			{
				System.out.println(a[k]+" Greater than n/2 "+count+" times");
				break;
			}
			i=k;
		}
	}
}