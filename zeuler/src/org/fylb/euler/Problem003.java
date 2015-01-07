package org.fylb.euler;

public class Problem003 {
	public static void main(String[] args) {
		long i = 600851475143l;
		long d = 3;
		while (i > d) {
			if (i % d == 0) {
				System.out.printf("Found divisor: %d = %d*%d\n", i, d, i/d);
				i = i / d;
			} else {
				d += 2;
			}
		}
		System.out.println(d);
	}  
}
