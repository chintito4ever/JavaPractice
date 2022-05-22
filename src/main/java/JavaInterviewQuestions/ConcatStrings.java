package JavaInterviewQuestions;

public class ConcatStrings {

	public static void main(String[] args) {

		String fName = "Asif";
		String lName = "Nabi";
		String surname = "Asi";

		// 1. Using concat() method

		String fullName = fName.concat(lName).concat(surname);

		System.out.println(fullName);
		System.out.println(fName + " " + lName);

		// 2. Using StringBuffer class and append() method

		StringBuffer s = new StringBuffer(fName);
		StringBuffer newname = s.append(lName).append(surname);
		System.out.println(newname);

	}

}
