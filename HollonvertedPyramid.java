import java.util.*;
public class HollonvertedPyramid
{
	public static void main(String x[])
	{    
		for(int i=1;i<=5;i++)
		{  int a=i;
			for(int j=1;j<=5;j++)
			{
				if((j==1)||(i<=1 && j<=6-i))
				{
					System.out.printf("%d",a);
					a++;
					
				}
			    else if(j==6-i)
				{
					System.out.printf("5");
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