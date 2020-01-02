package practicePrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string");
		String string = scanner.next();
		
		char[] y = string.toCharArray();
		int size = y.length;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		int i = 0;
		
		while (i!=size) {
			
			if (map.containsKey(y[i])==false) {
				
				map.put(y[i], 1);
				
			} else {
				
				int oldval=map.get(y[i]);
				int newval = oldval+1;
				map.put(y[i], newval);

			}
			
			++i;
			
		}
		
		Set<Map.Entry<Character, Integer>> lhmap = map.entrySet();
		
		String res = "";
		
		for (Map.Entry<Character, Integer> entry : lhmap) {
			
		
			res=res+entry.getKey();
		}
		
		System.out.println(res);
		scanner.close();
	}

}
