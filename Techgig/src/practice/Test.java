package practice;

import java.util.Scanner;

public class Test {
	public static String Decimal_Binary(int n) {
		int m;
		String x = "";

		while (n > 0) {
			int a = n % 2;
			x = a + x;
			n = n / 2;
		}

		return x;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Decimal Number:");
		int n = s.nextInt();
		System.out.println(Decimal_Binary(n));
		int a = 0b01010111;//87
		int b = 0b11111111;//255
			  //0000010011//19
		// result in 0b01010111
		int c = Integer.parseInt(Decimal_Binary(n));
		System.out.println(a & c);
		System.out.println(b & c);
		System.out.println(a & b);// print 87 which is decimal representation of 0101 0111
	}
}