package com.kattis;

import java.util.Date;
import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		final long ONE_MINUTE_IN_MILLIS = 60000;//millisecs
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))){
			while (true) {
				if (sc.hasNext()) {
					Date date = new Date();
					String giris = sc.next();
					String[] temp = giris.split(" ");
					int x = Integer.parseInt(temp[0]);
					int y = Integer.parseInt(temp[1]);
					if (x >= 0 && x < 24 && y >= 0 && y <= 60) {
						date.setHours(x);
						date.setMinutes(y);
						date.setSeconds(0);
					    long curTimeInMs = date.getTime();
					    Date afterAddingMins = new Date(curTimeInMs - (45 * ONE_MINUTE_IN_MILLIS));
					    System.out.println(afterAddingMins.getHours() + " " + afterAddingMins.getMinutes());
					} else {
						System.exit(0);
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
