/* Write a program in C to find a subarray with given sum from the given array?
Expected Output :
The given array is : 3 4 -7 1 3 3 1 -4
[0..1] -- { 3 4 }
[0..5] -- { 3 4 -7 1 3 3 }
[3..5] -- { 1 3 3 }
[4..6] -- { 3 3 1 }
*/
import java.util.*;
 public class SumOfSubArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[8];
		int sum1=0;
		System.out.println("Enter a element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int sum=7;
		for(int i=0;i<a.length;i++)
		{    
			sum1=a[i];
			for(int j=i+1;j<a.length;j++)
			{   
				sum1=sum1+a[j];
				if(sum1==sum)
				{ 
					System.out.print("["+i+"--"+j+"]--{");   
					for(int k=i;k<=j;k++)
					{
						System.out.print(a[k]+",");
					}
					System.out.print("}");
					System.out.println();
				}
			}
		}		
	}
}