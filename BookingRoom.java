package com.kattis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BookingRoom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String str = sc.next();
			String dizi[] = str.split(" ");
			int d1 = Integer.parseInt(dizi[0]);
			int d2 = Integer.parseInt(dizi[1]);
			if (d1 < 0 || d1 > 100 || d2 < 0 || d2 > d1) {
				System.exit(0);
			}
			List<Integer> odalar = new ArrayList<>();
			List<Integer> sayilar = new ArrayList<>();
			for (int i = 0; i < d2; i++) {
				sayilar.add(sc.nextInt());
				if (d1 < sayilar.get(i)) {
					System.exit(0);
				}
			}
			for (int i = 0; i < d1; i++) {
				odalar.add(i + 1);
			}
			Iterator<Integer> temp = odalar.iterator();
			while (temp.hasNext()) {
	            Integer i = temp.next();
				for (int j : sayilar) {
					if (j == i) {
						temp.remove();
					}
				}
			}
			if (d2 == 0) {
				System.out.println(new Random().nextInt(d1) + 1);
			} else if (d1 == d2) {
				System.out.println("too late");
			} else {
				System.out.println(odalar.get(new Random().nextInt(odalar.size())));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
