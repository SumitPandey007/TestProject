package practicePrograms;

import java.util.Scanner;

public class ArmstrongNumber1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		
		int t1 = num;
		int digit=0;
		
		while (t1!=0) {
			
			digit = digit+1;
			t1=t1/10;
			
		}
		
		//System.out.println(digit);
		
		int t2 = num;
		int rem;
		int arm=0;
		
		while (t2!=0) {
			
			int mul = 1;
			
			rem = t2%10;
			
			for (int i = 1; i <= digit; i++) {
				
				mul = mul*rem;
				
			}
			
			arm = arm + mul;
			
			t2 = t2/10;
			
			
			
		}
		
		System.out.println(arm);
		
		if (num==arm) {
			
			System.out.println("Armstrong Number");
		} else {
			
			System.out.println("Not a armstrong number");

		}
		
		scanner.close();
				
	}

}
