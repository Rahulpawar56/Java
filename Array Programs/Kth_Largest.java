//Kth largest element in array:

import java.util.*;
public class Kth_Largest
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter a element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.println("Enter a Kth Largest Element:");
		int no=xyz.nextInt();
		for(int i=0;i<a.length-1;i++)
		{
		  	if(a[i]<a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		
		//logic for kth largest 
			System.out.println();
		for(int i=0;i<a.length;i++)
		{
	         int j=i;
			 int k=i;
			 if(no==1)
				  {
					 System.out.println("Kth Largest="+a[i]);
					 break;
				  }
			  while(a[j]==a[j+1])
			  {  
		           j++;
				   k++;
			  }
			 no--;
			 i=k;
		}
		
	}
}