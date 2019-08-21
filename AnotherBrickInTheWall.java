package com.kattis;

import java.util.Scanner;

public class AnotherBrickInTheWall {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String[] dizi = sc.next().split(" ");
			int h = Integer.parseInt(dizi[0]);
			int w = Integer.parseInt(dizi[1]);
			int n = Integer.parseInt(dizi[2]);
			int gecici = w;
			String[] temp = sc.next().split(" ");
			while (n > 0) {
				w -= Integer.parseInt(temp[temp.length - n]);
				n--;
				if (w == 0) {
					h--;
					w = gecici;
					if (h == 0) {
						System.out.println("YES");
						System.exit(0);
					}
					continue;
				} else if (w < 0) {
					System.out.println("NO");
					System.exit(0);
				}
				
			}
			System.out.println("NO");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
