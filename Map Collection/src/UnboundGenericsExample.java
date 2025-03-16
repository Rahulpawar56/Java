import java.util.*;
class Sum
{
	void calSum(List<?>list) {
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
}
public class UnboundGenericsExample {

	public static void main(String[] args) {
		
		Sum s=new Sum();
		System.out.println("Integer Data is");
		List <Integer> list =new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		s.calSum(list);
		
		System.out.println("Float Data is");
		List<Float> list1=new ArrayList<>();
		list1.add(4.5f);
		list1.add(5.5f);
		list1.add(6.6f);
		s.calSum(list1);
		
	}

}
