/* WAP to create the class name as ArrayFeqCount with a following methods  
ex : 1  2  3  2  1   4  
  1 ------->2
  2-------->2
  3-------->1
  4-------->1
  
 */
 
import java.util.*;
class Array
{
	private int a[];
	public void setArray(int...a)
	{
		this.a=a;
	}
	
	public void CountFreq()
	{
		System.out.println("After Count A frequency :");
		for(int i=0;i<a.length;i++)
		{   int count=1;
			for(int j=i+1;j<a.length;j++)
			{
			   
				if(a[i]==a[j] )
				{
					
					count++;
					a[j]=0;
				}
				
			}
			if(a[i]!=0)
			{
				System.out.println(a[i]+"----->"+count+"times");
			}
		}
	}
}

public class Array_Frequency
{
	public static void main(String x[])
	{	
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter a element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		Array A=new Array();
		A.setArray(a);
		A.CountFreq();	
	}
}