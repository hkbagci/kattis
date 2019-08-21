package com.kattis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WhatDoesTheFoxSay {

	public static void main(String[] args) {
		List<String> sounds = new ArrayList<>();
		List<String> testCases = new ArrayList<>();
		List<List<String>> testArray = new ArrayList<>();
		String output = "";
		try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
			sc.nextInt();
			boolean gecici = true;
			while (true) {
				if (sc.hasNext()) {
					if (gecici) {
						testCases.add(sc.next());
					}
					String str = sc.next();
					if (!str.equals("what does the fox say?")) {
						sounds.add(str.split(" ")[2]);
						gecici = false;
					} else {
						for (String string : testCases) {
							String temp[] = string.split(" ");
							List<String> tempStringArray = new ArrayList<>();
							for (String string2 : temp) {
								tempStringArray.add(string2);
							}
							testArray.add(tempStringArray);
						}
						
						Iterator<List<String>> i = testArray.iterator();
						while(i.hasNext()) {
							List<String> temp = i.next();
							Iterator<String> j = temp.iterator();
							while(j.hasNext()) {
								String temp2 = j.next();
								for (String string : sounds) {
									if (string.equals(temp2)) {
										j.remove();
									}
								}
							}
						}
						
						for (List<String> tempList : testArray) {
							for (String temp : tempList) {
								output += temp + " ";
							}
						}
						System.out.println(output.trim());
						
						sounds = new ArrayList<>();
						testCases = new ArrayList<>();
						testArray = new ArrayList<>();
						
						output = "";
						
						gecici = true;
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
