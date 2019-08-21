package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExamRedistribution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
            String output = "";
            int n = sc.nextInt();
            String[] dizi = sc.next().split(" ");
            List<Integer> list = new ArrayList<>();
            for(String temp : dizi) {
                list.add(Integer.parseInt(temp));
            }
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                if (max == 0) {
                    max = list.stream()
                              .mapToInt(v -> v)
                              .max().orElseThrow(NoSuchElementException::new);
                    output += (list.indexOf(max) + 1) + " ";
                    list.set(list.indexOf(max), 0);
                    int toplam = 0;
                    for (int j = 0; j < list.size(); j++) {
                        toplam += list.get(j);
                    }
                    if (max > toplam) {
                        System.out.println("impossible");
                        System.exit(0);
                    }
                } else {
                    max = list.stream()
                              .mapToInt(v -> v)
                              .max().orElseThrow(NoSuchElementException::new);
                    output += (list.indexOf(max) + 1) + " ";
                    list.set(list.indexOf(max), 0);
                }
            }
            System.out.println(output.substring(0, output.length() - 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}