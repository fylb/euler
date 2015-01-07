package org.fylb.euler;

public class Problem002 {

	private static int MAX = 4000000;
	

	public static void main(String[] args) {
		int a=1, b=2, f=a+b;
		int sum = 0;
		while (a < MAX) {
			if (a % 2 == 0) {
				sum +=a;
			}
			f = a+b;
			System.out.println(f);
			a = b;
			b = f;
		}
		System.out.println(sum);
	}
}
