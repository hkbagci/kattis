package com.kattis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			String str = sc.next();
			String dizi[] = str.split(" ");
			int gun = Integer.parseInt(dizi[0]);
			int ay = Integer.parseInt(dizi[1]);
			String gunStr = String.valueOf(gun);
			String ayStr = String.valueOf(ay);
			if (gun < 10) {
				gunStr = "0" + gun;
			}
			if (ay < 10) {
				ayStr = "0" + ay;
			}
			String tarih = gunStr + "/" + ayStr + "/" + 2009;
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(tarih);
			System.out.println(new SimpleDateFormat("EEEE").format(date));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
