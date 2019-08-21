package com.kattis;

import java.util.Scanner;

public class PokerHand {

	public static void main(String[] args) {
		long sonuc = 0, output = 0;
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String str = sc.next();
			str = str.replace(" ", "");					
			for (int i = 0; i < 5; i++) {
				char c = str.charAt(i * 2);
				sonuc = str.chars().filter(ch -> ch == c).count();
				if (sonuc > output) {
					output = sonuc;
				}
			}
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
