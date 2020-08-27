package java30;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class ArraytoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] names= {{"Manager","Babu"},{"Tester","Sam"},{"Lead","Hari"},{"Tester","Naveen"}};
		HashMap<String, String> map = new LinkedHashMap<String, String>();
		for (String[] mapping : names)
		{
		    map.put(mapping[0], mapping[1]);
		}
		System.out.println(map.toString());

			}
}


