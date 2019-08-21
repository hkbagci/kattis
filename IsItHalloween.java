package com.kattis;

import java.util.Scanner;

public class IsItHalloween {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			while (true) {
				if (sc.hasNext()) {
					String str = sc.next();
					String[] temp = str.split(" ");
					String ay = temp[0];
					int gun = Integer.parseInt(temp[1]);
					if ((ay.equals("OCT") && gun == 31) || (ay.equals("DEC") && gun == 25)) {
						System.out.println("yup");
					} else {
						System.out.println("nope");
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