/* Zig-zag pattern

  *     *     * 
 * *   * *   * * 
*   * *   * *   *

*/
public class Zig_Zag_Pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=17;j++)
			{
				if(j==4-i || j==2+i || j==10-i || j==8+i || j==16-i || j==14+i)
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