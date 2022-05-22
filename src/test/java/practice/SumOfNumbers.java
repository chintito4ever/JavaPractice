package practice;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int sum = 10;

		for (int i = 0; i < a.length; i++) {
			
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i]+a[j]==sum) {
					
				System.out.println(a[i]+","+a[j]);
				
				}

			}
		}

	}

}
