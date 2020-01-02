package practicePrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MaxValueInString {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = "sillyspiders";
		
		char[] y = string.toCharArray();
		int size = y.length;
		
		int i = 0;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
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
		
		Set<Map.Entry<Character, Integer>> lhmap = map.entrySet();
		
		char maxkey = ' ';
		int maxval = 0;
		
		for (Map.Entry<Character, Integer> entry : lhmap) {
			
			if (entry.getValue()>maxval) {
				
				maxkey = entry.getKey();
				maxval = entry.getValue();
				
			}
		}
		System.out.println(maxkey);
		System.out.println(maxval);
	}

}
