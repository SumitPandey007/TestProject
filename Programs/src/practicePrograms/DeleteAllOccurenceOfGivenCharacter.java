package practicePrograms;

public class DeleteAllOccurenceOfGivenCharacter {
	public static void main(String[] args) {
		
		String string = "spiderslies";
		char[] y = string.toCharArray();
		int size = y.length;
		
		int i = 0;
		
		char key = 's';
		
		String res = "";
		
		while (i!=size)
		{
			
			if (y[i]!=key) {
				
				res = res + y[i];
				}
			++i;
		  
		  
		  
			
		}
		
		System.out.println(res);
	
	
	
	

	}
}


