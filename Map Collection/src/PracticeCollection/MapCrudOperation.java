package PracticeCollection;

import java.util.*;
import java.util.Map.Entry;
public class MapCrudOperation {

	public static void main(String[] args) {
       
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		map.put(1,"Rahul");
		map.put(2,"Ram");
		map.put(3,"Kunal");
		map.put(4,"Krushna");	
		
		Set<Entry<Integer, String>> entry=map.entrySet();
		
		for(Entry<Integer, String> val:entry )
		{
			System.out.println(val.getKey()+"\t"+val.getValue());
		}
	}

}
