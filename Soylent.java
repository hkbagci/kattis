package com.kattis;

import java.util.Scanner;

public class Soylent {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				double n = sc.nextDouble();
				System.out.println((int) Math.ceil(n / 400));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}