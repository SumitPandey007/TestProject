package practicePrograms;

public class FibonachiSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c,num=0;
		System.out.println(a);
		System.out.println(b);
		while (num<6) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
			num++;
		}
	}

}
