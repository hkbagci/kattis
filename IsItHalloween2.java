package com.kattis;

import java.util.Date;
import java.util.Scanner;

public class IsItHalloween2 {

	public static void main(String[] args) {
		String ay = "";
		int gun = 0;
	    try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			while (true) {
				if (sc.hasNextLine()) {
					String str = sc.next();
					String[] temp = str.split(" ");
					ay = temp[0];
					gun = Integer.parseInt(temp[1]);
				} else {
					break;
				}
			}
			Date date = new Date();
			boolean gecerli = (("JAN".equals(ay) || "MAR".equals(ay) || "MAY".equals(ay) || "JUL".equals(ay) 
					|| "AUG".equals(ay) || "OCT".equals(ay) || "DEC".equals(ay)) && gun >= 1 && gun <= 31) 
					|| (("APR".equals(ay) || "JUN".equals(ay) || "SEP".equals(ay) || "NOV".equals(ay)) 
							&& gun >= 1 && gun <= 30) 
					|| ("FEB".equals(ay) && gun >= 1 && (((date.getYear() + 1900) % 4 == 0&& gun >= 1 && gun <= 29) 
							|| ((date.getYear() + 1900) % 4 != 0 && gun >= 1 && gun <= 28)));
			if (gecerli) {
				if (ay.equals("OCT") && (gun == 25 || gun == 31)) {
					System.out.println("yup");
				} else {
					System.out.println("nope");
				}
			} else {
				System.exit(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}