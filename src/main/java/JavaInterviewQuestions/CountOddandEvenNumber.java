package JavaInterviewQuestions;

public class CountOddandEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 44477290;
		int even = 0;
		int odd = 0;

		while (a > 0) {
			int reminder = a % 10;

			if (reminder % 2 == 0) {
				even++;

			} else {
				odd++;
			}

			a = a / 10;
		}

		System.out.println("Even digit is " + even);
		System.out.println("Odd digit is " + odd);

	}

}
