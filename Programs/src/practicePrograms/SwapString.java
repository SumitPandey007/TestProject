package practicePrograms;

public class SwapString {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		
		System.out.println("Before swapping s1 " +s1);
		System.out.println("Before swapping s2 " +s2);
		
		String temp = "";
		
		temp = s1;
		s1 = s2;
		s2 = temp ;
		
		System.out.println("after swapping s1 " +s1);
		System.out.println("after swapping s2 " +s2);
	}

}
