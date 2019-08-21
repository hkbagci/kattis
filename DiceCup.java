package com.kattis;

import java.util.Scanner;

public class DiceCup {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String str = sc.next();
			String dizi[] = str.split(" ");
			int d1 = Integer.parseInt(dizi[0]);
			int d2 = Integer.parseInt(dizi[1]);
			if (d1 >= d2) {
				for (int i = d2 + 1; i <= d1 + 1; i++) {
					System.out.println(i);
				}
			} else {
				for (int i = d1 + 1; i <= d2 + 1; i++) {
					System.out.println(i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
