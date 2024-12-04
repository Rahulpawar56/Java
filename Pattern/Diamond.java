import java.util.*;
public class Diamond
{
	public static void main(String x[])
		{
			for(int i=1;i<=13;i++)
				{
					for(int j=1;j<=13;j++)
					{
						if(i<7 && j>=7-i && j<=5+i) 
						{
							System.out.printf("*");
						}
						
						else if (i>6 && j>=i-5 && j<=17-i)
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