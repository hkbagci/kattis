package com.kattis;

import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		String str = "", sonuc = "";
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))){
			while (true) {
				if (sc.hasNext()) {
					str = sc.next();
					if (str.length() <= 100) {
						String[] dizi = str.split("-");
						for (String temp : dizi) {
							if (Character.isUpperCase(temp.charAt(0))) {
								sonuc += String.valueOf(temp.charAt(0));
								int i = 0;
								for (char c : temp.toCharArray()) {
									if (i != 0 && !Character.isLowerCase(c)) {
										System.exit(0);
									}
									i++;
								}
							} else {
								System.exit(0);
							}
						}
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
