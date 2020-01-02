package practicePrograms;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int no = 153;
		
		int digit = 0;
		
		int t1 = no;
		
		while (t1!=0) {
			
			digit= digit+1;
			
			t1 = t1/10;
			
			
			
		}
		System.out.println(digit);
		
		int t2 = no;
		
		int rem ;
		
		int arm = 0;
		
		while (t2!=0) {
			
			int mul =1;
			
			rem = t2%10;
			
			for (int i = 1; i <=digit; i++) {
				
				mul = mul*rem;
				
			}
			
			arm = arm+mul;
			
			t2 = t2/10;
			
		}
		
		if (no==arm) {
			
			System.out.println("Armstrong Number");
			
		} else {
			
			System.out.println("Not a armstrong Number");

		}
	}

}
