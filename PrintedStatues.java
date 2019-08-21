package com.kattis;

import java.util.Scanner;

public class PrintedStatues {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int heykel = sc.nextInt();
			int gun = 1;
			double makine = 0;
			while (Math.pow(2, makine) < heykel) {
				gun++;
				makine++;
			}
			System.out.println(gun);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}