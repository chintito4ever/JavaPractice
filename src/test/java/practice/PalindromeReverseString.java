package practice;

public class PalindromeReverseString {

	public static void main(String[] args) {

		String text = "Mom".toLowerCase();
		String rev = "";

		for (int i = (text.length() - 1); i >= 0; i--) {
			System.out.print(text.charAt(i));

			rev = rev + text.charAt(i);
		}
		if (text.equals(rev)) {

			System.out.println(" Palindrome String");

		} else {

			System.out.println(" Not a palindrome String");
		}
	}
}
