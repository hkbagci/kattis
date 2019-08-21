package com.kattis;

import java.util.Scanner;

public class RoamingRomans {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			double d = sc.nextDouble();
			System.out.println(Math.round(d * 5280 / 4854 * 1000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
