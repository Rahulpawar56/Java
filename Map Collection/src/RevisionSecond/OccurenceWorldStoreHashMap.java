package RevisionSecond;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OccurenceWorldStoreHashMap {
	public static void main(String[] args) {
		String string = "The sky is blue sky is shiney";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String arr[] = string.split(" ");
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

//		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
//		for(Map.Entry<String, Integer> val:entrySet) {
//			System.out.println(val.getKey()+"----->"+val.getValue());
//		}

		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " -------> " + entry.getValue());

		}
	}
}
