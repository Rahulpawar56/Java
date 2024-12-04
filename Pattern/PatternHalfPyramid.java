//
import java.util.*;
public class PatternHalfPyramid
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{ 
		   int a=1;
		   int b=1;
			for(int j=1;j<=9;j++)
			{
			
				if( j==1 )
				{
					System.out.printf("*");
				}
				else if(i<5 && j==i*2-1)
				{
					System.out.printf("*");
				}
				
				else if(i<=4 && j<2*i-1)
				{
					System.out.printf("%d",a);
					if(j<i)
					{
						a++;
					}
					else{
						a--;
					}
				}
				
				else if(i>4 && j<(8-i)*2-1)
				{
					System.out.printf("%d",b);
					if(j<3)
					{
						b++;
					}
					else{
						b--;
					}
				}
				else if(i>4 && j==(8-i)*2-1	)
				{
				
					System.out.printf("*");
				}
		        else{
					System.out.printf(" ");
				}
				
			}
			
	        System.out.printf("\n");
		}
	}
}