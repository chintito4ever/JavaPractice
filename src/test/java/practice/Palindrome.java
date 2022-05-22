package practice;

public class Palindrome {

	static boolean isPalindrome(String str) {

		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.codePointAt(j))
				return false;

			i++;
			j--;
		}

		return true;

	}

	public static void main(String[] args) {

		String str = "Mom";

		str = str.toLowerCase();

		if (isPalindrome(str))

			System.out.println(str + " IS a Palindrome");

		else

			System.out.println(str + " IS NOT a Palindrome");

	}

}
