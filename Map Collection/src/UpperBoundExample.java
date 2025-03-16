import java.util.*;
class UpperB
{
	void calSum(List< ? extends Number>list) {
		for(Number val:list) {
			System.out.println(val);
		}
	}
}
public class UpperBoundExample {

	public static void main(String[] args) {
		
	UpperB v=new UpperB();
		System.out.println("Integer Data is");
		List <Integer> list =new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		v.calSum(list);
		
		System.out.println("Float Data is");
		List<Float> list1=new ArrayList<>();
		list1.add(4.5f);
		list1.add(5.5f);
		list1.add(6.6f);
		v.calSum(list1);
		
	}

}
