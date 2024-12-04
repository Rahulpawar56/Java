import java.util.*;
public class Pyramid
{	
	public static void main(String x[])
	{     
		for(int i=1;i<=5;i++)
		{ int a=i;
	     
			for(int j=1;j<=9;j++)
			{ 
			
				if(j>=6-i && j<=4+i)
				{
					System.out.printf("%d",a);
					
					if(j<5)
					{
						a++;
					}
					else
					{
						a--;
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

