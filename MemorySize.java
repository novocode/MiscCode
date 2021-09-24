package com.revature.misc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MemorySize {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String initialMemory = in.nextLine();
		String memorySizeSymbol = initialMemory.substring(initialMemory.length() - 2);
		initialMemory = initialMemory.substring(0, initialMemory.length() - 2);
		Double initialSize = Double.parseDouble(initialMemory);
		Double actualSize = initialSize - initialSize*0.07;
		if(actualSize < 1) {
			if(memorySizeSymbol.equals("GB")) {
				memorySizeSymbol = "MB";				
			}
			else if(memorySizeSymbol.equals("MB")) {
				memorySizeSymbol = "KB";				
			}
			actualSize *= 1000;
		}
		DecimalFormat formatter;
		if(memorySizeSymbol.equals("MB") || memorySizeSymbol.equals("KB")) {
			formatter = new DecimalFormat("#");			
		}
		else
			formatter = new DecimalFormat("#0.00");
		System.out.println(formatter.format(actualSize) + memorySizeSymbol);
	}
}
