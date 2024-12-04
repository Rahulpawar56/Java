/*
		*
	   * *
	  * * *
	 * * * *
	* * * * *
	 * * * *
	  * * *
	   * *
	    *
*/

import java.util.*;
public class DiamondPattern
{  public static int i=1;
   public static int j=1;
   public static int flag=0;
	public static void main(String z[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=xyz.nextInt();
		int len=(no/2)+1;
		Print(no,len);
	}
	
	public static void Column(int no ,int len)
	{
		if(j<=no)
		{   
			if(i<=len && j>len-i && j<len+i)
			 {    if(flag==0)
				  {
					System.out.printf("*");
					flag=1;
					j++;
					Column(no,len);
				  }
				else
				{
					System.out.printf(" ");
					flag=0;
					j++;
					Column(no,len);
				}
			}
			if(i>len && j>i-(len-1) && j<((len-1)*2+2)-i)
			{
				if(flag==0)
				{
					System.out.printf("*");
					flag=1;
					j++;
					Column(no,len);
				}
				else{
					System.out.printf(" ");
					flag=0;
					j++;
					Column(no,len);
				}
			}
			else{
				System.out.printf(" ");
				j++;
				Column(no,len);
			}
		}
	}
	public static void Print(int no,int len)
	{
		
		if(i<=no)
		{
			Column(no,len);
			i++;
			j=1;
			System.out.println();
			Print(no,len);
		}
	}

}