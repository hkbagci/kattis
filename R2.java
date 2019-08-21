package com.kattis;

import java.util.Scanner;

public class R2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))){
			String str = sc.next();
			String temp[] = str.split(" ");
			int i = Integer.parseInt(temp[0]);
			int j = Integer.parseInt(temp[1]);
			System.out.println((j * 2) - i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
