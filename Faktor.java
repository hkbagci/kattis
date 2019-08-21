package com.kattis;

import java.util.Scanner;

public class Faktor {

	public static void main(String[] args) {
		int i = 0, j = 0, sonuc = 0;
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))){
			while (true) {
				if (sc.hasNext()) {
					String gecici = sc.next();
					String[] temp = gecici.split(" ");
					i = Integer.parseInt(temp[0]);
					j = Integer.parseInt(temp[1]);
					if (i >= 1 && i <= 100 && j >= 1 && j <= 100) {
						sonuc = (i * (j - 1)) + 1;
					} else {
						System.exit(0);
					}
				} else {
					break;
				}
			}
			System.out.println(sonuc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
