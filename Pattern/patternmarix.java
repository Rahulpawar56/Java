/*
	5 5 5 5 5 5 5 5 5 
	5 4 4 4 4 4 4 4 5
	5 4 3 3 3 3 3 4 5
	5 4 3 2 2 2 3 4 5
	5 4 3 2 1 2 3 4 5
	5 4 3 2 2 2 3 4 5
	5 4 3 3 3 3 3 4 5
	5 4 4 4 4 4 4 4 5
	5 5 5 5 5 5 5 5 5 
*/
public class patterSpinner
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{ int no=5;
			for(int j=1;j<=9;j++)
			{
				if((i<=5 && j<=i) ||(i<=5 && j>=10-i))
				{
					System.out.printf("%d",no);
					if(j<i)
					{
						no--;
					}
					else
					{
						no++;
					}
				}
				else{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}