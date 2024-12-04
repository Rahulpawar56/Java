/*: WAP to FindMissingElement with two methods 
void setArray(int a[]): this method can accept array as parameter 
void showMissing(): this method can find the missing element of array.
*/

import java.util.*;
class FindMissingElement
{
  private int a[];
  public void setArray(int a[])
  {
	this.a=a;
  }
  public void getMissing()
  {
	int j=1;
	int i=0;
	while(i<a.length)
	{
		while(j!=a[i])
		{
			System.out.printf("%d\t",j);
			j++;
		}
		
		
		i++;
		j++;
	}
  }
}
public class FindMissingElementApp
{
	public static void main(String x[])
	{
		int a[]=new int[]{1,4,6,8,10};
		FindMissingElement F=new FindMissingElement();
		F.setArray(a);
		F.getMissing();
	}
}