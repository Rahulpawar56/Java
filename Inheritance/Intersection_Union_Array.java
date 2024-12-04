/*
Write Program to create class name as ArrAbs with two methods  
 void setArray(int arr[],int []): this function is used for accept array as parameter 
 abstract int [] getResultantArray(): this function can return resultant array from different child classes. 
You have to create two classes name as  InterSection you have to override getResultantArray() method in 
Intersection and perform intersection of array which we pass in setArray() function and return it as well
 as you have to create one more class name as Union you have to override getResultantArray() and perform 
 union on two array and return resultant array  

*/
import java.util.*;
abstract class ArrAbs
{
	int a[],b[];
	void setArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	abstract int [] getResultantArray();
}
class Intersection extends ArrAbs
{
	int [] getResultantArray()
	{
		int c[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[k++]=a[i];
				}
			}
		}
		return c;
	}
}
class Union extends ArrAbs
{
	int [] getResultantArray()
	{
	 int c[]=new int[a.length+b.length];
	  int k= 0;
		for(int i=0;i<a.length;i++)
		{
			c[k++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[k++]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]=0;
				}
			}
		}
		return c;
	}
}
public class Intersection_Union_Array
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of first array and second array");
		int size1=xyz.nextInt();
		int size2=xyz.nextInt();
		
		int a[]=new int[size1];
		int b[]=new int[size2];
		System.out.println("Enter a element in first array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter a element in second array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		
		Intersection s1=new Intersection();
		s1.setArray(a,b);
		int res[]=s1.getResultantArray();
		System.out.println("Intersection of array");
		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=0)
			{
			 System.out.printf("%d\t",res[i]);
			}
			
		}
		
		Union U=new Union();
		U.setArray(a,b);
		int result[]=U.getResultantArray();
		System.out.println();
		System.out.println("Union of the Array");
		for(int i=0;i<result.length;i++)
		{
			if(result[i]!=0)
			{
			 System.out.printf("%d\t",result[i]);
			}
		}
	}
}