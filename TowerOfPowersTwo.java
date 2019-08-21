package com.kattis;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TowerOfPowersTwo {
    static HashMap<Integer, BigInteger> integers = new HashMap<>();
    static List<TypeList> entries = new ArrayList<>();
    static Integer UST_DEGER = 63;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"))) {
            int m = sc.nextInt();
            for (int index = 0; index < m; index++) {
                String entry = sc.next();
                int overflow = 0;
                String[] dizi = entry.split("\\^");
                Integer taban = Integer.parseInt(dizi[0]);
                Integer us = 1;
                if (taban != 1) {
                    if (dizi.length >= 3) {
                    	us = Integer.parseInt(dizi[dizi.length - 1]);
                    	for (int j = dizi.length; j > 2; j--) {
                    		us = (int) Math.pow(Double.parseDouble(dizi[j - 2]), us.doubleValue());
                    		while(us >= 6) {
    							us /= Integer.parseInt(dizi[j - 2]);
    							overflow++;
    						}
                        }
                    } else if (dizi.length == 2) {
                    	taban = (int) Math.pow(Double.parseDouble(dizi[0]), Double.parseDouble(dizi[1]));
                    }
				}
                Float temp = (float) Math.pow(taban.doubleValue(), us.doubleValue());
                while (temp >= Integer.MAX_VALUE) {
					temp /= Integer.MAX_VALUE;
					overflow++;
				}
                entries.add(new TypeList(index, temp.intValue(), entry, overflow));
            }
            entries.sort(Comparator.comparing(TypeList::getOverflow)
            		.thenComparing(Comparator.comparing(TypeList::getTotal)));
            for (TypeList temp : entries) {
                System.out.println(temp.getEntry());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
class TypeList {
	Integer index;
	Integer total;
	String entry;
	Integer overflow;
	
	public TypeList(Integer index, Integer total, String entry, Integer overflow) {
		this.index = index;
		this.total = total;
		this.entry = entry;
		this.overflow = overflow;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public Integer getOverflow() {
		return overflow;
	}

	public void setOverflow(Integer overflow) {
		this.overflow = overflow;
	}
}