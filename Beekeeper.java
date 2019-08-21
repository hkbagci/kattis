package com.kattis;

import java.util.Scanner;

public class Beekeeper {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			while (true) {
				String sonuc = "";
				int n = sc.nextInt();
				int lastDoubleVowels = -1;
				if (n == 0) {
					break;
				}
				for (int i = 0; i < n; i++) {
					int doubleVowels = 0;
					String str = sc.next();
					for (int j = 0; j < str.length() - 1; j++) {
						if ("aa".equals(str.substring(j, j + 2))) {
							doubleVowels++;
						}
						if ("ee".equals(str.substring(j, j + 2))) {
							doubleVowels++;
						}
						if ("ii".equals(str.substring(j, j + 2))) {
							doubleVowels++;
						}
						if ("oo".equals(str.substring(j, j + 2))) {
							doubleVowels++;
						}
						if ("uu".equals(str.substring(j, j + 2))) {
							doubleVowels++;
						}
						if ("yy".equals(str.substring(j, j + 2))) {
							doubleVowels++;
						}
					}
					if (doubleVowels > lastDoubleVowels) {
						lastDoubleVowels = doubleVowels;
						sonuc = str;
					}
				}
				System.out.println(sonuc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}