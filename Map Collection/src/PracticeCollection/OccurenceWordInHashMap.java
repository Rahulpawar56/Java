package PracticeCollection;

import java.util.*;

public class OccurenceWordInHashMap {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = xyz.nextLine();
		HashMap<String, Integer> map = new HashMap<>();
		String arr[] = str.split(" ");
		for (String s : arr) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		System.out.println("Word occurence :" + map);
	}
}
