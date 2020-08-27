package java30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Mapvalueincrements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> town = new ArrayList<String>();
		town.add("chennai");
		town.add("kanyakumari");
		town.add("Coimbatore");
		town.add("Karur");
		town.add("Erode");
		town.add("Dindigul");
		town.add("Salem");
		town.add("tiruppur");
		System.out.println("input list"+ town.toString());
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("chennai", 1);
		map.put("tiruppur", 1);
		map.put("nammakkal", 1);
		map.put("Tenkasi", 1);
		map.put("Coimbatore", 1);
		map.put("Ariyalur", 1);
		map.put("Erode", 1);
		int inc = 0;
		System.out.println("input Map" + map.toString());
		for (int j = 0; j < town.size(); j++) {
			
			if (map.containsKey(town.get(j))) {
				//System.out.println(town.get(j) + " value " + map.get(town.get(j)));
				 inc = map.get(town.get(j)) +1;
				
				 map.replace(town.get(j), inc);
			}
			
		}
		 System.out.println(map.toString());
	}
}
