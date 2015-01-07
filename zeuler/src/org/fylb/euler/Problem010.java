package org.fylb.euler;

public class Problem010 {

	public static boolean isPrime(long p) {
		for (long n = 3; n <= Math.sqrt(p)+1; n += 2) {
			if (p % n == 0) {
				return false;
			}
		}
		return true;
	}

	static int m = 2000000;

	public static void main(String[] args) {
		int i = 0;
		long p = 3;
		long sum = 2;
		while (p < m) {
			while (!isPrime(p)) {
				p += 2;
			}
			if (p > m) {
				break;
			}
			i++;
			sum += p;
			if (i % 100 == 0) {
				System.out.printf("%d - %d\n", i, p);
			}
			p += 2;
		}
		System.out.println(sum);
	}
}
