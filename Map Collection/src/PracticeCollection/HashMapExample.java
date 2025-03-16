package PracticeCollection;
import java.util.*;
import java.util.Map.Entry;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, LinkedHashMap<Integer, String>> map = new HashMap<>();

		LinkedHashMap<Integer, String> fe = new LinkedHashMap<>();
		fe.put(1,"Rahul");
		fe.put(2, "Kunal");
		fe.put(3, "Ganesh");
		fe.put(4, "Ramesh");
		fe.put(5, "Mahesh");
		
		LinkedHashMap<Integer, String> se = new LinkedHashMap<>();
		se.put(1,"Rakesh");
		se.put(2, "Komal");
		se.put(3, "Rani");
		se.put(4, "Radha");
		se.put(5, "Rutuja");
		
		map.put("FE", fe);
		map.put("SE", se);
		
		Set<Entry<String, LinkedHashMap<Integer,String>>> entry=map.entrySet();
		for(Entry<String,LinkedHashMap<Integer,String>> branch:entry)
		{
			String branchName=branch.getKey();
			System.out.println(branchName);
			System.out.println("==============================================");
			 
			LinkedHashMap<Integer,String> data=branch.getValue();
			Set<Entry<Integer,String>> entrydata=data.entrySet();
			for(Entry<Integer,String>sdata:entrydata)
			{
				System.out.println(sdata.getKey()+"\t"+sdata.getValue());
			}
			
			System.out.println("====================================");
		}
	}

}
