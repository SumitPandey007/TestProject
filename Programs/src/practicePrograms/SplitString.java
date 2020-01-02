package practicePrograms;

public class SplitString {
	public static void main(String[] args) {
		String str = "How Are you";
		String[] a1 = str.split(" ");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
			
		}
		for (int i = a1.length-1; i >=0; i--) {
			System.out.println(a1[i]);
		}
	}

}
