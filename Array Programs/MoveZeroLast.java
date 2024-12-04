//  Write a program in C to move all zeroes to the end of a given array.
import java.util.*;
public class MoveZeroLast
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
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[j]=a[i];
				j++;
			}
		}
		for(int i=j;i<a.length;i++)
		{
			a[i]=0;
		}
	    System.out.println("Move last zero ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}