package practicePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter string 1");
		
		String x = scanner.next();
		
		System.out.println("enter string 2");
		
		String y = scanner.next();
		
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
