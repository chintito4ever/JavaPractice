package JavaInterviewQuestions;

public class SplitString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Java, Selenium, TestNg, Cucumber";
		String[] str = s1.split("[, ]+");

		for (String i : str)
			System.out.print(i);

		String country = new String("United States of America");
		String[] split = country.split("");

		for (String j : split)
			System.out.println(j);
		/*
		 * for (int i = 0; i < s.length; i++) { System.out.println(s[i]);
		 */

	}
}
