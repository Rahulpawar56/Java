/*
  Write program to create class name as FindMax with two functions      
  void setArray(int a[]): this function is used for accept array as parameter    
  int getMax(): this function can find the max value from array and return it.  
*/
import java.util.*;
class FindMax
{
	int a[];
	void setArray(int a[])
	{
		this.a=a;
	}
	int getMax()
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}
public class FindMaxApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter a element in array ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		FindMax f=new FindMax();
		f.setArray(a);
		int res=f.getMax();
		System.out.println("Max ="+res);
	}
}