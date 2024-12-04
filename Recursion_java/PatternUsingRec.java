
import java.util.*;
public class PatternUsingRec
{	public static int i=1;
	public static int j=1;
	public static void main(String x[])
	{	Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a value of i and j");
		int z=xyz.nextInt();
		int y=xyz.nextInt();
		Show(z,y);
	}
	public static void Show(int z,int y)
	{
		if(i<=z)
		{ 
			if(j<=y)
			{
				if(j<=i)
				{
					System.out.printf("%d",j++);
					Show(z,y);	
				}
				else{
					j++;
					Show(z,y);
				}
			}
			
			else
			{   System.out.println();
				i++;
				j=1;
			   Show(z,y);
			}
		}
	}
}