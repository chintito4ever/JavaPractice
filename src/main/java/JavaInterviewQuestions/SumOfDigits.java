package JavaInterviewQuestions;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num = 37220;
		long sum = 0;

		while (num > 0) {

			sum = sum + num % 10;

			num = num / 10;
		}

		System.out.println("Sum of digit is " + sum);

	}

}
