package palindrome;

import java.util.Scanner;

public class PalindromeUsingStringBuilder {

	public static void main(String[] args) {

		String name = "Mom";
		// name = name.toLowerCase();
		StringBuilder rev = new StringBuilder(name).reverse();

		System.out.println(rev);

		if (name.equalsIgnoreCase(rev.toString())) {
			System.out.println(name + " is a Palindrome");
		} else {
			System.out.println(name + " is not a Palindrome");
		}

		// Can check both string and number Palindrome

		String original;
		String reverse = ""; // Objects of String class

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equalsIgnoreCase(reverse))

			System.out.println("Entered string/number is a palindrome.");

		else
			System.out.println("Entered string/number isn't a palindrome.");

	}

}
