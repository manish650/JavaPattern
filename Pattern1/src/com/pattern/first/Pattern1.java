/*
 * if n=6 
 1 2 3 4 5 6
 12 11 10 9 8 7
 13 14 15 16 17 18
 24 23 22 21 20 19
 25 26 27 28 29 30
 36 35 34 33 32 31
 */

package com.pattern.first;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 7;
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if(k==7)
					System.out.println("i\t"+i);
				if (i % 2 == 0) {
					System.out.print(" " + k--);
					if (j == 1)
						k = k + n - 1;
					if (j == n)
						k = k + n;
					

				} else {

					System.out.print(" " + k++);
				}
			}

			System.out.println();
		}
	}

}
