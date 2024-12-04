//reverse String words using StringBuffer  ex: abc mno pqr  ====> cba onm rqp
import java.util.*;
public class ReverseWordsStringBuffer
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("ENter a STring ");
		String s1=xyz.nextLine();
		
		String s2[]=s1.split(" ");
		StringBuffer sb=new StringBuffer();
		for(String c:s2)
		{
			String s="";
			for(int i=(c.length()-1);i>=0;i--)
			{
				s=s+c.charAt(i);
			}
				s=s+" ";
				sb.append(s);
		}
		System.out.println(sb);
	}
}