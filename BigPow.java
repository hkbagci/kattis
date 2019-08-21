package com.kattis;

import java.math.BigInteger;

public class BigPow {

	public static void main(String[] args) {
		BigInteger result = (new BigInteger("2")).pow(27830457).add(BigInteger.ONE);
		System.out.println(result);
	}
}
