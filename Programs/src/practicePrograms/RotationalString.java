package practicePrograms;

public class RotationalString {
	
	public static void main(String[] args) {
		
		String originalString = "aradhya";
		String newstring = originalString.concat(originalString);
		
		System.out.println(newstring);
		
		String keyString = "radhyaa";
		
		if (newstring.contains(keyString)) {
			
			System.out.println("rotational string");
			
		} else {
			
			System.out.println("not a rotational string");

		}
	}

}
