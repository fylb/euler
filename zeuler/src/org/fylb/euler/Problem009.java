package org.fylb.euler;

public class Problem009 {

	private static int testPythorean(int a, int b) {
		int sum = a*a+b*b;
		int s = (int) Math.sqrt(sum);
		if (sum == s*s) {
			return s;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		for (int a=1; a < 999; a++) {
			for (int b=1; b < 999; b++) {
				int c = testPythorean(a, b);
				if (c != 0 && a+b+c==1000) {
					System.out.printf("a=%d, b=%d, c=%d\n, m=%d", a, b, c, a*b*c);
					break;
				}
			}
		}
	}
}
