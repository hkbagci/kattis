package com.kattis;

import java.util.Scanner;

public class Aaah {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String str1 = sc.next();
			String str2 = sc.next();
			if (str1.length() >= str2.length()) {
				System.out.println("go");
			} else {
				System.out.println("no");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
