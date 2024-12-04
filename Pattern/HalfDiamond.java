/* 
    1
	2*3
	4*5*6
	7*8*9*10
	7*8*9*10
	4*5*6
	2*3
	1
	
*/
import java.util.*;
public class HalfDiamond
{	
	public static void main(String x[])
	{     
		int a=1; 
		int flag=1,f=0,k=6;
		for(int i=1;i<=8;i++)
		{  
             
	     
			for(int j=1;j<=7;j++)
			{ 
				if(i<5)
				{
					  if(j<i*2)
			             if(j%2!=0)
						 {
							  System.out.print(a++);
							   if(i==4&&flag==1)
							   { 
								    f=a;
									 f--;
									flag=0;
							   }
							 
						 }
						    else
								 System.out.print("*");
					
				}else  if(i>=4)
				{
					
					
					 if(j<=((9-i)*2)-1	)
						 if(j%2!=0)
						 {
							 System.out.print(f++);
						 }
						   else
			      System.out.print("*");
					
				}
		
				
				else
				{
					System.out.printf(" ");
				}
			}
			 if(i>=5)
			 {
				 f=(f-1)-k;
		        k-=2;
			 }
			System.out.printf("\n");
		
		}
	}
}

