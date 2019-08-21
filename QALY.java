package com.kattis;

import java.util.Scanner;

public class QALY {

	public static void main(String[] args) {
		double toplam = 0;
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int periods = sc.nextInt();
			for (int i = 0; i < periods; i++) {
				String str = sc.next();
				String dizi[] =  str.split(" ");
				double d1 = Double.parseDouble(dizi[0]);
				double d2 = Double.parseDouble(dizi[1]);
				toplam += d1 * d2;
			}
			System.out.println(toplam);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}