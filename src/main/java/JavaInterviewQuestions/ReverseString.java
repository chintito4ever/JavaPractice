package JavaInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Miraz Nabi";
		String rev = "";

		// 1.Using for loop
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		System.out.println(rev);

		// 2.Using StringBuffer

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
