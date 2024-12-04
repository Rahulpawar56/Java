/*
Write  Program to perform method overriding you have to create class name as ArrParent with method 
 void setValue(int arr[]): this method can accept array as parameter 
 void arrangeSeq(): this method can display array as per user input sequence 
You have to create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent class in it 
and override arrangeSeq() method in ArrangeAscendingOrder and sort array and display in ascending order and you have
 to create one more class name ReverseArray and override arrangeSeq() method from ArrParent and reverse array and display it. 
*/
import java.util.*;
class ArrParent
{
	int a[];
	void setValue(int a[])
	{
		this.a=a;
	}
	void arrangeSeq()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}
class ArrangeAscendingOrder extends ArrParent
{
	void arrangeSeq()
	{
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println();
	 System.out.println("Ascending Array:");
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("%d\t",b[i]);
		}
	}
}
class ReverseArray extends ArrParent
{
	void arrangeSeq()
	{
	int last=a.length-1;
	int mid=a.length/2;
	for(int i=0;i<=mid;i++)
	{
		int temp=a[i];
		a[i]=a[last];
		a[last]=temp;
		last--;
	}
	System.out.println();
	System.out.println("Reverse Array:");
	for(int i=0;i<a.length;i++)
	{
		System.out.printf("%d\t",a[i]);
	}
	}
}
public class ArrParentApp
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
		ArrangeAscendingOrder A=new ArrangeAscendingOrder();
		A.setValue(a);
		A.arrangeSeq();
		
		ReverseArray R=new ReverseArray();
		R.setValue(a);
		R.arrangeSeq();
	}
}