package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeartRate {

	public static void main(String[] args) {
		List<Integer> b = new ArrayList<>();
		List<Double> p = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int x = sc.nextInt();
			for (int i = 0; i < x; i++) {
				String str = sc.next();
				b.add(Integer.parseInt(str.split(" ")[0]));
				p.add(Double.parseDouble(str.split(" ")[1]));
			}
			for (int i = 0; i < b.size(); i++) {
				System.out.println(((60 * b.get(i) / p.get(i)) - (60 / p.get(i))) + " " 
						+ (60 * b.get(i) / p.get(i)) + " " 
						+ ((60 * b.get(i) / p.get(i)) + (60 / p.get(i))));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
