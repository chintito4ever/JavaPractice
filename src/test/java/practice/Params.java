package practice;

import java.util.Scanner;

public class Params {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//saySomething("Asif");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		saySomething(input.nextInt(), input.nextInt());

	}
	
	public static void saySomething(int x, int y) {
		System.out.println(x + y);
	}

}
