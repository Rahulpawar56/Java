import java.util.*;
public class SortingArrayRec
{	public static int i=0;
	public static int j=1;
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of Array");
		int size=xyz.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter a element in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=xyz.nextInt();
		}
		
		int a[]=Arr(arr);
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
	public static int[] Arr(int a[])
	{
		if(i<a.length)
		{
			if(j<a.length)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					j++;
					Arr(a);
				}
				else
				{
					j++;
					Arr(a);
				}
			}
			i++;
			j=i+1;
			Arr(a);
		}
		return a;
	}
}