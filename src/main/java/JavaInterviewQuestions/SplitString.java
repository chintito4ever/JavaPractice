package JavaInterviewQuestions;

public class SplitString {

	public static void main(String[] args) {

//		String str = "Asif, Nabi 859@42nd?St.Apt 1g";
//		String[] arrOfStr = str.split("[, ?.@]+");
//
//		for (String a : arrOfStr)
//			System.out.print(" " + a);
//
//		String str2 = "United States of America";
//		String[] arr = str2.split("[ ]+");
//
//		for (String b : arr)
//			System.out.println(b);

		String str = "GeeksforGeeks:A Computer Science Portal";
		String[] arrOfStr = str.split(":");

		for (String a : arrOfStr)
			System.out.println(a);
	}

}
