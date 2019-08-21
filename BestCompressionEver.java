package com.kattis;

import java.util.Scanner;

public class BestCompressionEver {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String str = sc.next();
			String[] dizi = str.split(" ");
			double x = Double.parseDouble(dizi[0]);
			double y = Double.parseDouble(dizi[1]);
			if (x <= Math.pow(2, y + 1) - 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}