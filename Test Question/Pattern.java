//pattern 
import java.util.*;
public class Pattern
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("ENter a number");
		int no=xyz.nextInt();
		for(int i=1;i<=no;i++)      //initialization of row
		{	char ch=65;
			for(int j=1;j<=i*2-1;j++)    //initialization of column
			{
				if(j<=i*2-1)         //main condition 
				{
					System.out.printf("%c",ch);    //print
					if(j<i)
					{
						ch++;
					}
					else{
						ch--;
					}
				}
				else
				{
					System.out.printf(" ");     //print space
				}
			}
			System.out.printf("\n");            //new line
		}
	}
}
