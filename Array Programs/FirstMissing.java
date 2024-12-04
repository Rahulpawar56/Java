//first Missing 

import java.util.*;
public class FirstMissing
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter a element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		int f=1;
		int i=0;               
		while(i<a.length)      
		{
			if(f<a[i])
			{
				System.out.println("First Missing element="+f);
				break;
			}
			f++;
			i++;
		}
	}
}