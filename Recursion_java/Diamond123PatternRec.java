/*          1
           1 2
		  1 2 3
		 1 2 3 4
		  1 2 3
		   1 2
		    1
*/
public class Diamond123PatternRec
{	public static int i=1,j=1,a=1;
    public static int flag=0;
	public static void main(String x[])
	{
		PatternRow(7,7);
	}
	public static void PatternRow(int row,int column)  //Print Row
	{
		if(i<=row)
		{
			PatternColumn(row,column);
			System.out.println();
			i++;
			j=1;
			a=1;
			PatternRow(row,column);
		}
	}
	
	public static void PatternColumn(int row,int column)
	{
		if(j<=column)
		{
			if((i<=4 && j>=5-i && j<=3+i && flag==0)||(i>4 && j>=i-3 && j<=12-i && flag==0))
			{ 
				System.out.printf("%d",a++);
					j++;
					flag=1;
					PatternColumn(row,column);
			}
			else
			{
				System.out.printf(" ");
				j++;
				flag=0;
				PatternColumn(row,column);
			}
		}
	}
}