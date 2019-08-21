package com.kattis;

import java.util.Scanner;

public class SolvingForCarrots {

	public static void main(String[] args) {
		int x = 0, y = 0;
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String str = sc.next();
			String[] dizi = str.split(" ");
			x = Integer.parseInt(dizi[0]);
			y = Integer.parseInt(dizi[1]);
			if (x < 1 && y > 1000) {
				System.exit(0);
			}
			while (sc.hasNext()) {
				if (x == 0) {
					break;
				}
				x--;
			}
			System.out.println(y);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
