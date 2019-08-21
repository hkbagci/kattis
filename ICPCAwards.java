package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ICPCAwards {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int x = sc.nextInt();
			String[] dizi = new String[x];
			List<String> uni = new ArrayList<>();
			List<String> sonuc = new ArrayList<>();
			for (int i = 0; i < x; i++) {
				dizi[i] = sc.next();
				if (sonuc.size() < 1) {
					uni.add(dizi[i].split(" ")[0]);
					sonuc.add(dizi[i]);
				} else {
					if (!uni.contains(dizi[i].split(" ")[0])) {
						uni.add(dizi[i].split(" ")[0]);
						sonuc.add(dizi[i]);
					}
				}
			}
			for (int i = 0; i < 12; i++) {
				System.out.println(sonuc.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
