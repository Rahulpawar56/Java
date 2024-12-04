/*
C program to print following pyramid:
A
BAB
CBABC
DCBABCD
EDCBABCDE
*/

import java.util.*;
public class PyramidPattern
{
	public static void main(String x[])
	{    
	     char ch=65;
		for(int i=1;i<=5;i++)
		{  char a=ch;
			for(int j=1;j<=9;j++)
			{
			
			    if(j<=i*2-1)
				{
					System.out.printf("%c",a);
					if(j<i)
					{
						a++;
					}
					else{
						a--;
					}
				}
				else
				{
					System.out.printf(" ");
				}
	
			}
			ch++;
			System.out.printf("\n");
		
		}
	}
}