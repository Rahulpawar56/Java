/*:  WAP to create class FindUnion with two methods 
void setArray(int a[],int b[]): this method can accept two array as parameter 
int [] getUnionArray(): this method can perform union operation on array and return resultant array
*/
import java.util.*;
class FindUnion
{
	private int a[],b[];
	public void setArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	public int [] getUnionArray()
	{
		int c[]=new int[a.length+b.length];
		int temp[]=new int[c.length];
		int count=0;
		
		//Merge Array
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			count++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[count]=b[i];
			count++;
		} 
		Arrays.sort(c);
		//Remove Duplicate Element 
		int k=0;
		int j=0;
		temp[k]=c[0];
		k=1;
		for(int i=1;i<c.length-1;i++)
		{
			if(c[i]!=c[j])
			{
				temp[k]=c[i];
				k++;
			}
			j++;
		}
		   
		   return temp;
	}
}
public class FindUnionApp
{
	public static void main(String x[])
	{
		FindUnion F=new FindUnion();
		int a[]=new int[]{1,2,3,4,5,6,8};
		int b[]=new int[]{3,4,6,7,8,1};
		F.setArray(a,b);
		int arr[]=F.getUnionArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.printf("%d\t",arr[i]);
			}
		}
	}
}