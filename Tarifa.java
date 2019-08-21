package com.kattis;

import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		int i = 0, j = 0, m = 0, sonuc = 0;
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))){
			while (true) {
				if (sc.hasNext()) {
					if (i == 0) {
						i = sc.nextInt();
					} else if (j == 0){
						j = sc.nextInt();
					} else {
						if (!(i >= 1 && i <= 100 && j >= 1 && j <= 100)) {
							System.exit(0);
						} else {
							if (j != 0) {
								m = sc.nextInt();
								if (!(m >= 0 && m <= 10000)) {
									System.exit(0);
								} else {
									sonuc += i - m;
								}
								j--;
							} else {
								break;
							}
						}
					}
				} else {
					if (j != 0) {
						System.exit(0);
					}
					break;
				}
			}
			System.out.println(sonuc + i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
