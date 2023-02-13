package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {

		System.out.print("Enter first word: ");
		Scanner scanner = new Scanner(System.in);

		String firstWord = scanner.nextLine();
		firstWord = firstWord.toLowerCase().trim().replaceAll(" ", "");

		System.out.print("Enter second word: ");

		String secondWord = scanner.nextLine();
		secondWord = secondWord.toLowerCase().trim().replaceAll(" ", "");

		if (firstWord.length() != secondWord.length()) {
			System.out.println("Not anagram");
		}

		else {

			char[] arrayFirst = firstWord.toCharArray();
			char[] arraySecond = secondWord.toCharArray();

			Arrays.sort(arrayFirst);
			Arrays.sort(arraySecond);

				if (Arrays.equals(arrayFirst, arraySecond) == true) {
					System.out.println("Anagram");
				} 
			
				else {
					System.out.println("Not anagram");
				}
		}

	}

}
