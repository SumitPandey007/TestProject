package practicePrograms;

public class MutableStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer x = new StringBuffer("abc");
		
		StringBuffer y = new StringBuffer("def");
		
		x.append(y);
		
		System.out.println(x);
	}

}
