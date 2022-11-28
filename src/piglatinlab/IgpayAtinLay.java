package piglatinlab;

import java.util.Scanner;

public class IgpayAtinLay {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a word to convert to pig latin: ");
		
		String userInput = scan.nextLine();
		
		System.out.println(translate(userInput));
						
	}
	
	
	public static boolean isVowel(char ch) {
		return (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u');
	}
	
	public static String translate(String userInput) {
		String IgpayAtinLay1 = userInput.toLowerCase();
		
		int stringLength=IgpayAtinLay1.length();
		
		if(isVowel(userInput.charAt(0))) {
			IgpayAtinLay1 = IgpayAtinLay1 + "way";
		} else {		
		for (int i = 1; i < stringLength; i++) {
			if (isVowel(IgpayAtinLay1.charAt(i))) {
			IgpayAtinLay1 = IgpayAtinLay1.substring(i) + IgpayAtinLay1.substring(0, i) + "ay";
			break;
				}
			}
		}
		return IgpayAtinLay1;
	}
	
}


