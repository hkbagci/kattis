package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KittenOnATree {

	public static void main(String[] args) {
		List<String[]> tree = new ArrayList<>();
		List<String> path = new ArrayList<>();
		String output = "";
        try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
        	int k = sc.nextInt();
        	while (true) {
				if (sc.hasNext()) {
					tree.add(sc.next().split(" "));
					if (tree.get(0)[0].equals("-1")) {
						break;
					}
				} else {
					break;
				}
			}
			for (int i = 0; i < tree.size(); i++) {
				for (int j = 1; j < tree.get(i).length; j++) {
					if (tree.get(i)[j].equals(String.valueOf(k))) {
						path.add(tree.get(i)[j]);
						k = Integer.parseInt(tree.get(i)[0]);
						i = -1;
						break;
					}
				}
			}
			
			path.add(String.valueOf(k));
			
			for (String string : path) {
				output += string + " ";
			}
			
			System.out.println(output.substring(0, output.length() - 1));
        } catch (Exception e) {
			e.printStackTrace();
		}
	}

}