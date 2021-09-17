package com.revature.misc;

import java.util.Scanner;

public class EncryptMessage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String messageToEncrypt = in.nextLine();
		char[] messageArray = messageToEncrypt.toCharArray();
		for(int i = 0; i < messageArray.length; i++) {
			if(messageArray[i] >= 'A' && messageArray[i] <= 'M')
				messageArray[i] += 13;
			else if(messageArray[i] >= 'N' && messageArray[i] <= 'Z')
				messageArray[i] -= 13;
			else if(messageArray[i] >= 'a' && messageArray[i] <= 'm')
				messageArray[i] += 13;
			else if(messageArray[i] >= 'n' && messageArray[i] <= 'z')
				messageArray[i] -= 13;
		}
		messageToEncrypt = new String(messageArray);
		System.out.print(messageToEncrypt);
	}
}
