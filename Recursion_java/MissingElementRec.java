//Find Missing Element by Using Recursion
import java.util.*;
public class MissingElementRec
{	public static int i=0,j=1,c=0;

	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of Array");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter a element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		Show(a);
	}
	public static void Show(int a[])
	{
		if(i<a.length)
		{ 
				c=a[i]+1;
				Rec(a,c);
				i++;
				j++;
				Show(a);
		}
		
	}
	
	public static void Rec(int a[],int c)
	{
		if(j<a.length)
		{
			if(c!=a[j])
			{
				System.out.printf("%d\t",c);
				c++;
				Rec(a,c);
			}
		}
	}
}