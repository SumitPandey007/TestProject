package practicePrograms;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.next();
		
		char[] y = string.toCharArray();
		
		int size = y.length;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		int i =0;
		
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
		
		for (Map.Entry<Character, Integer> entry : lhmap) {
			
			if (entry.getValue()>1) {
				
				System.out.print(entry.getKey());
				System.out.println(entry.getValue());
				
			}
			
		}

}
}