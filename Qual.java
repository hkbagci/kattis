package com.kattis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Qual {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			int N = -1;
			double result = 0;
			if (input.hasNext())
				N = input.nextInt();
			for (int i = 0; i < N; i++) {
					String[] line = input.next().split(" ");
					if (line.length == 2) {
						double a = Double.parseDouble(line[0]);
						double b = Double.parseDouble(line[1]);
						result = result + (double) a * b;
					}
			}

			DecimalFormat df = new DecimalFormat("###.000");
			System.out.println(df.format(result));
		} catch (Exception e) {
			e.printStackTrace();
		}



	}
}