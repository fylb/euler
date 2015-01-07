package org.fylb.euler;

public class Problem007 {

	public static boolean isPrime(long p) {
		for (long n=3; n <= p/2; n+=2 ) {
			if (p % n == 0) {
				return false;
			}
		}
		return true;
	}
	
	static int m = 10001;
	public static void main(String[] args) {
		int i = 0;
		long p = 1;
		while (i != m) {
			while (!isPrime(p)) {
				p+=2;
			}
			i++;
			System.out.printf("%d - %d\n",i , p);
			p+=2;
		}
	}
}
