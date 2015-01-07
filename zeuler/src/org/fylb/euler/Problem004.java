package org.fylb.euler;

import org.apache.commons.lang3.StringUtils;


public class Problem004 {

	public static boolean isPalindrom(int d) {
		String s = String.valueOf(d);
		String r = StringUtils.reverse(s);
		return s.equals(r);
	}
	
	public static void main(String[] args) {
		int a = 999, b = 999;
		int p, m=0;
		while (a > 2) {
			p = a*b;
			if (isPalindrom(p)) {
				m = Math.max(m, p);
				System.out.printf("%d * %d = %d\n", a, b, p);
			}
			b--;
			if (b==1) {
				a-=1;
				b=a;
			}
		}
		System.out.println(m);
	}
}
