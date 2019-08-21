package com.kattis;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))){
			while (true) {
				if (sc.hasNext()) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					if (x != 0 && x <= 1000 && x >= -1000 && y != 0 && y <= 1000 && y >= -1000) {
						if (x > 0 && y > 0) {
							System.out.println("1");
						} else if (x < 0 && y > 0) {
							System.out.println("2");
						} else if (x < 0 && y < 0) {
							System.out.println("3");
						} else if (x > 0 && y < 0) {
							System.out.println("4");
						}
					} else {
						System.exit(0);
					}
				} else {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
