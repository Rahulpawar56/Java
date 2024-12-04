import java.util.*;
public class StringBuildertoArray
{
	public static void main(String x[])
	{
		StringBuilder sb=new StringBuilder();
		sb.append(12);
		sb.append(15);
		sb.append(20);
		sb.append(10);
		sb.append(25);
		System.out.println("Before Conversion:\n");
		System.out.println(sb);
		System.out.println("After Conversion:\n");
		String a=sb.toString();
		char b[]=a.toCharArray();
		System.out.println(b);
		
		
	}
}