package com.kattis;

import java.util.Scanner;

public class Bishops {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			while (true) {
				if (sc.hasNext()) {
					int n = sc.nextInt();
					if (n > 1) {
						System.out.println((n - 1) * 2);
					} else if (n == 1) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				} else {
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
