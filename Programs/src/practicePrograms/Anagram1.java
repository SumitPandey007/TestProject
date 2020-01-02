package practicePrograms;

import java.util.Arrays;

public class Anagram1 {
	
	public static void main(String[] args) {
		
		String x = "He IS araDHya";
		
		String y = "is he HRADAYA";		
		
		x=x.replace(" ", "");
		
		y = y.replace(" ", "");
		
		x = x.toLowerCase();
		
		y = y.toLowerCase();
		
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if (result==true) {
			
			System.out.println("Anagram");
			
		} else {
			
			System.out.println("not a anagram");

		}
		
	}

}
