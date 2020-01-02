package practicePrograms;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		
		String str = "aradhya";
		char[] y = str.toCharArray();
		int size = y.length;
		
		Map<Character, Integer> map = new HashMap<>();
		
		int i=0;
		
		while (i!=size) {
			if (map.containsKey(y[i])==false) {
				map.put(y[i], 1);
				
			} else {
				
				int oldval = map.get(y[i]);
				int newval = oldval+1;
				map.put(y[i], newval);

			}
			++i;
		}
		
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		
		for (Map.Entry<Character, Integer> entry : hmap) {
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
		
  }

}
