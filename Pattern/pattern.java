
/*
	  1  2  3  4  5  6 
	   2  3  4  5  6
	    3  4  5  6 
		 4  5  6
		  5  6
		   6
		 5  6
       4  5  6
     3  4  5  6
   2  3  4  5  6	 
 1  2  3  4  4  6
*/
public class pattern
{
	public static void main(String x[])
	{
		int flag=0;
		for(int i=1;i<=11;i++)
		{	int no=i;
			int no1=12-i;
			for(int j=1;j<=11;j++)
			{
				if(i<=6 && j>=i && j<=13-i && flag==0)
				{
					System.out.printf("%d",no);
					no++;
					flag=1;
				}
				else if(i>6 && j>=12-i && j<=i && flag==0)
				{
					System.out.printf("%d",no1);
					no1++;
					flag=1;
				}
				else
				{
					System.out.printf(" ");
					flag=0;
				}
			}
			System.out.println();
		}
	}
}