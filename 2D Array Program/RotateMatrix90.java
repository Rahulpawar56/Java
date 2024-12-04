/*Rotate a given matrix in 90 degree  
 
 ex:
      1 2 3             7 4 1 
	  4 5 6   ====>     8 5 2 
	  7 8 9             9 6 3  
*/
import java.util.*;
public class RotateMatrix90
{
	public static void main(String x[])
	{
		Scanner abc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter a elemnt in array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=abc.nextInt();
			}
		}
		
		//Print given 2D  matrix
		
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		}
		
		//Tranform Matrix
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
			  int temp=a[i][j];
			  a[i][j]=a[j][i];
			  a[j][i]=temp;
			   
			}
		}
		
		//Reverse row in matrix
		 for(int i=0;i<a.length;i++)
		 {
			 int left=0;
			 int right=a[i].length-1;
			 while(left<right)
			 {
				 int temp=a[i][left];
				 a[i][left]=a[i][right];
				 a[i][right]=temp;
				 left++;
				 right--;
			 }
		 }
		//Printing 2D Matrix
		System.out.println("Before Rotate 90 degree Matrix:\n");
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
