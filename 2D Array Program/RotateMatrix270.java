/*Rotate Matrix in 270 degree 

  Ex:   1 2 3         3 6 9
        4 5 6  ===>   2 5 8
		7 8 9         1 4 7

*/
import java.util.*;
public class RotateMatrix270
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter a element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
					a[i][j]=abc.nextInt();
			}
		}
		
		//print Given matrix :
		System.out.printf("\n");
		System.out.println("Given Matrix:\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		}
		
		//transform array :
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		// Reverse Column :
	     int n=a.length;
		 int m=a[0].length;
		 for(int j=0;j<m;j++)
		 {
			int top=0;
			int bottom=n-1;
			while(top<bottom)
			{
				int temp=a[top][j];
				a[top][j]=a[bottom][j];
				a[bottom][j]=temp;
				top++;
				bottom--;
			}
		 }
		 
		 //print Rotated matrix 270 degree :
		System.out.printf("\n");
		System.out.println("After Rotate Matrix in 270 degree:\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		}	 
	}
}