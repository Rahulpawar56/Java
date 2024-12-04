//Manipulate guards
import java.util.*;
public class ManipulateGuards
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a XX guards");
		int xx=xyz.nextInt();
		
		System.out.println("Enter a yy guards");
		int yy=xyz.nextInt();
		
		if(xx>=yy)
		{
			System.out.println("YES");
		}
		else if(xx<=yy)
		{
			System.out.println("NO");
		}
		else{
			System.out.println(" ");
		}
	}
}