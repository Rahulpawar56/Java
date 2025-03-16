package PracticeCollection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MergeTwoHashMap {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map1 = new HashMap<>();
		map1.put(1, 10);
		map1.put(2, 20);
		map1.put(3, 30);

		HashMap<Integer, Integer> map2 = new HashMap<>();
		map2.put(1, 5);
		map2.put(2, 25);
		map2.put(3, 35);
		map2.put(4, 40);

		HashMap<Integer, Integer> result = new HashMap<>();

		for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
			result.put(entry.getKey(), entry.getValue());
		}

		for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
			result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0) + entry.getValue());
		}

		System.out.println("Merged HashMap: " + result);
	}
}
