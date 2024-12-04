/* Write a program in C to find the smallest missing element from a sorted array?
Expected Output :
The given array is : 0 1 3 4 5 6 7 9
The missing smallest element is: 2
*/
import java.util.*;
public class SmallestMissingNumber
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a sze ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int i=0;
		int n=1;
		while(i<a.length)
		{
			if(n<a[i])
			{
				System.out.println("Missing number="+n);
				break;
			}
			n++;
			i++;
		}
	}
}