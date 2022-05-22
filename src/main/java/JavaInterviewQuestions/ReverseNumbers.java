package JavaInterviewQuestions;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers:");
		int num = sc.nextInt();

		// 1. Using while loop
		/*
		 * int rev = 0; while (num != 0) {
		 * 
		 * rev = rev * 10 + num % 10; num = num / 10; }
		 */

		// 2. Using StringBuilder method
		StringBuilder sb = new StringBuilder(String.valueOf(num));

		StringBuilder rev = sb.reverse();
		System.out.println("Reverse number: " + rev);

		// 3. Using StringBuilder or StringBuffer method
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev1 = sb1.reverse();
		System.out.println("Reverse number: " + rev1);

	}

}
