//Half Triangle
import java.util.*;
public class HalfTriangle
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int a=1;
			for(int j=1;j<=9;j++)
			{
			   if(j<=i*2-1)
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
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}