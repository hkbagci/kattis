package com.kattis;

import java.util.Scanner;

public class BabyBites {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int n = sc.nextInt();
			String[] dizi = sc.next().split(" ");
			while (n != 0) {
				if (!dizi[dizi.length - n].equals("mumble") && Integer.parseInt(dizi[dizi.length - n]) != (dizi.length - n + 1)) {
					System.out.println("something is fishy");
					System.exit(0);
				} else {
					n--;
				}
			}
			System.out.println("makes sense");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}