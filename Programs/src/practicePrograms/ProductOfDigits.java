package practicePrograms;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int rem =0;
		int prod = 1;
		while (num>0) {
			rem=num%10;
			prod=prod*rem;
			num=num/10;
			
		}
		System.out.println(prod);
		sc.close();
	}

}
