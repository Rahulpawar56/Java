/*     	  A
		 ABA
		ABCBA
	   ABCDCBA
	  ABCDEDCBA
*/
public class Pattern3
{	public static int i=1;
	public static int j=1;
	public static char ch=65;
	public static void main(String x[])
	{
		Print(5,9);
	}
	
	public static void Column(int col)
	{
		if(j<=col )
		{  
			if(j>=6-i && j<5+i)
			{
				System.out.printf("%c",ch);
				if(j<5)
				{
					 ch++;
					j++;
				   Column(col);
				}
				else{
						//System.out.printf("%c",--ch);
				     	j++;
						ch--;
				     	Column(col);
				}
			
			}
			else
			{  System.out.printf(" ");
				j++;
				Column(col);
			}
		
		}
	}
	public static void Print(int row,int column)
	{
		if(i<=row)
		{
			Column(column);
			System.out.println();
			i++;
			j=1;
			ch=65;
			Print(row,column);
		}
	}
}