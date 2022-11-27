package piglatinlab;

import java.util.Scanner;

public class IgpayAtinLay {
	
	
	public static boolean isVowel(char ch) {
		return (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u');
	}
	
	public static String translate(String userInput) {
		String IgpayAtinLay1 = userInput.toLowerCase();
		
		int stringlength=IgpayAtinLay1.length();
		
		int index = -1;
		
		for (int i = 0; i < stringlength; i++) {
			if (isVowel(IgpayAtinLay1.charAt(i))) {
				index = i;		
			}
			}
			if(index == -1) {
				return "-1";	
			
		}
			return IgpayAtinLay1.substring(index) + IgpayAtinLay1.substring(0, index) + "ay";
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a word to convert to pig latin: ");
		
		String word = scan.nextLine();
		
		System.out.println(translate(word));
		
		scan.close();
				
			}
	}


