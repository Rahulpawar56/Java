/* Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.  
Input – 20 12 23 17 7 8 10 2 1 0
Output- 20 12 0 2 10 8 7 17 1 23
*/

import java.util.*;
public class Seperate_Even_Odd
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter a elment in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		//logics for even
		int b[]=new int[6];
		int k=0;
		for(int i=0;i<a.length;i++)
		{   if(a[i]%2==0)
			{
				
			 b[k]=a[i];
			 k++;
			}
		}
	//Logics for odd 
	for(int i=0;i<a.length;i++)
	{   if(a[i]%2!=0)
		{
			
	    	b[k++]=a[i];
		}
	}
		 
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.printf("%d\t",b[i]);
		 }
	}
}