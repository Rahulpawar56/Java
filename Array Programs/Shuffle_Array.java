/*
Write a Java program to shuffle a given array of integers.(to shuffle an array using
the Fisher-Yates algorithm also you can use Random class from java.util.*;  package and their methods)
Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]
*/
import java.util.*;
class Array
{  	
	int a[];
	void setArray(int a[])
	{
		this.a=a;
	}
	void displayArray()
	{   
		Random rand=new Random();
		for(int i=0;i<a.length;i++)
		{
			int j=rand.nextInt(i+1);
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}
public class Shuffle_Array
{
	public static void main(String x[])
	{
	  Scanner xyz=new Scanner(System.in);
	  System.out.println("Enter a size of array");
	  int size=xyz.nextInt();
	  int a[]=new int[size];
	  System.out.println("Enter a element in array:");
	  for(int i=0;i<a.length;i++)
	  {
		a[i]=xyz.nextInt();
	  }
	  
	  Array A1=new Array();
	  A1.setArray(a);
	  A1.displayArray();
	}
}