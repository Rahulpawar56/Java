/*
  Write a program in C to convert the array in such a way that double its value and replace the next number 
  with 0 if current and next element are same and rearrange the array such that all 0's shifted to the end.
Expected Output:
The given array is: 0 3 3 3 0 0 7 7 0 9
The new array is: 6 3 14 9 0 0 0 0 0 0

*/
import java.util.*;
public class SumSameNumber
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a  size of array");
		int size=xyz.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter a element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		int b[]=new int[size];
		int k=0;
		int flag=0;
		for(int i=1;i<a.length-1;i++)
		{	
			int sum=a[i];
			if(a[i]!=a[i-1] && flag==0)
			{
				sum=a[i-1];
				flag=1;
			}
			if(a[i]==a[i-1])
			{
				sum=sum+a[i-1];
				a[i]=0;
				a[i-1]=0;
			}
		
			if(sum!=0)
			{
				b[k++]=sum;
			}
		}
		for(int i=k;i<b.length;i++)
		{	
			b[i]=0;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",b[i]);
		}
	}
}