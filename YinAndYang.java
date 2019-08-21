package com.kattis;

import java.util.Scanner;

public class YinAndYang {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String str = sc.next();
			int i = str.length();
			if (i < 1 || i > Math.pow(10, 5)) {
				System.exit(0);
			}
			int x = str.replace("W", "").length();
			if (i == x * 2) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}