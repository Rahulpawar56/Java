import java.util.*;
public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map =new LinkedHashMap<Integer,String>();
		map.put(1, "Ram");
		map.put(2, "Shyam");
		map.put(5, "Chaya");
		map.put(3, "Maya");
		map.put(4, "Rahul");
		
		Set<Map.Entry<Integer, String>> entryset=map.entrySet();
		for(Map.Entry<Integer, String> m:entryset)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
