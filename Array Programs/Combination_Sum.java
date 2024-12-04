/*
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []

*/
import java.util.*;
class CombinationSum
{
}
public class Combination_Sum
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=xyz.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter a element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter a Target sum:");
		int target=xyz.nextInt();
		
		CombinationSum C=new CombinationSum();
		C.setArray(a.target);
		C.showArray();
	}
}
