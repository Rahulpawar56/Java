import java.util.*;
public class ExampleStringBuilder
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a String ");
		String s=xyz.nextLine();
		StringBuilder sb=new StringBuilder("Rahul");
		sb.append(" "+s);
		System.out.println(sb);
		String s1="   Rahul";
		System.out.println(s1);
		s1.trim();
		System.out.println(s1);
	}
}