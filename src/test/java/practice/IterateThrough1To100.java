package practice;

public class IterateThrough1To100 {
	
	// Iterate through number 1 to 100.  If the number is divisible by 3 print an output "Divisible by 3."

	public static void main(String[] args) {

		System.out.println("\nDivisible by 3: ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0)
				System.out.print(i + ", ");
		}

		System.out.println("\n\nDivided by 5: ");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0)
				System.out.print(i + ", ");
		}

		System.out.println("\n\nDivided by 3 & 5: ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print(i + ", ");
		}
		System.out.println("\n");
	}

}
