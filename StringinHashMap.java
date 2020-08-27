package java30;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringinHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Chennai is the capital of the state of Tamil Nadu";
		String[] spl = input.split(" ");
		
		
		HashMap<String, Character> map = new LinkedHashMap<String, Character>();
		
		char[] ar = new char[spl.length];
		for (int i = 0; i < spl.length; i++) {
			ar[i] = spl[i].charAt(0);
			map.put(spl[i], ar[i]);
			
		}
		System.out.println(map.toString());
	

		{

		}
	}

}
