package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Utility {
	BufferedReader br;

	// CREATING CONSTRUCTOR WITH SAME NAME AS CLASS
	public Utility() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	// INPUT STRING
	public String inputString() {
		try {
			return br.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT INTEGER
	public int inputInteger() {
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT DOUBLE
	public double inputDouble() {
		try {
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	// INPUT BOOLEAN
	public boolean inputBoolean() {
		try {
			return Boolean.parseBoolean(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	// REMOVING BLANK SPACES
	public String remove_spaces(String str) {
		try {
			return str.replaceAll("\\s", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
}
