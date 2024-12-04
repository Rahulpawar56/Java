//Binary to Decimal
import java.util.*;            
public class BinaryToDecimal
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a Binary number");
		int no=xyz.nextInt();
		int sum=0;
		int pl=1;
		while(no!=0)
		{
			int rem=no%10;
			no=no/10;
			sum=sum+rem*pl;
			pl=pl*2;
		}
		System.out.println("Decimal Number="+sum);
	}
}