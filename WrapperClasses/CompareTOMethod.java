public class CompareTOMethod
{
	public static void main(String x[])
	{
		String s="Rahul";
		String s2="Rahul";
		String s3="Pawar";
		int res=s.compareTo(s2);
		if(res==0)
		{
			System.out.println("Strings are euals..."+res);
		}
		else
		{
			System.out.println("Not Equals ....."+res);
		}
		
		int res2=s2.compareTo(s3);
		if(res2==0)
		{
			System.out.println("Strings are euals..."+res2);
		}
		else
		{
			System.out.println("Not Equals ....."+res2);
		}
	}
}