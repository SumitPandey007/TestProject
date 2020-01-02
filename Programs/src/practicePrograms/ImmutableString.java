package practicePrograms;

public class ImmutableString {
	public static void main(String[] args) {
		String x = "abc";
		String y = "def";
		
		x.concat(y);
		
		System.out.println(x);
	}

}
