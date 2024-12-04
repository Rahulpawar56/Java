import java.util.*;
public class PatternPyramid01
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{ int a=0;
		   for(int j=1;j<=13;j++)
		   {
		     if(j>i && j<14-i)
			 {
				 System.out.printf(" ");
			 }
			 else
			 {
				 System.out.printf("%d",a);
				 
				 if(j<6)
				 {
					 a++;
				 }
				 else{
					 a--;
				 }
			 }
			}
			System.out.printf("\n");
		}
	}
}