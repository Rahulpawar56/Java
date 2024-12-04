/*
Write program to create class name as MergeTwoArray with parameterized constructor 
 MergeTwoArray(int [],int []): this constructor accept two array as parameter 
int [] getMergeArray(): this function merge two array in third array and return new merged array 

*/
import java.util.*;
class MergeTwoArray
{
	int a[],b[];
	MergeTwoArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	int [] getMergeArray()
	{
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[k++]=b[i];
		}
		return c;
	}
}
public class MergeTwoArrayApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[6];
		System.out.println("Enter a element in first array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		System.out.println("Enter a element in Second array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		
		MergeTwoArray m=new MergeTwoArray(a,b);
		int res[]=m.getMergeArray();
		 System.out.println("Merge array");
		 for(int i=0;i<res.length;i++)
		 {
			System.out.printf("%d\t",res[i]);
		 }
	}
}