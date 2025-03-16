import java.util.*;

public class TourExampleLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Dhoni");
		al.add("Kohli");
		al.add("Rohit");

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Butler");
		al1.add("Hetmier");
		al1.add("Parag");

		map.put("India", al);
		map.put("Aus", al1);

		Set<Map.Entry<String, ArrayList<String>>> setentry = map.entrySet();
		for (Map.Entry<String, ArrayList<String>> s : setentry) {
			String country=s.getKey();
			System.out.println(country);
			System.out.println("==============================================");
			ArrayList<String> data=s.getValue();
			for(String S:data)
			{
				System.out.println(S);
			}
			System.out.println("---------------------------------------------------");
		}
	}

}
