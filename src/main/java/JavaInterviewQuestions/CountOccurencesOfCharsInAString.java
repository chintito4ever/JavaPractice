package JavaInterviewQuestions;

public class CountOccurencesOfCharsInAString {

	public static void main(String[] args) {

		String str = "java programming is very easy";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}

		System.out.println("number of occurances letter a :" + count);

	}

}
