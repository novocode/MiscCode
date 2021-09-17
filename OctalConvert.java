package com.revature.misc;

import java.util.Scanner;

public class OctalConvert {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int valueToConvert = in.nextInt();
		int powerOfTen = 1;
		int convertedNumber = 0;
		while(valueToConvert>0){
			int remainder = valueToConvert%8;
			convertedNumber = convertedNumber + remainder*powerOfTen; 
			valueToConvert /= 8;			
			powerOfTen *= 10;
		}
		System.out.print(convertedNumber);
	}
}
