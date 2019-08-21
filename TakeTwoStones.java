package com.kattis;

import java.util.Scanner;

public class TakeTwoStones {

    static int x, counter, sonuc;
    static StringBuilder input = new StringBuilder();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
            while (sc.hasNext()) {
                x = sc.nextInt();
                if (x < 1 && x > 10000000) {
                    System.exit(0);
                } else {
                    if (x % 2 != 0) {
                        System.out.println("Alice");
                        System.exit(0);
                    } else {
                        System.out.println("Bob");
                        System.exit(0);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}