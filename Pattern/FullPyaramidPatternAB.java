///Full Pyaramid
import java.util.*;
public class FullPyaramidPatternAB
{
	public static void main(String x[])
	{
	    	char a=65;
		for(int i=1;i<=5;i++)
		{
		     char ch=a;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.printf("%c",ch);
					
					if(j<5)
					{
						ch++;
					}
					else
					{
						ch--;
					}
					
				
				}
			
				else
				{
					System.out.printf(" ");
				}
			}
			 a++;
			System.out.printf("\n");
		}
	}
}