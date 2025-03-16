package PracticeCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDeptHashMap {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Ram", "IT");
		map.put("Ramesh", "HR");
		map.put("Ganesh", "IT");
		map.put("Rohan", "IT");
		map.put("Krushna", "Employee");
		HashMap<String, ArrayList<String>> res = new HashMap<>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String employee = entry.getKey();
			String department = entry.getValue();
			res.putIfAbsent(department, new ArrayList<>());
			res.get(department).add(employee);
		}
		System.out.println("Employees grouped by department: " + res);
	}
}
