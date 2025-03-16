import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "Rahul");
		map.put(2, "Ram");
		map.put(5, "Shyam");
		map.put(3, "Pravin");
		map.put(4, "Krusha");
		int len=map.size();
		Set<Map.Entry<Integer,String>> entryset= map.entrySet();
		for(Map.Entry<Integer,String> m:entryset)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}

	}

}
