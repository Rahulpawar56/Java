
import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Rahul");
		map.put(2, "Kimya");
		map.put(5, "Manav");
		map.put(3, "Pravin");
		map.put(4, "Krusha");
		Set<Map.Entry<Integer,String>> entryset= map.entrySet();
		for(Map.Entry<Integer,String> m:entryset)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}

	}

}
