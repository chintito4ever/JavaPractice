package practice;

import java.util.Scanner;

public class RecursionInFibonacci {
	
	static int fib(int n) {
		
		if (n <= 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input Fib number: ");
		int N = input.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print(fib(i)+ " ");
		}
	}
	

}
