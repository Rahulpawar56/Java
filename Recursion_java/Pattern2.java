import java.util.*;
public class Pattern2
{
	public static int i=1;
	public static int j=1;
	public static int a=1;
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a row and column");
		int row=xyz.nextInt();
		int column=xyz.nextInt();
		show(row,column);
	}
	public static void show(int row,int column)
	{
		if(i<=row)
		{
			if(j<=column)
			{
				if(j<=i*2-1)
				{
					System.out.printf("%d",a);
					if(j<i)
					{	a++;
						j++;
						show(row,column);
					}
					else{
						a--;
						j++;
						show(row,column);
					}
					
				}
				else{
					j++;
					show(row,column);
				}
			}
				else
				{
					System.out.println();
					i++;
					j=1;
					a=1;
					show(row,column);
				}
		}
	}
}