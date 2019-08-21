package com.kattis;

import java.util.Arrays;
import java.util.Scanner;

public class Egypt {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			while (true) {
				if (sc.hasNext()) {
					String str = sc.next();
					String[] dizi = str.split(" ");
					int[] intDizi = {Integer.parseInt(dizi[0]), Integer.parseInt(dizi[1]), Integer.parseInt(dizi[2])};
					Arrays.sort(intDizi);
					if (intDizi[0] == 0 && intDizi[1] == 0 && intDizi[2] == 0) {
						System.exit(0);
					}
					if ((intDizi[0] * intDizi[0]) + (intDizi[1] * intDizi[1]) == (intDizi[2] * intDizi[2])) {
						System.out.println("right");
					} else {
						System.out.println("wrong");
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
