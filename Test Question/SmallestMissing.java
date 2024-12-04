//Smallest Missing
import java.util.*;
public class SmallestMissing
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);      //scanner class
		int a[]=new int[]{0,1,1,4,5,6,7,9};    // initialize array
		int j=0;
		for(int i=0;i<a.length;i++)            //Initialization ,condition ,incre/decre
		{
			if(j<a[i])                        
			{
				System.out.printf("Missing element ="+j);    //Print
				break;
			}
				j++;
		}
	}
}