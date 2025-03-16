import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapWithinLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, LinkedHashMap<Integer, String>> map = new LinkedHashMap<String, LinkedHashMap<Integer, String>>();

		LinkedHashMap<Integer, String> fe = new LinkedHashMap<Integer, String>();
		fe.put(1, "Rahul");
		fe.put(2, "Kunal");
		fe.put(3, "Rohan");

		LinkedHashMap<Integer, String> se = new LinkedHashMap<Integer, String>();
		se.put(1, "Ram");
		se.put(2, "Rakul");
		se.put(3, "Ramesh");

		map.put("FE", fe);
		map.put("SE", se);
		Set<Map.Entry<String, LinkedHashMap<Integer, String>>> entryset = map.entrySet();
		for (Map.Entry<String, LinkedHashMap<Integer, String>> s : entryset) {
			String year = s.getKey();
			System.out.println(year);
			System.out.println("=================================================");
			LinkedHashMap<Integer, String> sdata = s.getValue();
			Set<Map.Entry<Integer, String>> data = sdata.entrySet();
			for (Map.Entry<Integer, String> f : data) {
				System.out.println(f.getKey() + "\t" + f.getValue());
			}
			System.out.println("---------------------------------------------------");
		}

	}

}
