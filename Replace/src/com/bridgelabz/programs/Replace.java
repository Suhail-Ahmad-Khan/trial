/*
 User Input and Replace String Template “Hello <<UserName>>, How are you?”
a. I/P​ -> Take User Name as Input. ​ Ensure UserName has min 3 char
b. Logic​ -> Replace <<UserName>> with the proper name
c. O/P​ -> Print the String with User Name
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Replace {

	public static void main(String[] args) {
		// INITIALIZATION
		String str1, str2, str3, str4;
		Utility u = new Utility();

		// INPUT DATA
		System.out.print("Enter String: ");
		str1 = u.inputString();

		System.out.print("Enter name you want to replace: ");
		str2 = u.inputString();

		System.out.print("Enter name you want to replace with: ");
		str3 = u.inputString();

		// COMPUTATION
		str4 = str1.replace(str2, str3);

		// OUTPUT
		System.out.println("New String: " + str4);
	}

}
