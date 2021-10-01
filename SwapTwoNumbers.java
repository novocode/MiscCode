package com.revature.misc;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r1 = in.nextInt();
		int r2 = in.nextInt();
		System.out.println("Initial First: " + r1 + ", Initial Second: " + r2);
		r1 -= r2;
		r2 += r1;
		r1 = r2 - r1;

		System.out.println("Swapped First: " + r1 + ", Swapped Second: " + r2);
	}
}
