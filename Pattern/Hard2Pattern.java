public class Hard2Pattern
{
	public static void main(String x[])
	{
		int k=0;
		int n=1;
		for(int i=0;i<8;i++)
		{	k=n;
			for(int j=0;j<7;j++)
			{
				if((i<4 && j<=i)||(i>3 && j<=7-i))
				{
					System.out.printf(" %d",(k+j));
					if(i<3)
					{
						n++;
					}
					else
					{
						n--;
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