package JavaInterviewQuestions;

import java.util.Scanner;

public class stringRepeatation {

	public static void main(String[] args) {

		String str = "java programming is very easy";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}

		System.out.println("number of occurances of the given letter: " + count);

		{
			String str1;
			int i;
			int counter[] = new int[256];
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please enter a string: ");
			// reading a string from the user
			str1 = scanner.nextLine();
			// finds the length of the string

			// loop through the string and count frequency of every character and store it
			// in counter array
			for (i = 0; i < str1.length(); i++) {
				counter[str1.charAt(i)]++;
			}
			// print Frequency of characters
			for (i = 0; i < 256; i++) {
				if (counter[i] != 0) {
					// prints frequency of characters
					System.out.println((char) i + " --> " + counter[i]);
				}
			}
		}

	}
}
