package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitByBit {

	public static void main(String[] args) {
		int i = 0, j = 0, k = 0;
		List<StringBuilder> output = new ArrayList<>();
		StringBuilder outputStr;
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			while (true) {
				if (sc.hasNext()) {
					outputStr = new StringBuilder();
					for (int temp = 0; temp < 32; temp++) {
						outputStr.append("?");
					}
					i = sc.nextInt();
					if (i == 0) {
						break;
					}
					for (int z = 0; z < i; z++) {
						String temp = sc.next();
						String dizi[] = temp.split(" ");
						if (dizi.length == 2) {
							if (dizi[0].equals("SET")) {
								j = Integer.parseInt(dizi[1]);
								if (j > 31 && j < 0) {
									System.exit(0);
								}
								outputStr.setCharAt(31 - j, '1');
							} else if (dizi[0].equals("CLEAR")) {
								j = Integer.parseInt(dizi[1]);
								if (j > 31 && j < 0) {
									System.exit(0);
								}
								outputStr.setCharAt(31 - j, '0');
							} else {
								System.exit(0);
							}
						} else if (dizi.length == 3) {
							if (dizi[0].equals("OR")) {
								j = Integer.parseInt(dizi[1]);
								k = Integer.parseInt(dizi[2]);
								if (j > 31 && j < 0 && k > 31 && k < 0) {
									System.exit(0);
								}
								if (outputStr.charAt(31 - j) == '1' || outputStr.charAt(31 - k) == '1' ) {
									outputStr.setCharAt(31 - j, '1');
								} else if (outputStr.charAt(31 - j) == '?' || outputStr.charAt(31 - k) == '?' ) {
									outputStr.setCharAt(31 - j, '?');
								}
							} else if (dizi[0].equals("AND")) {
								j = Integer.parseInt(dizi[1]);
								k = Integer.parseInt(dizi[2]);
								if (j > 31 && j < 0 && k > 31 && k < 0) {
									System.exit(0);
								}
								if (outputStr.charAt(31 - j) == '0' || outputStr.charAt(31 - k) == '0' ) {
									outputStr.setCharAt(31 - j, '0');
								} else if (outputStr.charAt(31 - j) == '?' || outputStr.charAt(31 - k) == '?' ) {
									outputStr.setCharAt(31 - j, '?');
								}
							} else {
								System.exit(0);
							}
						} else {
							System.exit(0);
						}
					}
					output.add(outputStr);
				} else {
					break;
				}
			}
			for (StringBuilder string : output) {
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
