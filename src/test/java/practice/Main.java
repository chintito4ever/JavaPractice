package practice;

public class Main {

	public static void main(String[] args) {

		Car ch = new Car("Toyota", 2009, "Black");
		System.out.println("Model is " + ch.model + ", Model year is: " + ch.modelYear + ch.modelColor);

		Car.start();

		String salary = "1000";

		int salary2 = Integer.parseInt(salary);
		System.out.println(salary2);

		int a = 10;
		String b = String.valueOf(a);
		System.out.println(b);

	}

}
