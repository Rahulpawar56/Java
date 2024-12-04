//
import java.util.*;
public class PatternTriangle
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{ 
		   int a=1;
			for(int j=1;j<=7;j++)
			{
				if(i<5 && j==i*2-1)
				{
					System.out.printf("*");
				}
				else if(i<5 && j<=i*2-1)
				{
					System.out.printf("%d",a);
					a++;
				}
				else{
				System.out.printf(" ");
				}
			}
			System.out.printf("\n);
		}
	}
}