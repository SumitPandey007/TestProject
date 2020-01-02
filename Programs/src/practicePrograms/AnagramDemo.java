package practicePrograms;

import java.util.Arrays;

public class AnagramDemo {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "dbca";
		System.out.println(checkAnagram(str1, str2));
	}
	public static boolean checkAnagram(String str1,String str2) {
		char[] a1=str1.toCharArray();
		char[] a2 = str2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
}

}
