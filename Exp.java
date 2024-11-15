import java.util.*;
public class Exp
{
	public static void main(String x[])
	{
		 LinkedList<String> li = new LinkedList<>();
        Scanner xyz = new Scanner(System.in);
        String a[] = new String[3];
        
        System.out.println("Enter 3 expiry dates (format dd-mm-yyyy): ");
        for (int i = 0; i < 3; i++) {
            a[i] = xyz.nextLine();
        }
       
        for (int i = 0; i < 3; i++) {
            li.add(a[i]);
        }

         for (int i = 0; i < li.size(); i++) {
            for (int j = 0; j < li.size() - 1 - i; j++) { 
                String[] arr1 = li.get(j).split("-");
                int expYear1 = Integer.parseInt(arr1[2]);
                int expMonth1 = Integer.parseInt(arr1[1]);
                int expDay1 = Integer.parseInt(arr1[0]);

                String[] arr2 = li.get(j + 1).split("-");
                int expYear2 = Integer.parseInt(arr2[2]);
                int expMonth2 = Integer.parseInt(arr2[1]);
                int expDay2 = Integer.parseInt(arr2[0]);
				
                if ((expYear1 > expYear2) || 
                    (expYear1 == expYear2 && expMonth1 > expMonth2) || 
                    (expYear1 == expYear2 && expMonth1 == expMonth2 && expDay1 > expDay2)) {
                  
                    String temp = li.get(j);
                    li.set(j, li.get(j + 1));
                    li.set(j + 1, temp);
                }
            }
        }
	  for(Object obj:li)
	  {
		  System.out.println(obj);
	  }
	}
}