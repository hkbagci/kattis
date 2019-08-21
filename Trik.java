package com.kattis;

import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String str = sc.next();
			int[] array = {1, 0, 0};
			for (Character c : str.toCharArray()) {
				if (c.equals('A')) {
					int temp = array[0];
					array[0] = array[1];
					array[1] = temp;
				} else if (c.equals('B')) {
					int temp = array[1];
					array[1] = array[2];
					array[2] = temp;
				} else if (c.equals('C')) {
					int temp = array[0];
					array[0] = array[2];
					array[2] = temp;
				}
			}
			for (int i = 0; i < array.length; i++) {
				if (array[i] == 1) {
					System.out.println(i + 1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
