package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoStringsWhetherTheyAreAnagram {

	public static void main(String[] args) {

		System.out.print("Enter first string: ");
		Scanner scanner = new Scanner(System.in);
		String firstString = scanner.nextLine();
	
		System.out.print("Enter second string: ");
		String secondString = scanner.nextLine();

		checkAnagram(firstString, secondString);

		if (checkAnagram(firstString, secondString) == false) {
			System.out.println("Not Anagram");
		} else {
			System.out.println("Anagram");
		}

	}

	public static boolean checkAnagram(String a, String b) {

		//to remove all the occurrences of white spaces we need to use :\\s with empty space :""
		String s1 = a.replaceAll("\\s", "");
		String s2 = b.replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
			return false;
		} 
		
		else {

			char[] firstArray = s1.toLowerCase().toCharArray();
			char[] secondArray = s2.toLowerCase().toCharArray();

			Arrays.sort(firstArray);
			Arrays.sort(secondArray);

			return Arrays.equals(firstArray, secondArray);
		}
	}
}
