package practicePrograms;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class UniqueCharacters {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		
		String string = sc.next();
		char[] y = string.toCharArray();
		int size = y.length;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		int i = 0;
		
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
		
		Set<Map.Entry<Character, Integer>> lmap = map.entrySet();
		
		for (Map.Entry<Character, Integer> entry : lmap) {
			
			if (entry.getValue()>1) {
				System.out.println("Doesn't contain unique characters");
				System.exit(0);
				
			}
			
		}
		System.out.println("Contains unique characters");
		sc.close();
	}
	

}
