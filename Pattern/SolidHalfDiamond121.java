import java.util.*;
public class SolidHalfDiamond121
{	
	public static void main(String x[])
	{  
		for(int i=1;i<=7;i++)
		{  
			for(int j=1;j<=7;j++)
			{
				if(i<5 && j==2*i-1)
				{
					System.out.printf("*");
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