package practice;

import java.util.Scanner;

public class Account {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myObj = new Account();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		myObj.setName(input.nextLine());
		
		System.out.println("Enter Age: ");
		myObj.setAge(input.nextInt());
		
		System.out.println(myObj.getName() + ", " + myObj.getAge());

	}

}
