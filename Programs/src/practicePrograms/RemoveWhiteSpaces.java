package practicePrograms;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String string = "Hello how aaaar                   you?0";
		string=string.replaceAll("\\s", "");
		System.out.println(string);
	}

}
