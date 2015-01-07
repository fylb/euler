package org.fylb.euler;

public class Problem006 {
	static int m = 100;
	public static void main(String[] args) {
		long p1 = 0;
		long p2 = 0;
		for (long i = 0; i <=m; i++) {
			p1 += i*i;
			p2 += i;
		}
		System.out.println(p2*p2 - p1);
	}
}
