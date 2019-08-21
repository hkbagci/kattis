package com.kattis;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int k = sc.nextInt();
			String me = sc.next();
			String friend = sc.next();
			int ayni = 0;
			int ayniDegil = 0;
			for (int i = 0; i < me.length(); i++) {
				if (me.charAt(i) == friend.charAt(i)) {
					ayni++;
				} else {
					ayniDegil++;
				}
			}
			if (ayni >= k) {
				System.out.println(k + ayniDegil);
			} else {
				System.out.println(ayni + me.length() - k);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}