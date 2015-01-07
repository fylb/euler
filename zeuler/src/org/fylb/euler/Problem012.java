package org.fylb.euler;

import java.util.HashMap;
import java.util.Map;

public class Problem012 {

	private long current = 1;
	private long idx = 2;
	private static final boolean debug = false;

	private long generateNextTriangle() {
		current += idx;
		idx++;
		return current;
	}

	private long numberOfDivisorsNumb() {
		long nb = 0;
		if (debug) {
			System.out.printf("%5d : ", current);
		}
		for (int div = 1; div <= current / 2; div++) {
			if (current % div == 0) {
				nb++;
				System.out.printf("%d ", div);
			}
		}
		nb++;
		if (debug) {
			System.out.println(" -> " + nb);
		}
		return nb;
	}

	private long numberOfDivisors() {
		long c = current;
		if (debug) {
			System.out.printf("%5d : ", current);
		}
		int div = 2;
		Map<Integer, Integer> primeDivisors = new HashMap<>();
		while (c != 1) {
			if (c % div == 0) {
				if (primeDivisors.get(div) == null) {
					primeDivisors.put(div, 1);
				} else {
					primeDivisors.put(div, primeDivisors.get(div) + 1);
				}
				c /= div;
				if (debug)
					System.out.printf("%d[%d] ", div, c);
			} else {
				if (div == 2) {
					div++;
				} else {
					div += 2;
				}
			}
		}
		int sum = 1;
		for (Map.Entry<Integer, Integer> entry : primeDivisors.entrySet()) {
			sum *= (entry.getValue() + 1);
		}
		if (debug) {
			System.out.println(" -> " + primeDivisors + " -> " + sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		Problem012 p = new Problem012();
		long max = 0, i = 0;
		while (true) {
			i++;
			p.generateNextTriangle();
			long nb = p.numberOfDivisors();
			// nb = p.numberOfDivisorsNumb();
			if (nb > max) {
				max = nb;
				System.out.printf("Iteration %d, found %d divisors for %d\n", i, max, p.current);
			}
			if (i % 1000 == 0) {
				System.out.printf("Iteration %d, %d\n", i, p.current);
			}
			if (max > 500) {
				System.out.println(p.current);
				break;
			}
		}
	}
}
