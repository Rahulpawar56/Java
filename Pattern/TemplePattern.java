/*
C program to print following character pyramid: 
	ABCDEDCBA 
	ABCD DCBA 
	ABC   CBA 
	AB     BA 
	A       A
*/
public class TemplePattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{	char ch=65;
			for(int j=1;j<=9;j++)
			{
				if(j<=6-i || j>=4+i)
				{
					System.out.printf("%c",ch);
					if(j<5)
					{
						ch++;
					}
					else 
					{
						ch--;
					}
				}
				else
				{
					System.out.printf(" ");
					if(j<5)
					{
						ch++;
					}
					else{
						ch--;
					}
				}
			}
			System.out.printf("\n");
		}
	}
}