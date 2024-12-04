/*
		1 2 3 4 5 
		1 2 3 4 1 
		1 2 3 1 2 
		1 2 1 2 3 
		1 1 2 3 4 
		1 2 3 4 5 
*/
public class PatternSpinner2
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{ int no=1;
			for(int j=1;j<=5;j++)
			{
				if(j<=6-i)
				{
					System.out.printf(" %d ",j);
				}
				else
				{
					System.out.printf(" %d ",no++);
				} 
			} 
			System.out.println();
		}
	}
}