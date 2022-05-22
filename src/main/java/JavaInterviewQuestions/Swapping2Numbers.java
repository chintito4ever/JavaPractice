package JavaInterviewQuestions;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		System.out.println("Before swapping the number.. " + a + " " + b);

		// 1.Using 3rd variable

		/*
		 * int t = a; // 10 a = b; // 20 b = t; // 10
		 */

		// 2.Without 3rd variable. Using + - sign

		/*
		 * a = a + b; b = a - b; a = a - b;
		 */

		// 3.Using * & / method. Number should not be 0;
		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After swapping the number.. " + a + " " + b);

	}

}
