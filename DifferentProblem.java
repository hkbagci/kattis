package com.kattis;

import java.util.Scanner;

public class DifferentProblem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			while (true) {
				if (sc.hasNext()) {
					String str = sc.next();
					String[] dizi = str.split(" ");
					long a = Long.parseLong(dizi[0]);
					long b = Long.parseLong(dizi[1]);
					if (a >= b) {
						System.out.println(a - b);
					} else {
						System.out.println(b - a);
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
