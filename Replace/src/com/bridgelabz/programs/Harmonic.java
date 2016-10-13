/*
 Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. E
nsure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Harmonic {

	public static void main(String[] args) {

		// INITIALIZATION
		double result = 0, num = 0, j;
		int n;
		Utility u = new Utility();

		// INPUT DATA
		System.out.print("enter the harmonic you want to find: ");
		n = u.inputInteger();

		// COMPUTATION
		for (j = 1; j <= n; j++) {
			num = num + (1 / j);
			result = num;
		}
		System.out.println("the value of harmonic no. " + n + " is: " + result);

	}

}
