package codingCal;

import java.util.Scanner;

public class finalUni {

	public static void main(String[] args) {

		String word1;
		String word2;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your first word?");
		word1 = scanner.nextLine();

		System.out.println("And your second word?");
		word2 = scanner.nextLine();

		System.out.println();


		int sumWord1 = 0;
		int sumWord2 = 0;
		int finalInt;
		
		for (int i = 0; i < word1.length(); i++) {
			finalInt = (int) word1.charAt(i);
			System.out.println(word1.charAt(i) + " = " + finalInt);
			sumWord1 += finalInt;

		}
		
		for (int i = 0; i < word2.length(); i++) {
			finalInt = (int) word2.charAt(i);
			System.out.println(word2.charAt(i) + " = " + finalInt);
			sumWord2 += finalInt;
		}
	
		System.out.println();

		int resultAbsVal = Math.abs(sumWord1 - sumWord2);

		System.out.println("The sum of the your first word is: " + sumWord1);
		System.out.println("The sum of the your second word is: " + sumWord2);

		System.out.println();

		System.out.println("Your absolute value difference on your word is: " + resultAbsVal);

		scanner.close();
		

	}

}

