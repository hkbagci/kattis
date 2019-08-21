package com.kattis;

import java.util.Scanner;

public class Sibice {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))){
			int i = 0, j = 0, k = 0, n = 0, l[] = null;
			String str = "";
			String[] temp = null;
			str = sc.next();
			temp = str.split(" ");
			i = Integer.parseInt(temp[0]);
			j = Integer.parseInt(temp[1]);
			k = Integer.parseInt(temp[2]);
			l = new int[i];
			if (!(i >= 1 && i <= 50 && j >= 1 && j <= 100 && k >= 1 && k <= 100)) {
				System.exit(0);
			}
			while (true) {
				if (sc.hasNext()) {
					if (n <= l.length) {
						l[n] = sc.nextInt();
						if (l[n] < 1 && l[n] > 1000) {
							System.exit(0);
						}
						n++;
					} else {
						break;
					}
				} else {
					break;
				}
			}
			for (int count = 0; count < l.length; count++) {
				if (((j * j) + (k * k)) >= (l[count] * l[count])) {
					System.out.println("DA");
				} else {
					System.out.println("NE");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
