//CRED Program 
import java.util.*;
public class CRED_Score
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a score");
		int nscore=xyz.nextInt();
		int oscore=750;
	
		if(nscore>oscore)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}