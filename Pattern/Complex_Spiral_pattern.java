/*  Complex Spiral Pattern
									* * * * * * * * *
									* *           *
									*   *       *
									*     *   *
									*       * *
									*       * *
									*     *   *
									*   *       *
									* *           *
									* * * * * * * * *
*/
public class Complex_Spiral_pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((i==1 || j==1 || i==10) ||(i<7 && j==i) || (i<6 && j==10-i) ||(i>5 && j==i-1) ||(i>4 && j==11-i))
				{
					System.out.printf("*");
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}