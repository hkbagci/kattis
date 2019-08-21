package com.kattis;

import java.util.Scanner;

public class Zamka {

	public static void main(String[] args) {
		int l = 0, d = 0, x = 0;
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			l = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt();
			int sonuc[] = new int[2];
			if (!(l >= 1 && l <= 10000 && d >= 1 && d <= 10000 && x >= 1 && x <= 36 && l <= d)) {
				System.exit(0);
			}
			for (int i = l; i <= d; i++) {
				if (basamakTopla(i) == x) {
					sonuc[0] = i;
					break;
				}
			}
			for (int i = d; i >= l; i--) {
				if (basamakTopla(i) == x) {
					sonuc[1] = i;
					break;
				}
			}
			System.out.println(sonuc[0]);
			System.out.println(sonuc[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int basamakTopla (int sayi) {
		int toplam = 0;
		while (sayi > 0) {
			toplam += sayi % 10;
			sayi /= 10;
		}
		return toplam;
	}
}
