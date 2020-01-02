package practicePrograms;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatedCharacter {
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
		
		
		for (Map.Entry<Character, Integer> entry : lhmap) {
			
			if (entry.getValue()==1) {
				
				System.out.println(entry.getKey());
				System.exit(0);
				
			}
			
		}
		
		scanner.close();
	}

}
