public class MajorityElementRec
{	public  static int val=0;
	public static void main(String x[])
	{
		int a[]={1,2,2,1,2,3,1};
		int b=Show(a,1,0,1);
		if(b==1)
		{
			System.out.println("Majority Element ="+val);
		}
		else
		{
			System.out.println("Not Majority Element");
		}
	}
	public static int Show(int a[],int count,int i,int j)
	{ 
		if(i<a.length)
		{
			if (j<a.length && a[i] == a[j]) 
			{
				count++;
			}
			
			if (count > a.length / 2) 
			{
				val=a[i];
				return 1;
				
			}
			
			if (j >= a.length) 
			{
				return Show(a, 1, i + 1, i+2);
			}

			return Show(a, count, i, j + 1);
		}
		return -1;
    }
}
