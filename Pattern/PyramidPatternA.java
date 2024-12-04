/*
C program to print following pyramid
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
*/
import java.util.*;
public class PyramidPatternA
{
	public static void main(String x[])
	{    
	  
		for(int i=1;i<=5;i++)
		{  
	      char a=65;
	       
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

			System.out.printf("\n");
		
		}
	}
}