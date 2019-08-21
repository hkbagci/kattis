package com.kattis;

import java.util.Scanner;

public class StuckInATimeLoop {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))){
			int i = 0;
			while (true) {
				if (sc.hasNext()) {
					i = sc.nextInt();
					if (!(i >= 1 && i <= 100)) {
						System.exit(0);
					}
				} else {
					break;
				}
			}
			for (int j = 1; j <= i; j++) {
				System.out.println(j + " Abracadabra");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
