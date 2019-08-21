package com.kattis;

import java.util.Scanner;

public class BobbyBet {
	static int[][] binom = new int[11][11];

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				String[] numbers = sc.next().split(" ");
				int r = Integer.parseInt(numbers[0]);
				int s = Integer.parseInt(numbers[1]);
				int x = Integer.parseInt(numbers[2]);
				int y = Integer.parseInt(numbers[3]);
				int w = Integer.parseInt(numbers[4]);
				double zar = (double) (s - r + 1) / (double) s;
				double amac = 1 - zar;
				double kazan = 0;
				for (int j = (int) x; j <= y; j++) {
					kazan += binom((int) y, j) * Math.pow(zar, j) * Math.pow(amac, y - j);
				}
				double kaybet = 1 - kazan;
				if ((kazan * (w - 1)) + (kaybet * (-1)) > 0) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int binom(int a, int b) {
		double sonuc = 1;
		double ust = a;
		for (double i = 1; i <= a - b; i++) {
			sonuc *= ust / i;
			ust--;
		}
		return (int) sonuc;
	}
}