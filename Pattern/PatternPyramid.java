import java.util.*;
public class PatternPyramid
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{ 
		   int a=i;
		   int b=i;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i  && j<=5)
				{
					System.out.printf("%d",a);
					
					if(j<5)
					{
						a--;
					}
					else{
						a++;
					}
					
				}
				else if(j>5 && j<=4+i)
				{
					System.out.printf("%d",b);
					 if(j>5)
					 {
						 b--;
					 }
				}
				else{
				System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}