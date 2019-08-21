package com.kattis;

import java.util.Scanner;

public class LastFactorialDigit {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				int n = sc.nextInt();
				String str = String.valueOf(fact(n));
				System.out.println(str.substring(str.length() - 1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int fact(int value) {
		if (value > 1) {
			value *= fact(value - 1);			
		}
		return value;
	}

}
