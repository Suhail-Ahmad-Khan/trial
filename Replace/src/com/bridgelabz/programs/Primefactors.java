/*
Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency​ .
d. O/P -> Print the prime factors of number N 
*/

package com.bridgelabz.util;

import com.bridgelabz.util.Utility;

public class Primefactors {

	public static void main(String[] args) {

		// INITIALIZATION
		int n;
		Utility u = new Utility();
		
		// INPUT DATA
		System.out.print("Enter a Number : ");
		n = u.inputInteger();

		// COMPUTATION
		System.out.print("The Prime Factors of " + n + " are : ");

		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			} else
				i++;
		}
		System.out.println(" ");
	}
}
