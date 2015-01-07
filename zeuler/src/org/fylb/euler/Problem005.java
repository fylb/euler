package org.fylb.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem005 {
	
	private static int l = 20;

	private static long getMin(long m, List<Long> ints, long orig) {
		boolean dividable = true;
		for (Long i : ints) {
			dividable &= m % i == 0;
		}
		if (dividable) {
			long n = m;
			for (Long i : ints) {
				n = Math.min(n, getMin(m/i, ints, m));
			}
			return n;
		} else {
			return orig;
		}
	}
	public static void main(String[] args) {
		List<Long> ints = new ArrayList<Long>();
		for (long i=2; i<=l; i++) {
			ints.add(i);
		}
		List<Long> n = new ArrayList<Long>();
		n.addAll(ints);
		for (int i=ints.size()-1; i >= 0; i--) {
			long tested = ints.get(i);
			for (int k = i-1; k >= 0; k--) {
				if (tested % ints.get(k) == 0) {
					ints.remove(k);
				}
			}
			i = Math.min(i, ints.size()-1);
		}
		long m = ints.stream().mapToLong((x) -> x).reduce((i,j) -> {return i*j;}).getAsLong();
		System.out.println(m);
		System.out.println(getMin(m, n, m));
	}
}