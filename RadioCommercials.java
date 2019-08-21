package com.kattis;

import java.util.Scanner;

public class RadioCommercials {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
        	String[] giris = sc.next().split(" ");
        	int n = Integer.parseInt(giris[0]);
        	int p = Integer.parseInt(giris[1]);
        	giris = sc.next().split(" ");
        	int[] dizi = new int[n];
        	for (int i = 0; i < n; i++) {
        		dizi[i] = Integer.parseInt(giris[i]) - p;
        	}
        	int azami = dizi[0];
        	int toplam = dizi[0];
        	for (int i = 0; i < dizi.length; i++) {
        		if (azami < 0) {
					azami = dizi[i];
				} else {
					azami += dizi[i];
				}
        		
        		if (azami >= toplam) {
					toplam = azami;
				}
        	}
        	System.out.println(toplam);
        } catch (Exception e) {
			e.printStackTrace();
		}
	}

}