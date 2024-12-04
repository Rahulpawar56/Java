//Solid Half Diamond
import java.util.*;
public class SolidHalfDiamond
{	
	public static void main(String x[])
	{  
		for(int i=3;i<=9;i++)
		{  
			for(int j=3;j<=6;j++)
			{
			   if(i<7 && j<=i)
			   {
					System.out.printf("%d",i);
			   }
			   else if(i>6 && j<=12-i)
			   {
				 System.out.printf("%d",12-i);
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